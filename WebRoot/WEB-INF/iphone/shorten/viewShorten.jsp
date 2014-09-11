<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shorten-resources"/>
<html>
<head>
<title>View <fmt:message key="shorten.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="shorten.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexShorten"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editShorten?idKey=${shorten.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="shorten.id.title"/>: ${shorten.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.version.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${shorten.version.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.creationdate.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${shorten.creationDate.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.enabled.title"/></span>
			<p>
				${shorten.enabled}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.hits.title"/></span>
			<p>
				${shorten.hits}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.shorturi.title"/></span>
			<p>
				${shorten.shorturi}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.uri.title"/></span>
			<p>
				${shorten.uri}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.title.title"/></span>
			<p>
				${shorten.title}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.description.title"/></span>
			<p>
				${shorten.description}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.image.title"/></span>
			<p>
				${shorten.image}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.userid.title"/></span>
			<p>
				${shorten.userId}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="shorten.domainid.title"/></span>
			<p>
				${shorten.domainId}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteShorten?idKey=${shorten.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
