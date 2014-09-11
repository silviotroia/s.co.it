<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="users.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexUsers"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editUsers?idKey=${users.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="users.id.title"/>: ${users.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="users.version.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${users.version.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.username.title"/></span>
			<p>
				${users.username}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.password.title"/></span>
			<p>
				${users.password}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.enabled.title"/></span>
			<p>
				${users.enabled}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.registrationdate.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${users.registrationDate.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.unconfirmed.title"/></span>
			<p>
				${users.unconfirmed}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.firstname.title"/></span>
			<p>
				${users.firstName}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.lastname.title"/></span>
			<p>
				${users.lastName}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.imageurl.title"/></span>
			<p>
				${users.imageUrl}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.email.title"/></span>
			<p>
				${users.email}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="users.expiretime.title"/></span>
			<p>
				${users.expiretime}
			</p>
		</li>
	</ul>
	<ul class="pageitem">
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listUsersDomains?idKey=${users.id}&">
				<span class="name"><fmt:message key="domain.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listUsersAuthoritieses?idKey=${users.id}&">
				<span class="name"><fmt:message key="authorities.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listUsersBillinginformations?idKey=${users.id}&">
				<span class="name"><fmt:message key="billinginformation.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteUsers?idKey=${users.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
