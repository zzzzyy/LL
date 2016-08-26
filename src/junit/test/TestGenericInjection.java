package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.action.OrderAction;
import com.atguigu.spring.action.UserAction;

public class TestGenericInjection {

	ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
	//是
	@Test
	public void test() {
		UserAction userAction = (UserAction)ioc.getBean("userAction");
		userAction.saveUser();
		
		OrderAction orderAction = (OrderAction)ioc.getBean("orderAction");
		orderAction.saveOrder();
	}

}
