package lookup;

import org.springframework.context.ApplicationContext;

public class MyThread1 extends Thread 
{	
	
	public void run()
	{
		ApplicationContext ctx=ContextUtil.getApplicationContext();
		College c1= (College)ctx.getBean("college");
		
		Student s1=c1.getInstance();
		//Student s1=new Student();
		s1.setStudentId(10121);
		s1.setStudentName("kalu");
		s1.setCollegeName("RIET");
		
		System.out.println("this is Thread1");
	}
}
