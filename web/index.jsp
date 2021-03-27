<%-- 
    Document   : index
    Created on : Feb 22, 2021, 10:37:55 AM
    Author     : Admin
--%>

<%@page import="dto.CartObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title>
    </head>
    <body>
        <h1>Book Store</h1>
        <%
            CartObj shoppingCart=(CartObj)session.getAttribute("cart");
            
        %>
        
            <a href="view.jsp"> View Cart
            <% if(shoppingCart !=null) { %>
            (
            <%= shoppingCart.getCart().values().size()  %>
            )
            <% } %>
            </a>
            <form action="MainController"  method="POST">
            Please Choose your book:
            <select name="listBook">
                <option value="B01-Java Desktop-100">PRJ311 </option>
                <option value="B02-Java Web-200">PRJ321 </option>
                <option value="B03-IOS-400">PRJ391 </option>
                <option value="B04-Java XML-300">PRJ301 </option>
            </select> <br/>
            <input type="submit" name="action" value="Add to Cart"/>
        </form>
    </body>
</html>
