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
@ContextConfiguration(locations="classpath:config/test002.xml")
public class Test002 {
	@Autowired ApplicationContext context;
	
	
	@Test
	//@Ignore
	public void test1() {
		Animal ani2 = context.getBean("dog", Animal.class);
		
		assertEquals("Dog-eat", ani2.eat());
		assertEquals("Dog-sleep", ani2.sleep());
		assertEquals("Dog-poo", ani2.poo());

	}
	@Test
	@Ignore
	public void test2() {
		AnimalFarm farm = context.getBean("animalfarm", AnimalFarm.class);
		farm.print();
	}
	
}
