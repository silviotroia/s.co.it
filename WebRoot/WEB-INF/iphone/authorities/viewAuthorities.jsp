<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.authorities-resources"/>
<html>
<head>
<title>View <fmt:message key="authorities.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="authorities.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexAuthorities"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editAuthorities?idKey=${authorities.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<ul class="pageitem">
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listAuthoritiesUserses?idKey=${authorities.id}&">
				<span class="name"><fmt:message key="users.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteAuthorities?idKey=${authorities.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
