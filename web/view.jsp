<%-- 
    Document   : view
    Created on : Feb 22, 2021, 11:22:07 AM
    Author     : Admin
--%>

<%@page import="dto.BookDTO"%>
<%@page import="dto.CartObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View </title>
    </head>
    <body>
        <%
            CartObj shoppingCart=(CartObj)session.getAttribute("cart");       
        %>
        <h1><%= shoppingCart.getCustomerName() %>'s cart</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>BookName</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int count=0;
                    for(BookDTO dto : shoppingCart.getCart().values())
                    {
                        count ++;           
                %>
            <form action="MainController" method="POST">
                <tr>
                    <td><%= count %></td>
                    <td><%= dto.getName() %></td>
                    <td>
                        <input type="text" name="txtQuantity" value="<%= dto.getQuantity() %>"/>
                    </td>
                    <td><%= dto.getPrice() %></td>
                    <td>
                        <input type="hidden" name="txtID" value="<%= dto.getId() %>"/>
                        <input type="submit" name="action" value="Update"/>
                        <input type="submit" name="action" value="Remove"/>
                    </td>
                </tr>
                </form>
                <%
                    }
                %>
                <tr>
                    <td></td>
                    <td>
                        <a href="index.jsp">Continue Shopping </a>
                    </td>
                    <td></td>
                    <td><%= shoppingCart.getTotal() %></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
