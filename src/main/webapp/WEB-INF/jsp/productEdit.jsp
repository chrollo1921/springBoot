<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<title>Product Edit Page</title>
</head>
<body>
    <div align="center">
        <h2>Product Edit Page</h2>
        <div align="center">
        <form:form action="/product/edit" method="post" modelAttribute="productEntryForm">
            <form:label path="productId">Product ID: </form:label>
            <form:input path="productId"/><br/>
             <br/>
            <form:label path="productName">Product Name: </form:label>
            <form:input path="productName"/><br/>
            <br/>
            <form:label path="productDescription">Product Description: </form:label>
            <form:input path="productDescription"/><br/>
            <br/>
            <%-- <form:label path="price">Price Value: </form:label>
            <form:input path="price"/><br/>
			<br/> --%>
           <%--  <form:label path="currency">Currency: </form:label>
            <form:select path="currency" items="${currency.isoCode}" /><br/> --%>
			<br/>
            <form:button>Edit</form:button>
        </form:form>
        </div>
    </div>
</body>
</html>