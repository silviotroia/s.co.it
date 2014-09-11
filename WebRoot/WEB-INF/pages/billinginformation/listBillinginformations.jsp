<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title>List <fmt:message key="billinginformation.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="billinginformation.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newBillinginformation"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="billinginformation.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${billinginformations}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectBillinginformation?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editBillinginformation?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteBillinginformation?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
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
						
							${current.companyName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vatNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.vat}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.city}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.province}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.country}
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