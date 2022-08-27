import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.spring.beans.MyBean;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/cfn/spring/config/applicationContext.xml");
		MyBean mb=(MyBean)ctx.getBean("myBean");
		mb.sayHello();
		ctx.close();
	}

}
