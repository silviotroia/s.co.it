<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.authorities-resources"/>
<html>
<head>
<title>Edit <fmt:message key="authorities.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="authorities.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="authorities.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveAuthorities" method="POST" modelAttribute="authorities">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="authorities.id.title"/></span>
				<form:input id="Authorities_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="authorities.id.title"/>: ${authorities.id}</span>
			<form:textarea cssStyle="display:none" id="Authorities_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="authorities.version.title"/></span>
			<form:input id="Authorities_version" path="version"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="authorities.authorityname.title"/></span>
			<form:input id="Authorities_authorityName" path="authorityName"/>
		</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteAuthorities?idKey=${authorities.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
