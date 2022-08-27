import com.cfn.hibernate.dao.EmpDao;
import com.cfn.hibernate.dao.EmpDaoFactory;
import com.cfn.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {
		{
			EmpDao dao= EmpDaoFactory.getInstance();
			//call saveEmployee()
			Employee e=new Employee();
			e.setEmpNumber(7904);
			e.setEmpName("Nalu");
			e.setEmpSalary(7000);
			//e.setDeptNumber(20);
			dao.saveEmployee(e);
			System.out.println("=========================");
			//call readEmployee
			Employee e1=dao.readEmployee(7903);
			System.out.println(e1.getEmpNumber()+" \t"+e1.getEmpName()+" \t"+e1.getEmpSalary());
		}

	}

}
