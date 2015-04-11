<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Book</title>
<link rel="stylesheet"
	href='<c:url value="resources/css2/pure-0.4.2.css"/>'>
<link rel="stylesheet"
	href='<c:url value="resources/css2/font-awesome-4.0.3/css/font-awesome.css"/>'>
<link rel="stylesheet"
	href='<c:url value="resources/css2/jquery-ui-1.10.4.custom.css"/>'>
<style type="text/css">
th {
	text-align: left
}
</style>

</head>
<body>
	<tiles:insertDefinition name="homepage">
		<tiles:putAttribute name="body">
			<div style="width: 95%; margin: 0 auto;">

				<div id="bookDialog" style="display: none;">
					<%@include file="BookForm2.jsp" %>
				</div>

				<h1>List Of Books</h1>

				<button class="pure-button pure-button-primary" onclick="addBook()">
					<i class="fa fa-plus"></i> Add Book
				</button>
				<br>
				<table class="pure-table pure-table-bordered pure-table-striped">
					<thead>
						<tr>
							<th width="4%">No</th>
							<th width="12%">Serial Number</th>
							<th width="12%">Judul</th>
							<th width="12%">Penerbit</th>
							<th width="12%">Deskripsi</th>
							<th width="12%"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bookList}" var="book" varStatus="loopCounter">
							<tr>
								<td><c:out value="${loopCounter.count}" /></td>
								<td><c:out value="${book.isbn}" /></td>
								<td><c:out value="${book.title}" /></td>
								<td><c:out value="${book.publisher}" /></td>
								<td><c:out value="${book.description}" /></td>
								<td><nobr>
										<button class="pure-button pure-button-primary"
											onclick="editBook(${book.id});">

											<i class="fa fa-pencil"></i> Edit
										</button>

										<a class="pure-button pure-button-primary"
											onclick="return confirm('Are you sure you want to delete this book?');"
											href="delete?id=${book.id}"> <i class="fa fa-times"></i>Delete
										</a>

									</nobr></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>

			<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
			<script type="text/javascript"
				src='<c:url value="resources/js2/lib/jquery-1.10.2.js"/>'></script>
			<script type="text/javascript"
				src='<c:url value="resources/js2/lib/jquery-ui-1.10.4.custom.js"/>'></script>
			<script type="text/javascript"
				src='<c:url value="resources/js2/lib/jquery.ui.datepicker.js"/>'></script>
			<script type="text/javascript"
				src='<c:url value="resources/js2/js-for-listBooks.js"/>'></script>
			
			 <!-- <script src="resources/js2/js-for-listBooks.js"></script> -->
		</tiles:putAttribute>
	</tiles:insertDefinition>
</body>
</html>