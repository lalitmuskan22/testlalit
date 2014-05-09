<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Testing Dashboard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- <link rel="stylesheet" href="[[mystyle.css]]" type="text/css"> -->
    <link href="css/mystyle.css" rel="stylesheet" type="text/css" />
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
<h3> Weekly Work Assignment </h3>
<div id="display">
                <display:table export="true" id="data" name="requestScope.taskList" requestURI="/task-search.htm" pagesize="10" >
					<display:column property="slot" title="Week" sortable="true" />
					<display:column property="activityId" title="Activity Id" sortable="true" />
					<display:column property="projectName" title="Project Name" sortable="true" />
					<display:column property="userName" title="Test Engineer" sortable="true" />
					<display:column property="testCasePlanned" title="Total Test Cases" sortable="true" />
					<display:column property="testCasePassed" title="Test Cases Pass" sortable="true" />
					<display:column property="testCaseFailed" title="Test Cases Fail" sortable="true" />
					<display:column property="defect" title="Defects Verified" sortable="true" />
					<display:column property="dqcRaised" title="Defects Raised" sortable="true" />
					<display:column property="comments" title="Comments" sortable="true" />
					<display:setProperty name="export.pdf.filename" value="ActorDetails.pdf"/>
                    <display:setProperty name="export.pdf" value="true" />
				</display:table>
				
				</div>

</td>

          </tr>
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








