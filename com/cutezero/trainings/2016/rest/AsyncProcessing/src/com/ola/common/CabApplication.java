package com.ola.common;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Web application deployment descriptor configuration is not applicable 
 * Only works with @ApplicationPath bootstrap option configuration
 * @author Srikanta.ydon
 *
 */
@ApplicationPath("/api")
public class CabApplication extends Application{

	
}
