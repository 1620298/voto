<%-- 
    Document   : index
    Created on : 26/09/2019, 07:24:39 PM
    Author     : LAB-USR-CAQP-C0203
--%>

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
				
					<div class="w-full text-center">
						<a href="signup.jsp" class="txt3">
							Registrar Persona
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="verpersonas.jsp" class="txt3">
							Ver personas
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="registrarelector.jsp" class="txt3">
							Registrar Elector
						</a>
                                </div>
                            <div class="w-full text-center">
                                <a href="verelector.jsp" class="txt3">
							Ver Elector
						</a>
                            </div>
                                            <div class="w-full text-center">
						<a href="registrarlocal.jsp" class="txt3">
							Registrar Local
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="verlocal.jsp" class="txt3">
							Ver Local
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="registrarmesa.jsp" class="txt3">
							Registrar Mesa
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="vermesa.jsp" class="txt3">
							Ver Mesa
						</a>
					</div>
			<div class="w-full text-center">
						<a href="registrarpartido.jsp" class="txt3">
							Registrar Partido
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="verpartido.jsp" class="txt3">
							Ver Partido
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="registrarcandidato.jsp" class="txt3">
							Registrar Candidato
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="vercandidato.jsp" class="txt3">
							Ver Candidato
						</a>
					</div>
                            <div class="w-full text-center">
						<a href="resultados.jsp" class="txt3">
							VER RESULTADOS
						</a>
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