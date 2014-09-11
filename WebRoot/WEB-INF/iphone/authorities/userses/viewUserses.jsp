<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.authorities-resources"/>
<html>
<head>
<title>View <fmt:message key="authorities.title"/> <fmt:message key="users.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="users.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listAuthoritiesUserses?idKey=${authorities_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editAuthoritiesUserses?authorities_id=${authorities_id}&userses_id=${users.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<a href="${pageContext.request.contextPath}/deleteAuthoritiesUserses?authorities_id=${authorities_id}&related_userses_id=${users.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
