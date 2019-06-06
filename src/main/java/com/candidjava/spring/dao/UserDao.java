package com.candidjava.spring.dao;

import java.util.List;

import com.candidjava.spring.bean.MenuDetail;
import com.candidjava.spring.bean.MenuMappings;

public interface UserDao {
	public List<MenuDetail> getMenuDetail();
	public List<MenuMappings> getMenuMappings();
	void addMenuDetail() throws InterruptedException;
	void addMenuMappings();
	void addMenuDetail(MenuDetail md);
	void addMenuMappings(MenuMappings mm);
	
}
