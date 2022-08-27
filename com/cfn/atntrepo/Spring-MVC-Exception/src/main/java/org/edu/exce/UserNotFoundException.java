package org.edu.exce;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("exp")
public class UserNotFoundException extends Exception{
	 
	public UserNotFoundException() {
			super();
		}
	   
	   public UserNotFoundException(String arg0) {
			super(arg0);
		}

		public UserNotFoundException(String arg0, Throwable arg1) {
			super(arg0, arg1);
		}
}
