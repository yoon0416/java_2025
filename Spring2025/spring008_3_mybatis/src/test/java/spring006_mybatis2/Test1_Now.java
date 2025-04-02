package spring006_mybatis2;

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
public class Test1_Now {

    @Autowired ApplicationContext context;
    @Autowired DataSource datasource; //
    @Autowired TestDao dao;

    @Test
    @Ignore
    public void test0() {
        System.out.println(context);
    }

    @Test
    public void test1() {
        System.out.println(datasource);
    }
    @Test
    public void test2() {System.out.println(dao.now());}
    
   
}
