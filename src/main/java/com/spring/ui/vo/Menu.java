package com.spring.ui.vo;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
	
	private String label;
	private String ktype;
	private String url;
	private int wt;
	List<Menu> childMenuList;
	private String pkey;
	

	public String getPkey() {
		return pkey;
	}

	public void setPkey(String pkey) {
		this.pkey = pkey;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getKtype() {
		return ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		this.wt = wt;
	}

	public List<Menu> getChildMenuList() {
		return childMenuList;
	}

	public void setChildMenuList(List<Menu> childMenuList) {
		this.childMenuList = childMenuList;
	}

}
