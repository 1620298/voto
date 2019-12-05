<%-- 
    Document   : index
    Created on : 26/09/2019, 07:24:39 PM
    Author     : LAB-USR-CAQP-C0203
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
<head>
	<title>Iniciar Sesion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				
                            
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
                                ps=con.prepareStatement("select * from persona");
                                rs=ps.executeQuery();
                                
                                
                            %>
                            <div>
                                <table>
                                    <tr>
                                        <th>id_persona</th>
                                        <th>dni</th>
                                        <th>nombres</th>
                                        <th>apellidos</th>
                                        <th>ubigeo</th>
                                        <th>direccion</th>
                                        <th>sexo</th>
                                        <th>estado_civil</th>
                                        <th>fecha_caducidad</th>
                                        
                                    </tr>
                                    <%
                                    while(rs.next()){
                                        
                                    
                                
                                %>
                                
                                    <tr>
                                        <td><%= rs.getString("id_persona")%></td>
                                        <td><%= rs.getString("dni")%></td>
                                        <td><%= rs.getString("nombres")%></td>
                                        <td><%= rs.getString("apellidos")%></td>
                                        <td><%= rs.getString("ubigeo")%></td>
                                        <td><%= rs.getString("direccion")%></td>
                                        <td><%= rs.getString("sexo")%></td>
                                        <td><%= rs.getString("estado_civil")%></td>
                                        <td><%= rs.getString("fecha_caducidad")%></td>
                                        <td>
                                            <a href="eliminarpersona.jsp?id_persona=<%= rs.getString("id_persona")%>">Eliminar</a>
                                        </td>
                                    </tr>
                                    <%
                                    }%>
                                </table>
                            </div>
                            
                            
                            
                            
                            
				<div class="login100-more" style="background-image: url('images/bg-01.jpg');"></div>
			</div>
		</div>
	</div>
	
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>