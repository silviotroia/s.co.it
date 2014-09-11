<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shorten-resources"/>
<html>
<head>
<title><fmt:message key="shorten.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="shorten.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newShorten"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${shortens}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectShorten?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.version.time}"/>
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.creationDate.time}"/>
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.enabled}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.hits}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.shorturi}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.uri}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.title}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.description}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.image}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.userId}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.domainId}
					</span>					
					<span class="arrow"></span>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
