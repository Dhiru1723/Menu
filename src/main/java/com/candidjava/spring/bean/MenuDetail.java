package com.candidjava.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuDetails")
public class MenuDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pkey;
	private String label;
	private String ktype;
	private String url;
	private int wt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public String getPkey() {
		return pkey;
	}

	public void setPkey(String pkey) {
		this.pkey = pkey;
	}

	public String getKtype() {
		return ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

}
