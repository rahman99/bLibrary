<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 
<tiles:insertDefinition name="homepage">
    <tiles:putAttribute name="body">
    <!-- <div class = "body"> -->
    <div class="container">
        <div align="center">
	        <h1>Books List</h1>
	        <h2><a href="newUserLogin">New User Login</a></h2>
	        
        	<table border="1">
	        	<th>No</th>
	        	<th>Full Name</th>
	        	<th>username</th>
	        	<th>Actions</th>
	        	
				<c:forEach var="userlist" items="${userloginlist}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
	        		<td>${userlist.fullname}</td>
					<td>${userlist.username}</td>
					<td>${userlist.password}</td>
					<td>
						<a href="${pageContext.request.contextPath}/editUserLogin?id=${userlist.id}">Edit &nbsp;&nbsp;&nbsp;&nbsp;</a>
						<a href="${pageContext.request.contextPath}/deleteUserLogin?id=${userlist.id}">Delete &nbsp;&nbsp;&nbsp;&nbsp;</a>
					</td>
	        	</tr>
				</c:forEach>	        	
        	</table>
        	
        </div>
        <!-- </div> -->
	</div>
	
    </tiles:putAttribute>
</tiles:insertDefinition>
