<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title>View <fmt:message key="billinginformation.title"/> <fmt:message key="users.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="users.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectBillinginformation?idKey=${billinginformation_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteBillinginformationUsers?billinginformation_id=${billinginformation_id}&related_users_id=${users.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
