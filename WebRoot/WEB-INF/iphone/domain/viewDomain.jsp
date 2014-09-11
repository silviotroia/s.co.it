<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.domain-resources"/>
<html>
<head>
<title>View <fmt:message key="domain.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="domain.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexDomain"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editDomain?idKey=${domain.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<ul class="pageitem">
		<li class="menu">
			<c:if test='${domain.users == null}'>
			<a href="${pageContext.request.contextPath}/newDomainUsers?domain_id=${domain.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${domain.users != null}'>
			<a href="${pageContext.request.contextPath}/selectDomainUsers?domain_id=${domain.id}&users_id=${domain.users.id}&">
				<span class="name"><fmt:message key="users.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteDomain?idKey=${domain.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
