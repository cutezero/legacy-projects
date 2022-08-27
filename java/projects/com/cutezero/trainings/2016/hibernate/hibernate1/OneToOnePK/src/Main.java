import com.sathya.hibernate.dao.OTODao;
import com.sathya.hibernate.dao.OTODaoImpl;

public class Main {

	public static void main(String[] args)
	{
		OTODao  dao = new  OTODaoImpl();
		dao.savePassportWithPerson();
	}
}
