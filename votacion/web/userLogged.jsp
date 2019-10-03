<%-- 
    Document   : userLogged
    Created on : 26/09/2019, 07:32:45 PM
    Author     : LAB-USR-CAQP-C0203
--%>

<%@page import="voto.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Logged Successfully</title>
    </head>
    <body>
        <center>
            <% UserDTO currentUser = (UserDTO)session.getAttribute("currentSessionUser");%>
            
            Welcome <%= currentUser.getFirstname() + "  "+ currentUser.getLastname()%>
        </center>
    </body>
</html>
