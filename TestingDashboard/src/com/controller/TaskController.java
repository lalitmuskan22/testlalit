package com.controller;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Model.TaskBean;
import Model.TaskManageBean;

@Controller
public class TaskController {
	
	@RequestMapping(value="/task-process" ,method = RequestMethod.POST)
	public ModelAndView processTask(@ModelAttribute("taskBean") TaskBean taskBean)
	{
		ModelAndView taskProcess = new ModelAndView("taskResult");
		Map <String,String> projectMap = new LinkedHashMap<String, String>();
		projectMap.put("-1","Select");
		projectMap.put("mis", "MIS");
    	projectMap.put("wdl", "WDL");
    	projectMap.put("tcd", "TCD");
    	projectMap.put("thrc", "Leader-THRC");
    	Map <String,String> userMap = new LinkedHashMap<String, String>();
    	userMap.put("-1","Select");
    	userMap.put("lalit","Lalit");
    	userMap.put("aparna","Aparna");
    	userMap.put("venu","Venu");
    	userMap.put("ashish","Ashish");
    	userMap.put("rushali","Rushali");
    	userMap.put("aditya","Aditya");
    	taskProcess.addObject("projectMap", projectMap);
    	taskProcess.addObject("userMap", userMap);
    	return taskProcess;
	}

