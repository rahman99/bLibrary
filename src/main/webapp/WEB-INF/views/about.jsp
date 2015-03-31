<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 3.0//EN" "http://tiles.apache.org/dtds/tiles-config_3_0.dtd"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="homepage">
	<tiles:putAttribute name="body">
		<div align="center">
			<h1>Books List</h1>
			
			<h3>Test looping menu name</h3>
			<c:forEach var="type" items="${types}">
				<c:out value="${type}"/>
				<br/>
			</c:forEach>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>
