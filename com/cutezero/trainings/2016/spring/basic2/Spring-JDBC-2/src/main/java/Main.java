import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.bo.TestBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext");
		TestBean testBean=(TestBean)ctx.getBean("testbean");
		testBean.readEmps();
	}
}
