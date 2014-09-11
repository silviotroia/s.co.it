<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title><fmt:message key="users.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="users.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newUsers"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${userss}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectUsers?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.version.time}"/>
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.username}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.password}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.enabled}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.registrationDate.time}"/>
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.unconfirmed}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.firstName}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.lastName}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.imageUrl}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.email}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
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
