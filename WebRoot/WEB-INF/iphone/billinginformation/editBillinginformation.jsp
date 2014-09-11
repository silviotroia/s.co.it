<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title>Edit <fmt:message key="billinginformation.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="billinginformation.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="billinginformation.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveBillinginformation" method="POST" modelAttribute="billinginformation">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="billinginformation.id.title"/></span>
				<form:input id="Billinginformation_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="billinginformation.id.title"/>: ${billinginformation.id}</span>
			<form:textarea cssStyle="display:none" id="Billinginformation_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.version.title"/></span>
			<form:input id="Billinginformation_version" path="version"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.companyname.title"/></span>
			<form:input id="Billinginformation_companyName" path="companyName"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.vatnumber.title"/></span>
			<form:input id="Billinginformation_vatNumber" path="vatNumber"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.vat.title"/></span>
			<form:input id="Billinginformation_vat" path="vat"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.address.title"/></span>
			<form:input id="Billinginformation_address" path="address"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.zipcode.title"/></span>
			<form:input id="Billinginformation_zipCode" path="zipCode"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.city.title"/></span>
			<form:input id="Billinginformation_city" path="city"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.province.title"/></span>
			<form:input id="Billinginformation_province" path="province"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="billinginformation.country.title"/></span>
			<form:input id="Billinginformation_country" path="country"/>
		</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteBillinginformation?idKey=${billinginformation.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
