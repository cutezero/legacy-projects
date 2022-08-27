import javax.swing.JOptionPane;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Client1 {
	public static void main(String...args){
		Configuration conf= new Configuration();
		conf .configure("hibernate.cfg.xml");
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		//Student s=(Student)session.get(Student.class,101); //optimistic lock
		Student s=(Student)session.get(Student.class,101,LockOptions.UPGRADE);//pessimistic lock
		
		String str=JOptionPane.showInputDialog("Enter new Marks(user1)");
		int m=Integer.parseInt(str);
		s.setMarks(m);
		tx.commit();
		session.close();
		factory.close();
	}
}
