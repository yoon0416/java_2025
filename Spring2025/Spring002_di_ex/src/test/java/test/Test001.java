package test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.Animal;
import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/test001.xml")
public class Test001 {
	@Autowired ApplicationContext context;
	
	
	@Test
	@Ignore
	public void test1() {
		Animal ani1 = context.getBean("cat", Animal.class);
		
		assertEquals("Cat-eat", ani1.eat());
		assertEquals("Cat-sleep", ani1.sleep());
		assertEquals("Cat-poo", ani1.poo());

	}
	
	@Test
	//@Ignore
	public void test2() {
		AnimalFarm farm = context.getBean("animalfarm", AnimalFarm.class);
		farm.print();
	}
	
}
