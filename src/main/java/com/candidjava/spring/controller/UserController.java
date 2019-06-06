package com.candidjava.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.candidjava.spring.bean.MenuDetail;
import com.candidjava.spring.bean.MenuMappings;
import com.candidjava.spring.service.UserService;
import com.spring.ui.vo.Menu;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	private SessionFactory sessionFactory;

	@GetMapping(value = "/my", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getUserById() {
		System.out.println("***********************  Test");
		/*
		 * userService.addMenuDetail(); userService.addMenuMappings();
		 */

		return new ResponseEntity<String>("Test", HttpStatus.OK);
	}

	@GetMapping(value = "/menu", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Menu> getMenuJson() {
		System.out.println("***********************  Menu");

		return this.execute();

	}

	private List<Menu> execute() {
		List<MenuDetail> mdlist = userService.getMenuDetail();
		List<MenuMappings> listMm = userService.getMenuMappings();

		List<Menu> lm = new ArrayList<Menu>();
		// for level 0
		for (MenuDetail md : mdlist) {
			if (md.getKtype() != null && md.getKtype().equalsIgnoreCase("M")) {
				Menu m = this.convertToMenu(md);
				lm.add(m);
			}

		}

		// for level 1

		for (Menu m : lm) {
			List<String> cl = this.searchMapping(m.getPkey(), listMm);
		
			for (String key : cl) {
				Menu cm = gettMenuByKey(key, mdlist);
				System.out.println("***************************  "+cm.getLabel());
				m.getChildMenuList().add(cm);
			}
		}

		// for level 2
		for (Menu m : lm) {
			for (Menu cm : m.getChildMenuList()) {

				List<String> cl = this.searchMapping(cm.getPkey(), listMm);
				for (String key : cl) {
					Menu ccm = gettMenuByKey(key, mdlist);
					cm.getChildMenuList().add(ccm);
				}

			}
		}
		return lm;
	}

	private Menu convertToMenu(MenuDetail md) {
		Menu m = new Menu();
		m.setKtype(md.getKtype());
		m.setLabel(md.getLabel());
		m.setUrl(md.getUrl());
		m.setWt(md.getWt());
		m.setChildMenuList(new ArrayList<Menu>());
		m.setPkey(md.getPkey());
		return m;
	}

	private Menu gettMenuByKey(String key, List<MenuDetail> mdlist) {
		for (MenuDetail md : mdlist) {
			if (md.getPkey().equalsIgnoreCase(key)) {
				return this.convertToMenu(md);
			}
		}
		return null;
	}

	private List<String> searchMapping(String key, List<MenuMappings> listMm) {
		List<String> list = new ArrayList<String>();
		for (MenuMappings mm : listMm) {
			if (mm.getMenu().equalsIgnoreCase(key)) {
				list.add(mm.getSubmenu());
			}

		}
		return list;

	}

}
