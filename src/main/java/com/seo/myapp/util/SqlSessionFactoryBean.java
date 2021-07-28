package com.seo.myapp.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {//SqlSession(DAO에 적용)를 SqlSessionFactory가 생성함
	private static SqlSessionFactory sessionFactory=null;
	static {
		if(sessionFactory==null) {
			try {
				Reader reader=Resources.getResourceAsReader("sql-map-config.xml");
				sessionFactory=new SqlSessionFactoryBuilder().build(reader);			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static SqlSession getSqlSessionInstace() {
		return sessionFactory.openSession();
	}
}
