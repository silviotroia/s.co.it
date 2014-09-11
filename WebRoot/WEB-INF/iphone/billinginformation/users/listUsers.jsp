<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title><fmt:message key="billinginformation.title"/> <fmt:message key="users.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="billinginformation.title"/> <fmt:message key="users.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectBillinginformation?idKey=${billinginformation.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newBillinginformationUsers?billinginformation_id=${billinginformation.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="billinginformation.id.title"/>: ${billinginformation.id}</span>
	<ul class="pageitem">
		<c:forEach items="${billinginformation.users}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectBillinginformationUsers?billinginformation_id=${billinginformation.id}&users_id=${current.id}&">
					<span class="name">
						${current.id}
					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.version.time}"/>
					
						${current.username}
					
						${current.password}
					
						${current.enabled}
					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.registrationDate.time}"/>
					
						${current.unconfirmed}
					
						${current.firstName}
					
						${current.lastName}
					
						${current.imageUrl}
					
						${current.email}
					
						${current.expiretime}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
