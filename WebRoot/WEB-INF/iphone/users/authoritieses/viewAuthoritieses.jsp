<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/> <fmt:message key="authorities.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="authorities.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listUsersAuthoritieses?idKey=${users_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editUsersAuthoritieses?users_id=${users_id}&authoritieses_id=${authorities.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="authorities.id.title"/>: ${authorities.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="authorities.version.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${authorities.version.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="authorities.authorityname.title"/></span>
			<p>
				${authorities.authorityName}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteUsersAuthoritieses?users_id=${users_id}&related_authoritieses_id=${authorities.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
