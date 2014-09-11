<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="users.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexUsers"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.id.title"/>:
						</td>
						<td>
							${users.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${users.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.username.title"/>:
						</td>
						<td>
							${users.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.password.title"/>:
						</td>
						<td>
							${users.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.enabled.title"/>:
						</td>
						<td>
							${users.enabled}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.registrationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${users.registrationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.unconfirmed.title"/>:
						</td>
						<td>
							${users.unconfirmed}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.firstname.title"/>:
						</td>
						<td>
							${users.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.lastname.title"/>:
						</td>
						<td>
							${users.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.imageurl.title"/>:
						</td>
						<td>
							${users.imageUrl}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.email.title"/>:
						</td>
						<td>
							${users.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="users.expiretime.title"/>:
						</td>
						<td>
							${users.expiretime}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="domain.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsersDomains?users_id=${users.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="domain.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="domain.id.title"/></th>
						<th class="thead"><fmt:message key="domain.version.title"/></th>
						<th class="thead"><fmt:message key="domain.name.title"/></th>
						<th class="thead"><fmt:message key="domain.enabled.title"/></th>
						<th class="thead"><fmt:message key="domain.fullname.title"/></th>
						<th class="thead"><fmt:message key="domain.verified.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users.domains}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsersDomains?users_id=${users.id}&domains_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsersDomains?users_id=${users.id}&domains_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsersDomains?users_id=${users.id}&related_domains_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.version.time}"/>
						&nbsp;
						</td>
						<td>
							${current.name}
						&nbsp;
						</td>
						<td>
							${current.enabled}
						&nbsp;
						</td>
						<td>
							${current.fullname}
						&nbsp;
						</td>
						<td>
							${current.verified}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="authorities.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsersAuthoritieses?users_id=${users.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="authorities.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="authorities.id.title"/></th>
						<th class="thead"><fmt:message key="authorities.version.title"/></th>
						<th class="thead"><fmt:message key="authorities.authorityname.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users.authoritieses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsersAuthoritieses?users_id=${users.id}&authoritieses_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsersAuthoritieses?users_id=${users.id}&authoritieses_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsersAuthoritieses?users_id=${users.id}&related_authoritieses_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.version.time}"/>
						&nbsp;
						</td>
						<td>
							${current.authorityName}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="billinginformation.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsersBillinginformations?users_id=${users.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="billinginformation.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="billinginformation.id.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.version.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.companyname.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.vatnumber.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.vat.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.address.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.zipcode.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.city.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.province.title"/></th>
						<th class="thead"><fmt:message key="billinginformation.country.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users.billinginformations}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsersBillinginformations?users_id=${users.id}&billinginformations_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsersBillinginformations?users_id=${users.id}&billinginformations_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsersBillinginformations?users_id=${users.id}&related_billinginformations_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.version.time}"/>
						&nbsp;
						</td>
						<td>
							${current.companyName}
						&nbsp;
						</td>
						<td>
							${current.vatNumber}
						&nbsp;
						</td>
						<td>
							${current.vat}
						&nbsp;
						</td>
						<td>
							${current.address}
						&nbsp;
						</td>
						<td>
							${current.zipCode}
						&nbsp;
						</td>
						<td>
							${current.city}
						&nbsp;
						</td>
						<td>
							${current.province}
						&nbsp;
						</td>
						<td>
							${current.country}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>