<%@ page language="java" contentType="text/html; charset = ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Hello World Struts2</title>
</head>

<body>
	<h1>Hello World Struts2</h1>


	<h2>Hello World (Basic Action)</h2>
	<s:form action="helloAction">
		Please enter your name<br>
		<s:textfield name="name" label="Name" />
		<s:textfield name="sex" label="Sex" />
		<s:textfield name="country" label="Country" />
		<s:submit />
	</s:form>

	<h2>Print Report (Print CSV)</h2>
	<s:form action="csvPrintAction">
		<s:textfield name="id" label="Id" />
		<s:textfield name="firstName" label="FirstName" />
		<s:textfield name="lastName" label="LastName" />
		<s:textfield name="gender" label="Gender" />
		<s:textfield name="age" label="Age" />
		<s:submit />
	</s:form>

	<!-- OGNL - call static method -->
	floor :
	<s:property value="@java.lang.Math@floor(32.56)" />
	<br> random :
	<s:property value="@java.lang.Math@random()*100" />
	<br> random :
	<s:property value="@java.lang.Math@random()" />
	<br>


	<%  
            request.setAttribute("req", "request scope123");  
            request.getSession().setAttribute("sess", "session scope456");  
            request.getSession().getServletContext().setAttribute("app",  "application scope789");  
        %>
	<br>
	<s:property value="#request.req" />
	<br />
	<s:property value="#session.sess" />
	<br />
	<s:property value="#application.app" />
	<br />

        <br>  
        <s:set var="map123" value="#{'1':'eeeee','2':'ddddd','3':'ccccc','4':'bbbbb','5':'aaaaa'}"></s:set>  
        <s:iterator value="#map123" var="o">  
            <!--      ${o.key }->${o.value }<br/>   -->  
            <!-- <s:property value="#o.key"/>-><s:property value="#o.value"/><br/>   -->  
            <s:property value="key" />-><s:property value="value" />  
            <br />  
        </s:iterator>  
        <br />
        
<%-- <s:property value="@struts.action.LoginAction@get()"/> --%>
<s:property value="@java.lang.Math@floor(44.56)"/><br>
<s:property value="@@floor(44.56)"/><br>
<s:property value="@java.util.Calendar@getInstance()"/><br>
<s:property value="@struts.vo.Address@TIPS"/><br>


</body>
</html>