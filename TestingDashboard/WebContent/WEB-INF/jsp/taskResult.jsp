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

    function getList()
    {
    document.getElementById("pro").submit();
    }

    function parameter()
    {
    var project= document.getElementById("project").value;
    var user= document.getElementById("user").value;
    if(project=="-1")
    {
    alert("please select the prject");
    return false;
    }
    else if(user=="-1")
    {
    alert("please select the user");
    return false;
    }
    else
    {
    true;
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
<table width="30%" align="left">
<tr>
<td>


<form:form method="POST"  modelAttribute="taskManageBean" id="pro">  
<table>
			
			<tr>
				<td>
				Task Entry Successfully Submitted
				<br>
				<a href="<c:url value='login-back.htm'/>">Go to Home page</a>
				</td>
			</tr>
			
		</table>
		</form:form>
		
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




				
				
