<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Testing Dashboard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- <link rel="stylesheet" href="[[mystyle.css]]" type="text/css"> -->
    <link href="css/mystyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript">

    function taskParameter()
    {
    if(document.getElementById("activityId").value=="")
    {
    alert("please provide activity id ");	
    return false;
    }
    else if(document.getElementById("userName").value=="")
    {
    	alert("please provide user name ");
    	return false;
    }
    else if(document.getElementById("projectName").value=="")
    {
    	alert("please provide project name");
    	return false;
    }
    /* else if(document.getElementById("testCase").value=="")
    {
    	alert("please provide no of testCase");
    	return false;
    } */
    else if(document.getElementById("defect").value=="")
    {
    	alert("please provide no of defect");
    	return false;
    }
    else if(document.getElementById("testCasePlanned").value=="")
    {
    	alert("please provide no of test cases planned");
    	return false;
    }
    else if(document.getElementById("testCasePassed").value=="")
    {
    	alert("please provide no of test cases passed");
    	return false;
    }
    else if(document.getElementById("testCaseFailed").value=="")
    {
    	alert("please provide no of test cases failed");
    	return false;
    }
    /* else if(document.getElementById("fitnesseTestScript").value=="")
    {
    	alert("please provide no of fitnesse test script");
    	return false;
    } */

    else if(document.getElementById("dqcRaised").value=="")
    {
    	alert("please provide no of query raised");
    	return false;
    }
    else if(document.getElementById("comments").value=="")
    {
    	alert("please provide comments");
    	return false;
    }
    else
    	{
    	return true;
    	}
    	
    }


</script>
    
  </head>
  <body>
    <div id="page">

      <!-- page head -->

      <div id="head">
        <div id="logo">
          <!-- <img src="[[myicon.png]]" height="94" width="100" alt="my icon"> -->
          <img src="images/testlogo.png" height="94" width="100" alt="my icon">
        </div>
        <div id="title">Testing Dashboard</div>
        
        <table align="right">
<tr>
<td><font color="white">Logged In as ${sessionScope.loginBean.loginId}</font></td>
<td><a href="<c:url value='logOut.htm'/>"><font color="white">LogOut</font></a></td>
</tr>
</table>
      </div>

      <!-- page main (sidebar + body) -->

      <div id="main">
        <table width="100%" class="layout">
          <tr><td valign="top" id="sidebar">
            <div class="menu">
<a href=# class="menu">Home</a>
<a href=# class="menu">About Us</a>
<a href=# class="menu">Contact Us</a>
<a href=# class="menu">About Dashboard</a>
            </div>
            <div class="about">
This is the Testing dashboad which provide the complete information.  
You will be able to see your Work done record weekly/monthly.
We help you to fill your work done weekly and admin can update also
and download the reports.

            </div>

          </td><td valign="top" id="body">
          <!--content(body)-->
<table width="65%" align="left">
<tr>
<td>
<fieldset>
 <legend><b>Add New Task</b></legend>


<form:form method="POST"  modelAttribute="taskBean" action="task-process.htm" onsubmit="return taskParameter();"> 
<table>
			<tr>
				<td>Activity Id</td>
				<td><form:input path="activityId" readonly="true"/>  
                  </td>             
			</tr>
			<tr>
				<td>User</td>
				<td><form:input path="userName" readonly="true"/>  
                  </td>             
			</tr>
			<tr>
				<td>Project</td>
				<td><form:input path="projectName" readonly="true"/>  
                  </td>             
			</tr>
			<tr>
				<td>Number of Test Cases Planned for Execution</td>
				<td><form:input path="testCasePlanned"/>  
                  </td>             
			</tr>
			
			<tr>
				<td>Number of Test Cases Passed</td>
				<td><form:input path="testCasePassed"/>  
                  </td>             
			</tr>
			
			<tr>
				<td>Number of Test Cases Failed</td>
				<td><form:input path="testCaseFailed"/>  
                  </td>             
			</tr>
			<tr>
				<td>Number of Defects Verified</td>
				<td><form:input path="defect"/>  
                  </td>             
			</tr>
			<%-- <tr>
				<td>Number of Fitnesse Test Scripts :</td>
				<td><form:input path="fitnesseTestScript"/>  
                  </td>             
			</tr> --%>
			<tr>
				<td>Number of Defects Raised</td>
				<td><form:input path="dqcRaised"/>  
                  </td>             
			</tr>
			<tr>
				<td>Comments</td>
				<td><form:input path="comments"/>  
                  </td>             
			</tr>
			<tr>
			<td></td>
				<td align="center"><input type="submit" value="Submit"/></td>
				             
			</tr>
		</table>
		</form:form>
		</fieldset>
	</td>
	</tr>
	</table>

          </td></tr>
        </table>
      </div>

      <!-- page footer -->

      <div id="foot">
<!--content(footer)-->
@Created By PTC Testing Team
      </div>
    </div>
  </body>
</html>




