package com.candidjava.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.bean.MenuDetail;
import com.candidjava.spring.bean.MenuMappings;
import com.candidjava.spring.dao.UserDao;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public List<MenuDetail> getMenuDetail() {
		// TODO Auto-generated method stub
		return userDao.getMenuDetail();
	}

	@Override
	public List<MenuMappings> getMenuMappings() {
		// TODO Auto-generated method stub;
		return userDao.getMenuMappings();
	}

	@Override
	public void addMenuDetail() {
		try {
			userDao.addMenuDetail();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addMenuMappings() {
		userDao.addMenuMappings();

	}

}
