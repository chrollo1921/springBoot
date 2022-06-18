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
	<div align="center">
	<h1>Product List Page:</h1>
	<c:if test="${not empty products}">

		<table border=”1 | 0”>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Currency</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product" varStatus="status">
					<tr>
						<td><a href="/product/edit/?productId=${product.id}">${product.id}</a></td>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>${price.amount}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	</div>
</body>
</html>