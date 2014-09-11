<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>Edit <fmt:message key="users.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="users.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="users.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveUsers" method="POST" modelAttribute="users">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="users.id.title"/></span>
				<form:input id="Users_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="users.id.title"/>: ${users.id}</span>
			<form:textarea cssStyle="display:none" id="Users_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="users.version.title"/></span>
			<form:input id="Users_version" path="version"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.username.title"/></span>
			<form:input id="Users_username" path="username"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.password.title"/></span>
			<form:input id="Users_password" path="password"/>
		</li>
			<li class="checkbox">
				<span class="name"><fmt:message key="users.enabled.title"/></span>
				<form:checkbox id="Users_enabled" path="enabled"/>
			</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.registrationdate.title"/></span>
			<form:input id="Users_registrationDate" path="registrationDate"/>
		</li>
			<li class="checkbox">
				<span class="name"><fmt:message key="users.unconfirmed.title"/></span>
				<form:checkbox id="Users_unconfirmed" path="unconfirmed"/>
			</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.firstname.title"/></span>
			<form:input id="Users_firstName" path="firstName"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.lastname.title"/></span>
			<form:input id="Users_lastName" path="lastName"/>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.imageurl.title"/></span>
			<form:textarea rows="10" id="Users_imageUrl" path="imageUrl"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.email.title"/></span>
			<form:input id="Users_email" path="email"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="users.expiretime.title"/></span>
			<form:input id="Users_expiretime" path="expiretime"/>
		</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteUsers?idKey=${users.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
