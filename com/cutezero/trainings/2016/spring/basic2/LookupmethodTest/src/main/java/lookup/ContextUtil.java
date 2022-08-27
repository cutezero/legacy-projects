package lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
	
	private static ApplicationContext ctx;
	public static synchronized ApplicationContext getApplicationContext(){
		if (ctx==null){
			ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		
		return ctx;
	}
}
