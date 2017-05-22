<%-- 
    Document   : dashboard
    Created on : May 19, 2017, 6:06:51 PM
    Author     : chinmay
--%>

<%@page import="org.dreamscoder.model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Welcome here</h2>
        <%
        Users user = (Users) request.getAttribute("u");
        
        %>
        <%= user.getUsername() %>
        
    </body>
</html>
