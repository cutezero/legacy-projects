import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfn.bo.TestBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(com.cfn.config.AppConfig.class);
		TestBean testBean=(TestBean)ctx.getBean("testBean");
		testBean.m1();
		System.out.println("===============");
		testBean.m2();
		System.out.println("===============");
		testBean.m3();

	}

}
