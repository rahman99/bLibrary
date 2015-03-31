<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

<tiles:insertDefinition name="homepage">
	<tiles:putAttribute name="body">
		<div class="body">
			<!-- Button trigger modal -->

			<div class="container">
				<div class="row">
					<h3>User List</h3>
				</div>
				<div class="row">
					<p>
						<a class="btn btn-xs btn-success" href="newMember">Create</a>
					</p>
					<p></p>
					<table border="1">
						<tr>
							<th>No</th>
							<th>Member Serial Number</th>
							<th>Name Lengkap</th>
							<th>Email</th>							
							<th>Actions</th>
						</tr>
						<tbody>
							<c:forEach var="member" items="${member}" varStatus="status">
								<tr>
									<td>${status.index + 1}</td>
									<td>${member.serialIdNumber}</td>
									<td>${member.fullName}</td>
									<td>${member.email}</td>
									<td><a
										href="${pageContext.request.contextPath}/editMember?id=${member.id}">Edit
											&nbsp;&nbsp;&nbsp;&nbsp;</a> <a
										href="${pageContext.request.contextPath}/deleteMember?id=${member.id}">Delete
											&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
									
		</div>
		<!-- end body -->
	</tiles:putAttribute>
</tiles:insertDefinition>
