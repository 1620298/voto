<%-- 
    Document   : eliminarpersona
    Created on : 05/12/2019, 10:30:23 AM
    Author     : Gianpiero
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                                Connection con;
                                String url="jdbc:mysql://localhost/votacion";
                                String Driver="com.mysql.jdbc.Driver";
                                String user="root";
                                String clave="";
                                Class.forName(Driver);
                                con=DriverManager.getConnection(url,user,clave);
                                
                                
                                PreparedStatement ps;
                                ResultSet rs;
                                
                                String id_partido=request.getParameter("id_partido");
                                ps=con.prepareStatement("delete from partido where id_partido="+id_partido);
                                ps.executeUpdate();
                                
                                response.sendRedirect("verpartido.jsp");
                                
                                
                            %>
        
        
    </body>
</html>
