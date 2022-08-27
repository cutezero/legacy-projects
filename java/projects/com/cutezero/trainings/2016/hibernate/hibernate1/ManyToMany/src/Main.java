import com.sathya.hibernate.dao.MTMDao;
import com.sathya.hibernate.dao.MTMDaoImpl;

public class Main 
{
	public static void main(String[] args)
	{
		MTMDao   dao =new  MTMDaoImpl();
		dao.saveBooksWithAuthors();
	}
}
