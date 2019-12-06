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
                                ps=con.prepareStatement("select * from candidato");
                                rs=ps.executeQuery();
                                
                                
                            %>
                            <div>
                                <table>
                                    <tr>
                                        <th>id_candidato</th>
                                        <th>id_persona</th>
                                        <th>tipo</th>
                                        <th>foto</th>
                                        <th>id_partido</th>
                                    </tr>
                                    <%
                                    while(rs.next()){
                                        
                                    
                                
                                %>
                                
                                    <tr>
                                        <td><%= rs.getString("id_candidato")%></td>
                                        <td><%= rs.getString("id_persona")%></td>
                                        <td><%= rs.getString("tipo")%></td>
                                        <td><%= rs.getString("foto")%></td>
                                        <td><%= rs.getString("id_partido")%></td>
                                        <td>
                                            <a href="eliminarcandidato.jsp?id_candidato=<%= rs.getString("id_candidato")%>">Eliminar</a>
                                        </td>
                                    </tr>
                                    <%
                                    }%>
                                </table>
                            </div>
                            
                            
                            
				
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