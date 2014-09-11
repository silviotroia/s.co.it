<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shorten-resources"/>
<html>
<head>
<title>View <fmt:message key="shorten.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="shorten.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexShorten"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.id.title"/>:
						</td>
						<td>
							${shorten.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shorten.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.creationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shorten.creationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.enabled.title"/>:
						</td>
						<td>
							${shorten.enabled}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.hits.title"/>:
						</td>
						<td>
							${shorten.hits}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.shorturi.title"/>:
						</td>
						<td>
							${shorten.shorturi}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.uri.title"/>:
						</td>
						<td>
							${shorten.uri}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.title.title"/>:
						</td>
						<td>
							${shorten.title}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.description.title"/>:
						</td>
						<td>
							${shorten.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.image.title"/>:
						</td>
						<td>
							${shorten.image}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.userid.title"/>:
						</td>
						<td>
							${shorten.userId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shorten.domainid.title"/>:
						</td>
						<td>
							${shorten.domainId}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>