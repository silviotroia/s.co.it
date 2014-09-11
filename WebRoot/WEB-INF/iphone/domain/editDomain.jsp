<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.domain-resources"/>
<html>
<head>
<title>Edit <fmt:message key="domain.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="domain.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="domain.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveDomain" method="POST" modelAttribute="domain">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="domain.id.title"/></span>
				<form:input id="Domain_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="domain.id.title"/>: ${domain.id}</span>
			<form:textarea cssStyle="display:none" id="Domain_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="domain.version.title"/></span>
			<form:input id="Domain_version" path="version"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="domain.name.title"/></span>
			<form:input id="Domain_name" path="name"/>
		</li>
			<li class="checkbox">
				<span class="name"><fmt:message key="domain.enabled.title"/></span>
				<form:checkbox id="Domain_enabled" path="enabled"/>
			</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="domain.fullname.title"/></span>
			<form:input id="Domain_fullname" path="fullname"/>
		</li>
			<li class="checkbox">
				<span class="name"><fmt:message key="domain.verified.title"/></span>
				<form:checkbox id="Domain_verified" path="verified"/>
			</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteDomain?idKey=${domain.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
