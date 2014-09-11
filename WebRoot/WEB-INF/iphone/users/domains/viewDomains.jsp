<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/> <fmt:message key="domain.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="domain.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listUsersDomains?idKey=${users_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editUsersDomains?users_id=${users_id}&domains_id=${domain.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="domain.id.title"/>: ${domain.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="domain.version.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${domain.version.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="domain.name.title"/></span>
			<p>
				${domain.name}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="domain.enabled.title"/></span>
			<p>
				${domain.enabled}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="domain.fullname.title"/></span>
			<p>
				${domain.fullname}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="domain.verified.title"/></span>
			<p>
				${domain.verified}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteUsersDomains?users_id=${users_id}&related_domains_id=${domain.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
