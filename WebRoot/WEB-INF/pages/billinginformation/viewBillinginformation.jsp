<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.billinginformation-resources"/>
<html>
<head>
<title>View <fmt:message key="billinginformation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="billinginformation.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexBillinginformation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.id.title"/>:
						</td>
						<td>
							${billinginformation.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${billinginformation.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.companyname.title"/>:
						</td>
						<td>
							${billinginformation.companyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.vatnumber.title"/>:
						</td>
						<td>
							${billinginformation.vatNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.vat.title"/>:
						</td>
						<td>
							${billinginformation.vat}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.address.title"/>:
						</td>
						<td>
							${billinginformation.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.zipcode.title"/>:
						</td>
						<td>
							${billinginformation.zipCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.city.title"/>:
						</td>
						<td>
							${billinginformation.city}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.province.title"/>:
						</td>
						<td>
							${billinginformation.province}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="billinginformation.country.title"/>:
						</td>
						<td>
							${billinginformation.country}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="users.title"/></h1>
					
						<c:if test='${billinginformation.users != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="users.id.title"/>:
						</td>
						<td>
							${billinginformation.users.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.version.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${billinginformation.users.version.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.username.title"/>:
						</td>
						<td>
							${billinginformation.users.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.password.title"/>:
						</td>
						<td>
							${billinginformation.users.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.enabled.title"/>:
						</td>
						<td>
							${billinginformation.users.enabled}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.registrationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${billinginformation.users.registrationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.unconfirmed.title"/>:
						</td>
						<td>
							${billinginformation.users.unconfirmed}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.firstname.title"/>:
						</td>
						<td>
							${billinginformation.users.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.lastname.title"/>:
						</td>
						<td>
							${billinginformation.users.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.imageurl.title"/>:
						</td>
						<td>
							${billinginformation.users.imageUrl}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.email.title"/>:
						</td>
						<td>
							${billinginformation.users.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="users.expiretime.title"/>:
						</td>
						<td>
							${billinginformation.users.expiretime}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editBillinginformationUsers?billinginformation_id=${billinginformation.id}&users_id=${billinginformation.users.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteBillinginformationUsers?billinginformation_id=${billinginformation.id}&related_users_id=${billinginformation.users.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${billinginformation.users == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newBillinginformationUsers?billinginformation_id=${billinginformation.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>