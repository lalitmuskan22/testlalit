 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Testing Dashboard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- <link rel="stylesheet" href="[[mystyle.css]]" type="text/css"> -->
    <link href="css/mystyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript">

function loginValidate()
{
	
var username = document.getElementById("loginId").value;
var password = document.getElementById("password").value;

if(username=="" || password=="")
{
alert("Please provide the login deatils");
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
This is the Testing dashboard which provides the complete information about Testing Tasks.  
You will be able to see your Work done record weekly/monthly.
You can fill your work done weekly and you can download monthly reports 

            </div>

          </td><td valign="top" id="body">
          <!--content(body)-->
          <table width="40%" align="left" >
<tr>
<td>
<fieldset>
 <legend><b>Login</b></legend>
	<form:form method="POST" action="login-process.htm" commandName="loginBean" onsubmit="loginValidate()">  

		<table>
			<tr>
				<td>Login Id :</td>
				<td><form:input path="loginId"/>  
                  </td> 
                  <td>
                  <form:errors path="loginId"/>
                  </td>            
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="password"/>  
                  </td>
                  <td>
                  <form:errors path="password"/>
                  </td>             
			</tr>
			<tr>
			<td></td>
				<td colspan="2" align="center"><input type="submit" value="Login"/></td>
				
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