package one2many.test;

import java.util.HashSet;
import java.util.Set;

import one2many.entities.BranchInDegree;
import one2many.entities.Subject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Subject subject= null;
		BranchInDegree branch = null;
		
		Set<Subject> subjects= null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			subjects= new HashSet<Subject>();
			subject= new Subject();
			subject.setSubjectCode("SUB010");
			subject.setSubjectName("Java");
			subjects.add(subject);
			
			subject= new Subject();
			subject.setSubjectCode("SUB011");
			subject.setSubjectName("AdvJava");
			subjects.add(subject);
			
			subject= new Subject();
			subject.setSubjectCode("SUB012");
			subject.setSubjectName("CoreJava");
			subjects.add(subject);
			
			subject= new Subject();
			subject.setSubjectCode("SUB013");
			subject.setSubjectName("JavaFramework");
			subjects.add(subject);
			
			branch= new BranchInDegree();
			branch.setBranchCode("BR99090");
			branch.setBranchName("MECH");
			branch.setSubjects(subjects);
			
			session.save(branch);
			
			flag=true;	//if everythings goes ok then true(commit)
		} finally {
			if (transaction != null) {
				if (flag)
					transaction.commit();
				else
					transaction.rollback();

			}
			SessionFactoryRegistry.closeSessionFactory();
		}

	}
}
