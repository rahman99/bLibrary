<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%-- <c:url var="actionUrl" value="saveBook" /> --%>

<form:form id="bookForm2" commandName="book" method="post"
	action="saveBook" class="pure-form pure-form-aligned">

	<fieldset>
		<legend></legend>

		<div class="pure-control-group">
			<label for="isbn">Serial Book</label>
			<form:input name = "isbn" path="isbn" placeholder="Book Serial Number" />
		</div>
		<div class="pure-control-group">
			<label for="title">Judul</label>
			<form:input path="title" placeholder="title"
				maxlength="10" />
		</div>
		<div class="pure-control-group">
			<label for="penerbit">Penerbit</label>
			<form:input path="publisher" placeholder="Penerbit" />
		</div>
		<div class="pure-control-group">
			<label for="description">Description</label>
			<form:input path="description" placeholder="Description" />
		</div>

		<form:hidden path="id" />

	</fieldset>
</form:form>