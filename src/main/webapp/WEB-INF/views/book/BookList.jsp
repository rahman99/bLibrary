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
	        <h2><a href="newBook">New Book</a></h2>
	        
        	<table border="1">
	        	<th>No</th>
	        	<th>Serial Number</th>
	        	<th>Judul</th>
	        	<th>Penerbit</th>
	        	<th>Deskripsi</th>
	        	<th>Actions</th>
	        	
				<c:forEach var="book" items="${bookList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${book.isbn}</td>
					<td>${book.title}</td>
					<td>${book.publisher}</td>
					<td>${book.description}</td>
					<td>
						<a href="${pageContext.request.contextPath}/editBook?id=${book.id}">Edit &nbsp;&nbsp;&nbsp;&nbsp;</a>
						<a href="${pageContext.request.contextPath}/delete?id=${book.id}">Delete &nbsp;&nbsp;&nbsp;&nbsp;</a>
					</td>
	        	</tr>
				</c:forEach>	        	
        	</table>
        	
        </div>
        <!-- </div> -->
	</div>
	
    </tiles:putAttribute>
</tiles:insertDefinition>
