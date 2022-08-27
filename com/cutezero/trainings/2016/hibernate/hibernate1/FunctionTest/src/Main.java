import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sathya.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.doWork(new MyWork());
		session.close();

	}

}
