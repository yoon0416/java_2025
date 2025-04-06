package com.company.test;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test1_Datasource {
	
	@Autowired ApplicationContext context; //bean 积己-家戈 包府
	@Autowired DataSource ds;
	@Autowired TestDao dao;
	
	@Test
	@Ignore
	public void test1() {System.out.println(ds);}

	@Test
	public void test2() {System.out.println(dao.now());}
		

}
