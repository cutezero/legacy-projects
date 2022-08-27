import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.sl.TestBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean=(TestBean)ctx.getBean("tb");
		Scanner s=new Scanner(System.in);
		int empNo=s.nextInt();
		System.out.println("Enter Employee Id: ");
		testBean.readBonus(empNo);

	}

}
