package lookup;

import org.springframework.context.ApplicationContext;

public class MyThread2 extends Thread {
	
	public void run(){
		
		ApplicationContext ctx=ContextUtil.getApplicationContext();
		College c2= (College)ctx.getBean("college");
		Student s2=c2.getInstance();
		//Student s2= new Student();
		s2.setStudentId(10013);
		s2.setStudentName("thipi");
		s2.setCollegeName("NIST");
		
		System.out.println("This is Thread2");
	}
}
