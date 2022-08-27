import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfn.bo.TestBean;

public class Main {
	public static void main(String...args){
		ApplicationContext ctx= new AnnotationConfigApplicationContext(com.cfn.config.AppConfig.class);
		TestBean testBean=(TestBean)ctx.getBean("testBean");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Updating Sal W.R.T empno");
		System.out.println("Enter Empno: ");
		int empno=Integer.parseInt(s.nextLine());
		System.out.println("Enter Empsal: ");
		int empsal=Integer.parseInt(s.nextLine());
		
		testBean.modifyEmp(empno, empsal);
//		testBean.modifyEmp(1011,3456);
		System.out.println("====================");
		System.out.println("Enter deptno: ");
		int deptno=Integer.parseInt(s.nextLine());
		testBean.readEmps(deptno);
	}
}
