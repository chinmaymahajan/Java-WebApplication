<%-- 
    Document   : index
    Created on : May 19, 2017, 5:51:14 PM
    Author     : chinmay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <link rel="stylesheet" type="text/css" href="style/default.css">
    </head>
    <body>
     
        <div id="loginPanel">
            <form action="login" method="post">
            Username : <input type="text" name="uname">
            Password : <input type="password" name="password">
            <input type="submit" name="Login" value="Login">
            </form>
        </div>
        
       
    </body>
</html>
