import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main 
{
	public static void main(String[] h)
	{
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
	SessionFactory factory=conf.buildSessionFactory(registry);
	/*Student s=new Student();
	s.setStudentId(11011);
	s.setStudentName("Qwerty");
	s.setMarks1(100);
	s.setMarks1(100);
	s.setMarks1(100);
	s.setTotal(300);
	s.setAverage(100);
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(s);
	tx.commit();*/
	
	Session session2=factory.openSession();
	Student s1=(Student)session2.get(Student.class, 11011);
	System.out.println(s1);
	//session.close();
	session2.close();
	}
	
}
