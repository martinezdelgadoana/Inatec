<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="index.css" />
    <link rel="stylesheet" type="text/css" href="index.css" media="screen" />
</head>
</head>
<body>
	<jsp:useBean id="inicio" scope="request" class="com.ipartek.ahorcado.servlets.InicioServlet"/>
	<!--modelos.LoginForm" /-->
   	<h1>Ahorcado</h1>
	<h3>Vamos a jugar a un juego</h3>
    
    <!-- el action le dice a que parte del  deployedresources/webapp/webinf/webxml-->
    <form action="comenzarJuego" method="post">
        <button value="enviar">enviar</button>
    </form>
  

    
</body>
</html>
