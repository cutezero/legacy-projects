import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfn.beans.MovieLister;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/cfn/configuration/applicationContext.xml");
		Object o=ctx.getBean("lister");
		//MovieFinder finder=new MovieFinder();
		
		MovieLister lister= (MovieLister)o;
		
		lister.printMoviesByYear();
	}

}