	@RequestMapping(value="/task-load")
	public ModelAndView loadTask(@ModelAttribute("taskManageBean") TaskBean taskBean,HttpServletRequest request)
	{
		ModelAndView taskLoad = new ModelAndView("task");
		
		taskBean.setProjectName(request.getParameter("project"));
		taskBean.setUserName(request.getParameter("user"));
		Map <String,String> projectMap = new LinkedHashMap<String, String>();
		projectMap.put("-1","Select");
		projectMap.put("mis", "MIS");
    	projectMap.put("wdl", "WDL");
    	projectMap.put("tcd", "TCD");
    	projectMap.put("thrc", "Leader-THRC");
    	Map <String,String> userMap = new LinkedHashMap<String, String>();
    	userMap.put("-1","Select");
    	userMap.put("lalit","Lalit");
    	userMap.put("aparna","Aparna");
    	userMap.put("venu","Venu");
    	userMap.put("ashish","Ashish");
    	userMap.put("rushali","Rushali");
    	userMap.put("aditya","Aditya");
    	taskLoad.addObject("projectMap", projectMap);
    	taskLoad.addObject("userMap", userMap);
    	
    	
    	taskBean.setActivityId("52215");
    	
    	taskLoad.addObject("taskBean",taskBean);
    	return taskLoad;
	}
	
	
	@RequestMapping(value="/task-search")
	public ModelAndView load(@ModelAttribute("taskManageBean") TaskManageBean taskManageBean,HttpServletRequest request)
	{
		ModelAndView taskProcess = null;
		List <TaskBean> taskList = new ArrayList<TaskBean>();
		
		taskManageBean.setProject(request.getParameter("project"));
		taskManageBean.setUser(request.getParameter("user"));
		
		if(taskManageBean.getUser().equals("-1") || taskManageBean.getProject().equals("-1"))
		{
			taskList = new ArrayList<TaskBean>();
			
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("all") && taskManageBean.getProject().equalsIgnoreCase("mis"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","Mis", "Ashish,Aditya", "200","100","100","100", "16", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","Mis", "Ashish,Aditya", "300", "170","130", "8","6","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","Mis", "Ashish,Aditya","300", "170","130", "8","6", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","Mis", "Ashish,Aditya", "300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","Mis", "Ashish,Aditya", "300", "170","130", "8","6", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","Mis", "Ashish,Aditya","300", "170","130", "8","6", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","Mis", "Ashish,Aditya","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","Mis", "Ashish,Aditya","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","Mis", "Ashish,Aditya","300", "170","130", "8","6", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","Mis", "Ashish,Aditya","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","Mis", "Ashish,Aditya","300", "170","130", "8","6", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","Mis", "Ashish,Aditya","300", "170","130", "8","6", "Completed"));
			taskProcess=new ModelAndView("taskSearchAll");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("all") && taskManageBean.getProject().equalsIgnoreCase("wdl"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","Mis", "Venu,Aparna", "200","100","100","100", "16", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","Mis", "Venu,Aparna", "300", "170","130", "8","6","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","Mis", "Venu,Aparna","300", "170","130", "8","6", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","Mis", "Venu,Aparna", "300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","Mis", "Venu,Aparna", "300", "170","130", "8","6", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","Mis", "Venu,Aparna","300", "170","130", "8","6", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","Mis", "Venu,Aparna","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","Mis", "Venu,Aparna","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","Mis", "Venu,Aparna","300", "170","130", "8","6", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","Mis", "Venu,Aparna","300", "170","130", "8","6", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","Mis", "Venu,Aparna","300", "170","130", "8","6", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","Mis", "Venu,Aparna","300", "170","130", "8","6", "Completed"));
			taskProcess=new ModelAndView("taskSearchAll");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("ashish") && taskManageBean.getProject().equalsIgnoreCase("mis"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","Mis", "Ashish", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","Mis", "Ashish", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","Mis", "Ashish", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","Mis", "Ashish", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","Mis", "Ashish", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","Mis", "Ashish","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","Mis", "Ashish","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","Mis", "Ashish","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","Mis", "Ashish","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","Mis", "Ashish","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","Mis", "Ashish","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","Mis", "Ashish","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("venu") && taskManageBean.getProject().equalsIgnoreCase("wdl"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","WDL", "Venu", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","WDL", "Venu", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","WDL", "Venu", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","WDL", "Venu", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","WDL", "Venu", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","WDL", "Venu","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","WDL", "Venu","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","WDL", "Venu","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","WDL", "Venu","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","WDL", "Venu","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","WDL", "Venu","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","WDL", "Venu","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("aparna") && taskManageBean.getProject().equalsIgnoreCase("wdl"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","WDL", "Aparna", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","WDL", "Aparna", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","WDL", "Aparna", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","WDL", "Aparna", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","WDL", "Aparna", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","WDL", "Aparna","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","WDL", "Aparna","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","WDL", "Aparna","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","WDL", "Aparna","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","WDL", "Aparna","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","WDL", "Aparna","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","WDL", "Aparna","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("rushali") && taskManageBean.getProject().equalsIgnoreCase("thrc"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","THRC", "Rushali", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","THRC", "Rushali", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","THRC", "Rushali", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","THRC", "Rushali", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","THRC", "Rushali", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","THRC", "Rushali","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","THRC", "Rushali","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","THRC", "Rushali","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","THRC", "Rushali","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","THRC", "Rushali","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","THRC", "Rushali","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","THRC", "Rushali","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("lalit") && taskManageBean.getProject().equalsIgnoreCase("tcd"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","TCD", "Lalit", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","TCD", "Lalit", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","TCD", "Lalit", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","TCD", "Lalit", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","TCD", "Lalit", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","TCD", "Lalit","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","TCD", "Lalit","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","TCD", "Lalit","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","TCD", "Lalit","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","TCD", "Lalit","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","TCD", "Lalit","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","TCD", "Lalit","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else if(taskManageBean.getUser().equalsIgnoreCase("aditya") && taskManageBean.getProject().equalsIgnoreCase("mis"))
		{
			taskList = new ArrayList<TaskBean>();
			taskList.add(new TaskBean("1 Jan-7 Jan 2014","2201","Mis", "Aditya", "100","50","50","50", "8", "Completed"));
			taskList.add(new TaskBean("8 Jan-15 Jan 2014","2202","Mis", "Aditya", "150", "85","65", "4","3","pending"));
			taskList.add(new TaskBean("16 Jan-22 Jan 2014","2203","Mis", "Aditya", "150", "85","65", "4","3", "wait for client response"));
			taskList.add(new TaskBean("23 Jan-30 Jan 2014","2204","Mis", "Aditya", "150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 Feb-7 Jan 2014","2205","Mis", "Aditya", "150", "85","65", "4","3", "client wait"));
			taskList.add(new TaskBean("8 Feb-15 Jan 2014","2206","Mis", "Aditya","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("16 Feb-22 Jan 2014","2207","Mis", "Aditya","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("23 Feb-28 Jan 2014","2208","Mis", "Aditya","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("1 March-7 Jan 2014","2209","Mis", "Aditya","150", "85","65", "4","3", "query"));
			taskList.add(new TaskBean("8 March-15 Jan 2014","2210","Mis", "Aditya","150", "85","65", "4","3", "Completed"));
			taskList.add(new TaskBean("16 March-22 Jan 2014","2211","Mis", "Aditya","150", "85","65", "4","3", "wait"));
			taskList.add(new TaskBean("23 March-30 Jan 2014","2212","Mis", "Aditya","150", "85","65", "4","3", "Completed"));
			taskProcess=new ModelAndView("taskSearch");
		}
		else
		{
			taskList = new ArrayList<TaskBean>();
			new ModelAndView("taskSearch");
		}
		request.setAttribute("taskList", taskList);
    	return taskProcess;
	}
	
	@RequestMapping(value="/manage-user-list")
	public ModelAndView manageUserList(@ModelAttribute TaskManageBean taskManageBean)
	{
		Map <String,String> projectMap = new LinkedHashMap<String,String>();
		Map <String,String> userMap = new LinkedHashMap<String,String>();
		ModelAndView taskmanage= new ModelAndView("taskManage");
		if(taskManageBean.getProject().equals("-1"))
		{
			projectMap = new LinkedHashMap<String,String>();
			
	    	projectMap.put("-1","Select");
	    	projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "Leader-THRC");
	    	userMap = new LinkedHashMap<String,String>();
	    	userMap.put("-1","Select");
	    	taskmanage.addObject("projectMap",projectMap);
	    	taskmanage.addObject("userMap",userMap);
	    	taskmanage.addObject("taskManageBean",taskManageBean);
		}
		else if(taskManageBean.getProject().equalsIgnoreCase("mis"))
		{
			projectMap = new LinkedHashMap<String,String>();
			
	    	projectMap.put("-1","Select");
	    	projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "Leader-THRC");
	    	userMap = new LinkedHashMap<String,String>();
	    	userMap.put("-1","Select");
	    	userMap.put("ashish","Ashish");
	    	userMap.put("aditya","Aditya");
	    	userMap.put("all","ALL");
	    	taskmanage.addObject("projectMap",projectMap);
	    	taskmanage.addObject("userMap",userMap);
	    	taskManageBean.setProject("mis");
	    	taskmanage.addObject("taskManageBean",taskManageBean);
		}
		else if(taskManageBean.getProject().equalsIgnoreCase("thrc"))
		{
			projectMap = new LinkedHashMap<String,String>();
			projectMap.put("-1","Select");
	    	projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "Leader-THRC");
	    	userMap = new LinkedHashMap<String,String>();
	    	userMap.put("-1","Select");
	    	userMap.put("rushali","Rushali");
	    	taskmanage.addObject("projectMap",projectMap);
	    	taskmanage.addObject("userMap",userMap);
	    	taskManageBean.setProject("thrc");
	    	taskmanage.addObject("taskManageBean",taskManageBean);
	    }
	
		else if(taskManageBean.getProject().equalsIgnoreCase("tcd"))
		{
			projectMap = new LinkedHashMap<String,String>();
			projectMap.put("-1","Select");
	    	projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "Leader-THRC");
	    	userMap = new LinkedHashMap<String,String>();
	    	userMap.put("-1","Select");
	    	userMap.put("lalit","Lalit");
	    	taskmanage.addObject("projectMap",projectMap);
	    	taskmanage.addObject("userMap",userMap);
	    	taskManageBean.setProject("tcd");
	    	taskmanage.addObject("taskManageBean",taskManageBean);
		}
	
		else if(taskManageBean.getProject().equalsIgnoreCase("wdl"))
		{
			projectMap = new LinkedHashMap<String,String>();
			projectMap.put("-1","Select");
	    	projectMap.put("mis", "MIS");
	    	projectMap.put("wdl", "WDL");
	    	projectMap.put("tcd", "TCD");
	    	projectMap.put("thrc", "Leader-THRC");
	    	userMap = new LinkedHashMap<String,String>();
	    	userMap.put("-1","Select");
	    	userMap.put("aparna","Aparna");
	    	userMap.put("venu","Venu");
	    	userMap.put("all","ALL");
	    	taskmanage.addObject("projectMap",projectMap);
	    	taskmanage.addObject("userMap",userMap);
	    	taskManageBean.setProject("wdl");
	    	taskmanage.addObject("taskManageBean",taskManageBean);
		}
	
	return taskmanage;
	}
	
}
