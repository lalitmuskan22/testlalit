package com.controller;


import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Model.LoginBean;
import Model.TaskManageBean;


@Controller
public class LoginController {

	@RequestMapping(value = "/login-load")
	private ModelAndView load() {

		ModelAndView login = new ModelAndView("login");
		ModelMap map = new ModelMap();
		map.addAttribute("loginBean", new LoginBean());
		login.addAllObjects(map);
		return login;
	}

	@RequestMapping(value = "/login-process")
	private ModelAndView process(@ModelAttribute LoginBean loginBean,HttpSession sLogin,HttpServletRequest request) throws Exception {

		ModelAndView loginResult = null; 
		
		
		
		if(loginBean.getLoginId()==null)
		{
		loginResult = new ModelAndView("login");	
		}
		else
		{
		Map<String, String> projectMap = new LinkedHashMap<String, String>();
		Map<String, String> userMap = new LinkedHashMap<String, String>();
		
		if (loginBean.getLoginId().equalsIgnoreCase("admin")
				&& loginBean.getPassword().equalsIgnoreCase("password")) {
			
			loginBean.setRole("1");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			projectMap.put("-1", "Select");
			projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "THRC");
	    	userMap.put("-1", "Select");
	    	loginResult = new ModelAndView("taskManage");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if(loginBean.getLoginId().equalsIgnoreCase("venu")
				&& loginBean.getPassword().equalsIgnoreCase("venu123")) {
			
			loginBean.setRole("2");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("wdl", "WDL");
	    	userMap.put("venu","Venu");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("lalit")
				&& loginBean.getPassword().equalsIgnoreCase("lalit123")) {
			
			loginBean.setRole("2");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
	    	projectMap.put("tcd", "TCD");
	    	//projectMap.put("dashboard","Testing Dasboard");
	    	userMap.put("lalit","Lalit");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("aparna")
				&& loginBean.getPassword().equalsIgnoreCase("aparna123")) {
			
			loginBean.setRole("2");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("wdl", "WDL");
			//projectMap.put("dashboard","Testing Dasboard");
	    	userMap.put("aparna","Aparna");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("ashish")
				&& loginBean.getPassword().equalsIgnoreCase("ashish123")) {
			
			loginBean.setRole("2");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap =  new LinkedHashMap<String, String>();
			userMap =  new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("mis", "MIS");
	    	userMap.put("ashish","Ashish");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("rushali")
				&& loginBean.getPassword().equalsIgnoreCase("rushali123")) {
			
			loginBean.setRole("2");
			sLogin.setAttribute("loginBean", loginBean);
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("thrc", "THRC");
	    	userMap.put("rushali","Rushali");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		
		else {
			loginResult = new ModelAndView("login");
			loginBean.setLoginId("");
			loginBean.setPassword("");
			request.setAttribute("error", "Invalid login");
		}
		
		}
		return loginResult;
	}
	
	@RequestMapping(value="/logOut.htm")
	public ModelAndView logOut(@ModelAttribute LoginBean loginBean,HttpSession object)
	{
		object.removeAttribute("loginBean");
		return new ModelAndView("login");
	}
	
	
	
	@RequestMapping(value = "/login-back")
	private ModelAndView processBack(HttpSession sLogin,HttpServletRequest request) throws Exception {

		ModelAndView loginResult = null; 
		
		if(sLogin!=null)
			
		{
		
		if(sLogin.getAttribute("loginBean")!=null)
			
		{
			
		LoginBean loginBean= (LoginBean)sLogin.getAttribute("loginBean");
		
		if(loginBean.getLoginId()==null)
		{
		loginResult = new ModelAndView("login");	
		}
		else
		{
		Map<String, String> projectMap = new LinkedHashMap<String, String>();
		Map<String, String> userMap = new LinkedHashMap<String, String>();
		
		if (loginBean.getLoginId().equalsIgnoreCase("admin")
				&& loginBean.getPassword().equalsIgnoreCase("password")) {
			
			loginBean.setRole("1");
			
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			projectMap.put("-1", "Select");
			projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "THRC");
	    	userMap.put("-1", "Select");
	    	loginResult = new ModelAndView("taskManage");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if(loginBean.getLoginId().equalsIgnoreCase("venu")
				&& loginBean.getPassword().equalsIgnoreCase("venu123")) {
			
			loginBean.setRole("2");
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("wdl", "WDL");
	    	userMap.put("venu","Venu");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("lalit")
				&& loginBean.getPassword().equalsIgnoreCase("lalit123")) {
			
			loginBean.setRole("2");
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
	    	projectMap.put("tcd", "TCD");
	    	//projectMap.put("dashboard","Testing Dasboard");
	    	userMap.put("lalit","Lalit");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("aparna")
				&& loginBean.getPassword().equalsIgnoreCase("aparna123")) {
			
			loginBean.setRole("2");
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("wdl", "WDL");
			//projectMap.put("dashboard","Testing Dasboard");
	    	userMap.put("aparna","Aparna");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("ashish")
				&& loginBean.getPassword().equalsIgnoreCase("ashish123")) {
			
			loginBean.setRole("2");
			projectMap =  new LinkedHashMap<String, String>();
			userMap =  new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("mis", "MIS");
	    	userMap.put("ashish","Ashish");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		else if (loginBean.getLoginId().equalsIgnoreCase("rushali")
				&& loginBean.getPassword().equalsIgnoreCase("rushali123")) {
			
			loginBean.setRole("2");
			projectMap = new LinkedHashMap<String, String>();
			userMap = new LinkedHashMap<String, String>();
			userMap.put("-1", "Select");
	    	projectMap.put("-1", "Select");
			projectMap.put("thrc", "THRC");
	    	userMap.put("rushali","Rushali");
	    	loginResult = new ModelAndView("taskManageUser");
			loginResult.addObject("taskManageBean", new TaskManageBean());
			loginResult.addObject("projectMap", projectMap);
			loginResult.addObject("userMap", userMap);
		}
		
		}
		
		}
		
		}
		return loginResult;
	}


}
