import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.sl.TestBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean test=(TestBean)ctx.getBean("testBean");
		test.persistEmp(7989, "PAN", 9588, 30);
		System.out.println("=======================");
		test.updateEmp(7989, "PAWAN", 7888, 30);	
		System.out.println("=======================");
		test.deleteEmp(12);
		System.out.println("=======================");
		test.selectEmps();
	}

}
