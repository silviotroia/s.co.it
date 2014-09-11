<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/> <fmt:message key="billinginformation.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="billinginformation.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listUsersBillinginformations?idKey=${users_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editUsersBillinginformations?users_id=${users_id}&billinginformations_id=${billinginformation.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="billinginformation.id.title"/>: ${billinginformation.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.version.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${billinginformation.version.time}"/>
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.companyname.title"/></span>
			<p>
				${billinginformation.companyName}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.vatnumber.title"/></span>
			<p>
				${billinginformation.vatNumber}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.vat.title"/></span>
			<p>
				${billinginformation.vat}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.address.title"/></span>
			<p>
				${billinginformation.address}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.zipcode.title"/></span>
			<p>
				${billinginformation.zipCode}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.city.title"/></span>
			<p>
				${billinginformation.city}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.province.title"/></span>
			<p>
				${billinginformation.province}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="billinginformation.country.title"/></span>
			<p>
				${billinginformation.country}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteUsersBillinginformations?users_id=${users_id}&related_billinginformations_id=${billinginformation.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
