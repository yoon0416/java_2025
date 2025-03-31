package spring001_di;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.iotest.Calc;
import com.company.iotest.MyArea;

//1. Spring ioc �����̳� ����
//2. ���
@RunWith(SpringJUnit4ClassRunner.class) //1. spring ioc �����̳� ����
@ContextConfiguration( locations="classpath:config/beans002.xml" ) //2. �������ϰ��
public class JunitTest002 {
	@Autowired ApplicationContext context; //3. Bean (spring �����ϴ� ��ü)
	//         ApplicationContext - bean ���, ����, ��ȸ, ��ȯ����
	// @Autowired - ��ü�� �ִ��� �˻��ϰ� �ִٸ� �ڵ����� ����
	
	@Test 
	//@Ignore
	public void test1() {
		MyArea myarea = context.getBean("myArea",MyArea.class);
		// ����� assertEquals("����","ó���Ұ�");
		assertEquals("alpha>100.0",myarea.mycalc(10, 10));
	} //ctrl + f11
	
	@Test
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("myArea",MyArea.class);
		MyArea area2 = context.getBean("myArea",MyArea.class);
		// ����� assertEquals("area1","area2");
		assertEquals(area1, area2);
	}
	
}
