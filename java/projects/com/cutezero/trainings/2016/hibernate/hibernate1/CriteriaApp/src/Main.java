import com.cfn.hibernate.dao.EmployeeDao;
import com.cfn.hibernate.dao.EmployeeDaoFactory;

public class Main {

	public static void main(String[] args) {
		EmployeeDao dao=EmployeeDaoFactory.getInstance();
		dao.findAllEmps();
		System.out.println("======================================");
		dao.readPartialEmps(); 
		System.out.println("======================================");
		dao.readAggregate();
		System.out.println("======================================");
	}

}
