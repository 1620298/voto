<%-- 
    Document   : resultados
    Created on : 05/12/2019, 03:00:11 PM
    Author     : Gianpiero
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="org.jfree.chart.*"%>
<%@page import="org.jfree.chart.plot.*"%>
<%@page import="org.jfree.data.category.*"%>
<%@page import="java.sql.*"%>
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
                                ps=con.prepareStatement("SELECT p.nombres, COUNT(*) as total FROM voto AS v INNER JOIN candidato AS c ON v.presidente = c.id_candidato INNER JOIN persona AS p ON c.id_persona = p.id_persona GROUP by p.nombres");                                
                                rs=ps.executeQuery();
                                
                                
                                DefaultCategoryDataset data =new DefaultCategoryDataset();
                                while(rs.next()){
                                    data.setValue(rs.getInt(2), "total", rs.getString(1));
                                }
                                
                                
                                JFreeChart grafico=ChartFactory.createBarChart("Resultados","partido","total",data, PlotOrientation.VERTICAL,true,true,true);
                                
                                response.setContentType("image/JPEG");
                                OutputStream sa=response.getOutputStream();
                                
                                ChartUtilities.writeChartAsJPEG(sa, grafico, 500, 500);
                            %>
                            
                            
        
        
        <h1>Hello World!</h1>
    </body>
</html>
