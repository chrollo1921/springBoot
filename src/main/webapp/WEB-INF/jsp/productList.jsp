<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List Page</title>
</head>
<body>

	<h1>Product List Page:</h1>
	<c:if test="${not empty products}">

		<table border=”1 | 0”>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product" varStatus="status">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.description}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>