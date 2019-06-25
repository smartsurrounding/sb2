<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="smartpro.struts2.impl.*" %>
<%@ page import="smartpro.struts2.dao.*" %>
<%-- <%@ page import="smartpro.struts2.impl.MemberDaoImpl" %> --%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Welcome <s:property value="#session.username" /></title>
  </head>
  <body>
    <h1>Welcome <s:property value="#session.username" /></h1>
    
    <h2>
    
    <!-- allow access to member level -->
	<s:form action="loginAction" method="POST" class="form-group">
		<s:submit value="View" align="center" class="btn btn-primary" />
	</s:form>
    
    <!-- only allow access to Manager -->
	<%
		String grade = ActionContext.getContext().getSession().get("grade").toString();
		MemberDao memberDao = new MemberDaoImpl();
		if (memberDao.isManager(grade)) {
			;
	%>
		<s:form action="loginAction" method="POST" class="form-group">
			<s:submit value="Approve" align="center" class="btn btn-primary" />
		</s:form>
		<s:form action="loginAction" method="POST" class="form-group">
			<s:submit value="Reject" align="center" class="btn btn-primary" />
		</s:form>
	<%
		} else {
			;
	%>
	<%
		}
	%>
	
	

<%--     <s:property value="#session.username" /> --%>
<%--     <s:property value="#session.grade" /> --%>
    </h2>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>