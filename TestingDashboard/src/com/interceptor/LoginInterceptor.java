package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		boolean result=false;
		
		HttpSession session=arg0.getSession();
		
		String path= arg0.getRequestURI().substring(18);
		
		if(path.equalsIgnoreCase("login-load.htm") || path.equalsIgnoreCase("logOut.htm") || path.equalsIgnoreCase("login-process.htm"))
		{
		result= true;	
		}
		if(!path.equalsIgnoreCase("login-load.htm") && !path.equalsIgnoreCase("logOut.htm") && !path.equalsIgnoreCase("login-process.htm"))
		{
			if(session.getAttribute("loginBean")==null)
			{
			arg1.sendRedirect("logOut.htm");
			}
			else
			{
				result=true;	
			}	
		}
		return result;
	}
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
		
	}


	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

}
