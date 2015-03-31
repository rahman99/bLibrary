<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 3.0//EN" "http://tiles.apache.org/dtds/tiles-config_3_0.dtd">

<%@page import="java.awt.event.ActionEvent"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Sample Demo bootstrap</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">
<link href="css/sb-admin-2.css" rel="stylesheet">
<link href="font-awesome-4.1.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
</head>

<body>
	
	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top"
			role="navigation" style="margin-bottom: 0"> 
			<tiles:insertAttribute name="header" /> 
			<tiles:insertAttribute name="leftsidebar" /> 			
		</nav>

		<!-- Page Content -->
		<div id="page-wrapper">
			<!-- <div class="row">
               <div class="col-lg-12">
                   <h1 class="page-header">Blank</h1>
               </div>
           </div> -->
			<tiles:insertAttribute name="body" />
		</div>
		
		<div id="navbar navbar-default navbar-static-down">
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery Version 1.11.0 -->
	<script src="js/jquery-1.11.0.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="js/plugins/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/sb-admin-2.js"></script>

</body>
</html>