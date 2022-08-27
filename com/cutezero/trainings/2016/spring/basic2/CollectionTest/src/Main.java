import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.beans.DemoBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/cfn/configuration/applicationContext.xml");
		Object o=ctx.getBean("demoBean");
		DemoBean db=(DemoBean)o;
		db.showTheList();
		System.out.println("==========================");
		db.showTheMap();

	}

}
