<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title><fmt:message key="users.title"/> <fmt:message key="domain.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="users.title"/> <fmt:message key="domain.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectUsers?idKey=${users.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newUsersDomains?users_id=${users.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="users.id.title"/>: ${users.id}</span>
	<ul class="pageitem">
		<c:forEach items="${users.domains}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectUsersDomains?users_id=${users.id}&domains_id=${current.id}&">
					<span class="name">
						${current.id}
					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.version.time}"/>
					
						${current.name}
					
						${current.enabled}
					
						${current.fullname}
					
						${current.verified}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
