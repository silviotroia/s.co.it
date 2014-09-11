<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>List <fmt:message key="users.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="users.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsers"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${userss}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsers?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsers?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsers?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.version.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.username}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.password}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.enabled}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.registrationDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.unconfirmed}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.firstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.imageUrl}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.email}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expiretime}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>