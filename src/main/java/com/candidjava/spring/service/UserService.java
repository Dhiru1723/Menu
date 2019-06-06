package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.MenuDetail;
import com.candidjava.spring.bean.MenuMappings;

public interface UserService {
	public List<MenuDetail> getMenuDetail();
	public List<MenuMappings> getMenuMappings();
	
	void addMenuDetail();
	void addMenuMappings();
}
