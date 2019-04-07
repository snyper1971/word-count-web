<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Word Count Results</title>
</head>

<body>
	<h2>Submitted Text String</h2>
	<table>
		<tr>
			<td>${originalText}</td>
		</tr>
	</table>
	<br />
	<table>
		<tr>
			<td><h2>Alphabetical</h2></td>
			<td><h2>By Frequency</h2></td>
		</tr>
		<tr>
			<td>
				<table>
					<tr>
						<td>
							<div id="alpha">
								<c:if test="${not empty sortedAlphabetical}">
									<table>
										<c:forEach var="word" items="${sortedAlphabetical}">
											<tr>
												<td>${word.text}</td>
												<td>${word.frequencyCount}</td>
											</tr>
										</c:forEach>
									</table>
								</c:if>
							</div>
						</td>
					</tr>					
				</table>
			</td>
			<td>					
				<table>
					<tr>
						<td>
							<div id="frequency">
								<c:if test="${not empty sortedByFrequency}">
									<table>
										<c:forEach var="word" items="${sortedByFrequency}">
											<tr>
												<td>${word.text}</td>
												<td>${word.frequencyCount}</td>
											</tr>
										</c:forEach>
									</table>
								</c:if>
							</div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>