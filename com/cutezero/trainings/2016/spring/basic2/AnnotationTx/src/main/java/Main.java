

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.app.IEmpDao;

public class Main {

	public static void main(String...args){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpDao emp= (IEmpDao)ctx.getBean("empDaoImpl");
		
		try {
			emp.transactionMethod();
			System.out.println("completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
