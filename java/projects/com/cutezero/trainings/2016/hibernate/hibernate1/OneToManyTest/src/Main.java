import com.cfn.hibernate.dao.ComponentDao;
import com.cfn.hibernate.dao.ComponentDaoFactory;
import com.cfn.hibernate.model.Address;
import com.cfn.hibernate.model.Employee;

public class Main 
{
	public static void main(String []args)
	{
		ComponentDao dao=ComponentDaoFactory.getInsstance();
		Address addr=new Address("3-123", "Ameerpet", "CITY");
		Employee e= new Employee(7912, "ANIL", addr);
		dao.saveEmp(e);
		System.out.println("******************");
		Employee e1=dao.readEmp(7912);
		
	}
}
