<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="title"/></title>
<style>
	.error{color:red;}
</style>
</head>
<body>
	<h1><fmt:message key="priceincrease.heading"/></h1>
	<form:form method="post" commandName="priceIncrease">
		<table>
			<tr>
				<td align="right" width="20%">Increase (%)</td>
				<td width="20%">
					<form:input path="percentage"/>
				</td>	
				<td width="60%">
					<form:errors path="percentage" cssClass="error"/>
				</td>
			</tr>
		</table>
		<br/>
		<input type="submit" value="Execute"/>
	</form:form>
	<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>