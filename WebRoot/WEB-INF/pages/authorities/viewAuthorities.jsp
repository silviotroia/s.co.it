<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.authorities-resources"/>
<html>
<head>
<title>View <fmt:message key="authorities.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="authorities.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAuthorities"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="authorities.id.title"/>:
						</td>
						<td>
							${authorities.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="authorities.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${authorities.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="authorities.authorityname.title"/>:
						</td>
						<td>
							${authorities.authorityName}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="users.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAuthoritiesUserses?authorities_id=${authorities.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="users.id.title"/></th>
						<th class="thead"><fmt:message key="users.version.title"/></th>
						<th class="thead"><fmt:message key="users.username.title"/></th>
						<th class="thead"><fmt:message key="users.password.title"/></th>
						<th class="thead"><fmt:message key="users.enabled.title"/></th>
						<th class="thead"><fmt:message key="users.registrationdate.title"/></th>
						<th class="thead"><fmt:message key="users.unconfirmed.title"/></th>
						<th class="thead"><fmt:message key="users.firstname.title"/></th>
						<th class="thead"><fmt:message key="users.lastname.title"/></th>
						<th class="thead"><fmt:message key="users.imageurl.title"/></th>
						<th class="thead"><fmt:message key="users.email.title"/></th>
						<th class="thead"><fmt:message key="users.expiretime.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${authorities.userses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAuthoritiesUserses?authorities_id=${authorities.id}&userses_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAuthoritiesUserses?authorities_id=${authorities.id}&userses_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAuthoritiesUserses?authorities_id=${authorities.id}&related_userses_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
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
							${current.username}
						&nbsp;
						</td>
						<td>
							${current.password}
						&nbsp;
						</td>
						<td>
							${current.enabled}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.registrationDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.unconfirmed}
						&nbsp;
						</td>
						<td>
							${current.firstName}
						&nbsp;
						</td>
						<td>
							${current.lastName}
						&nbsp;
						</td>
						<td>
							${current.imageUrl}
						&nbsp;
						</td>
						<td>
							${current.email}
						&nbsp;
						</td>
						<td>
							${current.expiretime}
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