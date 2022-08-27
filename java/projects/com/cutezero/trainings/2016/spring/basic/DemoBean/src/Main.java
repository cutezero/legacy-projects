import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biju.Demmo;

public class Main {

	public static void main(String[] args)
	{
    ApplicationContext ctx=new ClassPathXmlApplicationContext("configuration/configuration.xml");
    Object o=ctx.getBean("demmo");
    
    
    Demmo d1=(Demmo)o;
    
    d1.showTheMap();
    d1.showTheList();
    
    
	}

}
