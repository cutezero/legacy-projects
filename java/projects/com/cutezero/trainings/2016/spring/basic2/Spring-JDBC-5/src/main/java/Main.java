import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.bo.DemoBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoBean demo=(DemoBean)ctx.getBean("demoBean");
		demo.bm();

	}

}
