<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="homepage">
	<tiles:putAttribute name="body">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Daftar Buku</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<!-- <h2><a href="newBook">New Book</a></h2>	 -->
						<a href="#" class="btn btn-lg btn-success" data-toggle="modal"
							data-target="#basicModal">Add Book</a>
						<div class="table-responsive">
							<table class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
									<tr>
										<th>Nomor</th>
										<th>Judul Buku</th>
										<th>Seri Buku</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<!-- <tr class="odd gradeX">
									<td>Trident</td>
									<td>Internet Explorer 4.0</td>
									<td>Win 95+</td>
									<td class="center">4</td>
									<td class="center">X</td>
								</tr> -->
									<c:forEach var="book" items="${bookList}" varStatus="status">
										<tr class="odd gradeX">
											<td>${status.index + 1}</td>
											<td>${book.bookName}</td>
											<td>${book.bookISBN}</td>
											<td><a
												href="${pageContext.request.contextPath}/editBook?id=${book.bookId}">Edit
													&nbsp;&nbsp;&nbsp;&nbsp;</a> <a
												href="${pageContext.request.contextPath}/deleteBook?id=${book.bookId}">Delete
													&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>

					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- ////////////////////////////////////////////////////////////////////////////////////////////////// -->
		<div class="body">
		<div class="modal fade" id="basicModal" tabindex="-1" role="dialog"
			aria-labelledby="basicModal" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<!-- <form class="form-horizontal" method="post" role="form"> -->
					<form:form action="saveBook" method="post" modelAttribute="book">
						<!-- <form:hidden path="id" /> -->
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Penambahan Buku</h4>
						</div>
					
						<div class="form-group">
							<label class="col-sm-2 control-label">Serial Number</label>
							<div class="col-sm-10">
								<input class="form-control" id="isdn" type="text"
									placeholder="isdn">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">Judul Buku</label>
							<div class="col-sm-10">
								<input class="form-control" id="title" type="text"
									placeholder="title">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">Penerbit</label>
							<div class="col-sm-10">
								<input class="form-control" id="publisher" type="text"
									placeholder="publisher">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">Description</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="description"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">Cover Book</label>
							<div class="col-sm-10">								
								<input type="file" data-bfi-disabled id="imgcover">
							</div>
						</div>
					
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							<button type="button" type="submit" value="saveBook" class="btn btn-primary">Save</button>
						</div>
					<!-- </form> -->
					</form:form>
				</div>
			</div>
		</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>