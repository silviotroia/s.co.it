<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shorten-resources"/>
<html>
<head>
<title>Edit <fmt:message key="shorten.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="shorten.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="shorten.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveShorten" method="POST" modelAttribute="shorten">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="shorten.id.title"/></span>
				<form:input id="Shorten_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="shorten.id.title"/>: ${shorten.id}</span>
			<form:textarea cssStyle="display:none" id="Shorten_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.version.title"/></span>
			<form:input id="Shorten_version" path="version"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.creationdate.title"/></span>
			<form:input id="Shorten_creationDate" path="creationDate"/>
		</li>
			<li class="checkbox">
				<span class="name"><fmt:message key="shorten.enabled.title"/></span>
				<form:checkbox id="Shorten_enabled" path="enabled"/>
			</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.hits.title"/></span>
			<form:input id="Shorten_hits" path="hits"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.shorturi.title"/></span>
			<form:input id="Shorten_shorturi" path="shorturi"/>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.uri.title"/></span>
			<form:textarea rows="10" id="Shorten_uri" path="uri"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.title.title"/></span>
			<form:input id="Shorten_title" path="title"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.description.title"/></span>
			<form:input id="Shorten_description" path="description"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.image.title"/></span>
			<form:input id="Shorten_image" path="image"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.userid.title"/></span>
			<form:input id="Shorten_userId" path="userId"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="shorten.domainid.title"/></span>
			<form:input id="Shorten_domainId" path="domainId"/>
		</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteShorten?idKey=${shorten.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
