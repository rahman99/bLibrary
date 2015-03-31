<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="homepage">
	<tiles:putAttribute name="body">
	<div class="body">
		<div class="row">
			<div class="col-lg-8">
				<div class="panel panel-default">
					<div class="panel-heading">Basic Form Elements</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-8">							
								<form:form cssClass="form-horizontal" action="saveMember" method="post" modelAttribute="member">
									<form:hidden path="id" />
									<%-- <div class="form-group">
										<label class="control-label col-xs-2">Serial ID</label>
										<div class="col-xs-10">
											<!-- <input type="text" class="form-control" id="username" 
												placeholder="Username">	 -->
											<form:input cssClass="form-control" path="serialIdNumber" placeholder="ID Member" cssStyle="required"/>
										</div>
									</div> --%>
									<div class="form-group">
										<label class="control-label col-xs-2">Nama Lengkap</label>
										<div class="col-xs-10">
											<!-- <input type="text" class="form-control" id="password"
												placeholder="password">	 -->
											<form:input cssClass="form-control" path="fullName" placeholder="Nama Lengkap"/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-2">Kode ID</label>
										<div class="col-xs-10">
											<!-- <input type="text" class="form-control" id="password"
												placeholder="password">	 -->
											<form:input cssClass="form-control" path="serialIdNumber" placeholder="Kode ID	"/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-2">Email</label>
										<div class="col-xs-10">
											<!-- <input type="email" class="form-control" id="email"
												placeholder="Email"> -->
											<form:input cssClass="form-control" path="email" placeholder="email" />	
											
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-2">Alamat</label>
										<div class="col-xs-10">
											<!-- <input type="email" class="form-control" id="email"
												placeholder="Email"> -->
											<form:input cssClass="form-control" path="Address" placeholder="Alamat" />	
											
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-2">Kontak</label>
										<div class="col-xs-10">
											<!-- <input type="email" class="form-control" id="email"
												placeholder="Email"> -->
											<form:input cssClass="form-control" path="contact" placeholder="contact" />	
											
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-offset-2 col-xs-10">
											<!-- <button type="submit" class="btn btn-primary">Login</button> -->
											<input type="submit" class="btn btn-primary"
											value="save"/>
										</div>
									</div>
								<%-- </form> --%>
								</form:form>
							</div>
						</div>
						<!-- /.row (nested) -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		</div>
		<%-- 
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div align="center">
							<h1>Enter User Details</h1>
							<table>
								<form:form action="saveUser" method="post" modelAttribute="user">
									<form:hidden path="userId" />
									<tr>
										<td>Username:</td>
										<td><form:input path="username" /></td>
									</tr>
									<tr>
										<td>Email:</td>
										<td><form:input path="email" /></td>
									</tr>
									<tr>
										<td>Password:</td>
										<td><form:password path="password" /></td>
									</tr>
									<tr>
										<td colspan="2" align="center"><input type="submit"
											value="SaveUser"></td>
									</tr>
								</form:form>
							</table>

						</div>
					</div>
				</div>
			</div>
		 --%>
	</tiles:putAttribute>
</tiles:insertDefinition>