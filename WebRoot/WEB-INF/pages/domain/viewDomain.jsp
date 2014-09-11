<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.domain-resources"/>
<html>
<head>
<title>View <fmt:message key="domain.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="domain.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexDomain"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.id.title"/>:
						</td>
						<td>
							${domain.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${domain.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.name.title"/>:
						</td>
						<td>
							${domain.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.enabled.title"/>:
						</td>
						<td>
							${domain.enabled}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.fullname.title"/>:
						</td>
						<td>
							${domain.fullname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="domain.verified.title"/>:
						</td>
						<td>
							${domain.verified}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="users.title"/></h1>
					
						<c:if test='${domain.users != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="users.id.title"/>:
						</td>
						<td>
							${domain.users.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${domain.users.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.username.title"/>:
						</td>
						<td>
							${domain.users.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.password.title"/>:
						</td>
						<td>
							${domain.users.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.enabled.title"/>:
						</td>
						<td>
							${domain.users.enabled}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.registrationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${domain.users.registrationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.unconfirmed.title"/>:
						</td>
						<td>
							${domain.users.unconfirmed}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.firstname.title"/>:
						</td>
						<td>
							${domain.users.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.lastname.title"/>:
						</td>
						<td>
							${domain.users.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.imageurl.title"/>:
						</td>
						<td>
							${domain.users.imageUrl}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.email.title"/>:
						</td>
						<td>
							${domain.users.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.expiretime.title"/>:
						</td>
						<td>
							${domain.users.expiretime}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editDomainUsers?domain_id=${domain.id}&users_id=${domain.users.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteDomainUsers?domain_id=${domain.id}&related_users_id=${domain.users.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${domain.users == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDomainUsers?domain_id=${domain.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>