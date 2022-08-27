package com.cfn.app.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimingCheckHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		int hour=0;
		Calendar calendar= null;
		calendar= Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(" intercept 1");
		if(hour>11 && hour<14){
			System.out.println(" intercept 2 : "+hour);
//			response.sendRedirect(request.getContextPath()+"/daily-maintainance.jsp");
//			response.sendRedirect(request.getContextPath()+"/error.jsp");
//			response.sendRedirect("daily-maintainance");
//			response.sendRedirect("daily-maintainance.jsp");
			response.sendRedirect("error.jsp");
			System.out.println(" intercept 3");
			return false;
		}
		System.out.println(" intercept 4");
		return true;
	}

	
}
