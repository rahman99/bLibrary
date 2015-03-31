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
					<h1>Enter Book Details</h1>
					<table>
						<form:form action="saveBook" method="post" modelAttribute="book">
							<form:hidden path="id" />
							
							<tr>
								<td>Serial Book:</td>
								<td><form:input path="isbn" /></td>
							</tr>
							<tr>
								<td>Title:</td>
								<td><form:input path="title" /></td>
							</tr>
							<tr>
								<td>Penerbit:</td>
								<td><form:input path="publisher" /></td>
							</tr>
							<tr>
								<td>Description:</td>
								<td><form:input path="description" /></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="saveBook"></td>
							</tr>
						</form:form>
					</table>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>