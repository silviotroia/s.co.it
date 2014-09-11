<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shorten-resources"/>
<html>
<head>
<title>List <fmt:message key="shorten.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="shorten.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newShorten"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="shorten.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="shorten.id.title"/></th>
					<th class="thead"><fmt:message key="shorten.version.title"/></th>
					<th class="thead"><fmt:message key="shorten.creationdate.title"/></th>
					<th class="thead"><fmt:message key="shorten.enabled.title"/></th>
					<th class="thead"><fmt:message key="shorten.hits.title"/></th>
					<th class="thead"><fmt:message key="shorten.shorturi.title"/></th>
					<th class="thead"><fmt:message key="shorten.uri.title"/></th>
					<th class="thead"><fmt:message key="shorten.title.title"/></th>
					<th class="thead"><fmt:message key="shorten.description.title"/></th>
					<th class="thead"><fmt:message key="shorten.image.title"/></th>
					<th class="thead"><fmt:message key="shorten.userid.title"/></th>
					<th class="thead"><fmt:message key="shorten.domainid.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${shortens}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectShorten?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editShorten?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteShorten?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
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
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.creationDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.enabled}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.hits}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.shorturi}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.uri}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.title}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.image}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.domainId}
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