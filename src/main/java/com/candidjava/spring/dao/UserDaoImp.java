package com.candidjava.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.candidjava.spring.bean.MenuDetail;
import com.candidjava.spring.bean.MenuMappings;

@Repository
@Transactional
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<MenuDetail> getMenuDetail() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<MenuDetail> list = session.createCriteria(MenuDetail.class).list();
		return list;
	}

	@Override
	public List<MenuMappings> getMenuMappings() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<MenuMappings> list = session.createCriteria(MenuMappings.class).list();
		return list;
	}
	
	@Override
	public void addMenuDetail (MenuDetail md ) {
		Session session = sessionFactory.getCurrentSession();
		session.save(md);
	}
	
	@Override
	public void addMenuMappings (MenuMappings mm ) {
		Session session = sessionFactory.getCurrentSession();
		session.save(mm);
	}

	public void addMenuDetail() {
		Session session = sessionFactory.getCurrentSession();
		MenuDetail md = new MenuDetail();
		md.setPkey("ADM");
		md.setLabel("Admin");
		md.setKtype("M");
		md.setUrl(null);
		md.setWt(1);
		session.save(md);
		
		Session session2 = sessionFactory.getCurrentSession();
		MenuDetail md2 = new MenuDetail();
		md2.setPkey("CBO");
		md2.setLabel("Caiso Bundle Order");
		md2.setKtype("M");
		md2.setUrl(null);
		md2.setWt(2);
		session2.save(md2);

		Session session3 = sessionFactory.getCurrentSession();
		MenuDetail md3 = new MenuDetail();
		md3.setPkey("EST");
		md3.setLabel("Enterprise Site Types ");
		md3.setKtype(null);
		md3.setUrl("/enterpriseinsights/sitetypecreation");
		md3.setWt(1);
		session3.save(md3);

		Session session4 = sessionFactory.getCurrentSession();
		MenuDetail md4 = new MenuDetail();
		md4.setPkey("EU");
		md4.setLabel("Enterprise User");
		md4.setKtype(null);
		md4.setUrl("/enterpriseinsights/entuser");
		md4.setWt(1);
		session4.save(md4);

		Session session5 = sessionFactory.getCurrentSession();
		MenuDetail md5 = new MenuDetail();
		md5.setPkey("ES");
		md5.setLabel("Enterprise Sites");
		md5.setKtype(null);
		md5.setUrl("/enterpriseinsights/sitecreation");
		md5.setWt(1);
		session5.save(md5);

		Session session6 = sessionFactory.getCurrentSession();
		MenuDetail md6 = new MenuDetail();
		md6.setPkey("CAT");
		md6.setLabel("CATALOGUE");
		md6.setKtype(null);
		md6.setUrl(null);
		md6.setWt(1);
		session6.save(md6);

		Session session7 = sessionFactory.getCurrentSession();
		MenuDetail md7 = new MenuDetail();
		md7.setPkey("STO");
		md7.setLabel("SITE ORDER");
		md7.setKtype(null);
		md7.setUrl("/enterpriseinsights/neworder/bundleorder");
		md7.setWt(1);
		session7.save(md7);

		Session session8 = sessionFactory.getCurrentSession();
		MenuDetail md8 = new MenuDetail();
		md8.setPkey("CPED");
		md8.setLabel("CPE Device");
		md8.setKtype(null);
		md8.setUrl("/enterpriseinsights/devicecreation");
		md8.setWt(1);
		session8.save(md8);

		Session session9 = sessionFactory.getCurrentSession();
		MenuDetail md9 = new MenuDetail();
		md9.setPkey("MS");
		md9.setLabel("Managed Service");
		md9.setKtype(null);
		md9.setUrl("/enterpriseinsights/managedservice");
		md9.setWt(1);
		session9.save(md9);

		Session session10 = sessionFactory.getCurrentSession();
		MenuDetail md10 = new MenuDetail();
		md10.setPkey("AC");
		md10.setLabel("Access Circuit");
		md10.setKtype(null);
		md10.setUrl("/enterpriseinsights/accesscircuit");
		md10.setWt(1);
		session10.save(md10);

		Session session11 = sessionFactory.getCurrentSession();
		MenuDetail md11 = new MenuDetail();
		md11.setPkey("EF");
		md11.setLabel("Enterprise Firewall");
		md11.setKtype(null);
		md11.setUrl("/enterpriseinsights/firewall");
		md11.setWt(1);
		session11.save(md11);

		Session session12 = sessionFactory.getCurrentSession();
		MenuDetail md12 = new MenuDetail();
		md12.setPkey("DEV");
		md12.setLabel("Device");
		md12.setKtype(null);
		md12.setUrl("/enterpriseinsights/deviceconfig");
		md12.setWt(1);
		session12.save(md12);

		Session session13 = sessionFactory.getCurrentSession();
		MenuDetail md13 = new MenuDetail();
		md13.setPkey("SER");
		md13.setLabel("Service ");
		md13.setKtype(null);
		md13.setUrl("/enterpriseinsights/serviceconfig");
		md13.setWt(1);
	session13.save(md13);

		Session session14 = sessionFactory.getCurrentSession();
		MenuDetail md14 = new MenuDetail();
		md14.setPkey("CONF");
		md14.setLabel("CONFIGURATION ");
		md14.setKtype(null);
		md14.setUrl(null);
		md14.setWt(1);
	session14.save(md14);

	}

	public void addMenuMappings() {
		Session session = sessionFactory.getCurrentSession();

		MenuMappings mm1 = new MenuMappings();
		mm1.setMenu("ADM");
		mm1.setSubmenu("EST");
	session.save(mm1);

		Session session2 = sessionFactory.getCurrentSession();
		MenuMappings mm2 = new MenuMappings();
		mm2.setMenu("ADM");
		mm2.setSubmenu("EU");
		session2.save(mm2);

		Session session3 = sessionFactory.getCurrentSession();
		MenuMappings mm3 = new MenuMappings();
		mm3.setMenu("ADM");
		mm3.setSubmenu("ES");
		session3.save(mm3);

		Session session4 = sessionFactory.getCurrentSession();
		MenuMappings mm4 = new MenuMappings();
		mm4.setMenu("ADM");
		mm4.setSubmenu("CAT");
		session4.save(mm4);

		

		Session session7 = sessionFactory.getCurrentSession();
		MenuMappings mm7 = new MenuMappings();
		mm7.setMenu("CAT");
		mm7.setSubmenu("AC");
		session7.save(mm7);
		
		Session session8 = sessionFactory.getCurrentSession();
		MenuMappings mm8 = new MenuMappings();
		mm8.setMenu("CAT");
		mm8.setSubmenu("EF");
		session8.save(mm8);
		
		Session session9 = sessionFactory.getCurrentSession();
		MenuMappings mm9 = new MenuMappings();
		mm9.setMenu("CONF");
		mm9.setSubmenu("DEV");
		session9.save(mm9);
		
		Session session10 = sessionFactory.getCurrentSession();
		MenuMappings mm10 = new MenuMappings();
		mm10.setMenu("CONF");
		mm10.setSubmenu("SER");
		session10.save(mm10);
		
		Session session5 = sessionFactory.getCurrentSession();
		MenuMappings mm5 = new MenuMappings();
		mm5.setMenu("CAT");
		mm5.setSubmenu("CPED");
		session5.save(mm5);

		Session session6 = sessionFactory.getCurrentSession();
		MenuMappings mm6 = new MenuMappings();
		mm6.setMenu("CAT");
		mm6.setSubmenu("MS");
		session6.save(mm6);
		

	}


}
