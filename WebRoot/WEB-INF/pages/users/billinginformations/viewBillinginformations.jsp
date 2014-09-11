<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>View <fmt:message key="users.title"/> <fmt:message key="billinginformation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="billinginformation.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectUsers?idKey=${users_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
