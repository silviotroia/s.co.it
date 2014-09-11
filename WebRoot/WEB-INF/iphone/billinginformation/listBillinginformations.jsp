<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title><fmt:message key="billinginformation.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="billinginformation.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newBillinginformation"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${billinginformations}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectBillinginformation?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.version.time}"/>
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.companyName}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.vatNumber}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.vat}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.address}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.zipCode}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.city}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.province}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.country}
					</span>					
					<span class="arrow"></span>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
