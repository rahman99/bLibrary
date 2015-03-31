<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="homepage">
	<tiles:putAttribute name="body">
		<div class="body">
			<div class="container">
				<div align="center">
					<h1>Enter User Details</h1>
					<table>
						<form:form action="saveUserLogin" method="post" modelAttribute="userlogin">
							<form:hidden path="id" />
							
							<tr>
								<td>Full Name:</td>
								<td><form:input path="fullname" /></td>
							</tr>
							<tr>
								<td>Username:</td>
								<td><form:input path="username" /></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><form:password path="password" /></td>
							</tr>
							<tr>
								<td>User Role:</td>
								<td><form:input path="userRoleId" /></td>
							</tr>
							<tr>
								<td>is active:</td>
								<td><form:checkbox path="enabled" /></td>
							</tr>
							
						</form:form>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="save"></td>
						</tr>
					</table>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>