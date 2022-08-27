package pack2;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountListener
 *
 */
public class CountListener implements HttpSessionListener {
	
	
	
	
	
	int count;
	public void sessionCreated1(HttpSessionEvent arg0){
		
		
		count++;
     System.out.println("Now no of Session="+count);		
		
}
	public void sessionDestroyed1(HttpSessionEvent arg0){
		count--;
		 System.out.println("Now no of Session="+count);	
	}

	
	
	
	
	
	

    /**
     * Default constructor. 
     */
    public CountListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
