import com.cfn.hibernate.dao.StudentDao;
import com.cfn.hibernate.dao.StudentDaoFactory;
import com.cfn.hibernate.model.Student;


public class Main {

	public static void main(String[] args) {
		{
			StudentDao dao= StudentDaoFactory.getInstance();
			//call saveEmployee()
			Student e=new Student();
			e.setStudentId(7904);
			e.setStudentName("Nalu");
			e.setMarks(300);
			//e.setDeptNumber(20);
			dao.persistStudent(e);
			System.out.println("=========================");
			//call readEmployee
			Student e1=dao.findStudent(7904);
			System.out.println(e1.getStudentId()+" \t"+e1.getStudentName()+" \t"+e1.getMarks());
		}

	}

}
