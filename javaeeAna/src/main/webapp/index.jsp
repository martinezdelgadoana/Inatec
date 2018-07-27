<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="index.css" />
    <!-- script src="index.js"></script -->
</head>
<body>
	<jsp:useBean id="login" scope="request" class="com.ipartek.formacion.javaee.modelos.LoginForm" />
    <h1>Login</h1>
    <p id="mensaje">Introduce tus <span class ="destacado">credenciales</span> para <span class="destacado">iniciar sesión</span></p>
    
    <!-- el action le dice a que parte del  deployedresources/webapp/webinf/webxml-->
    <form action="login" method="post">
        <fieldset>
            <legend>Login</legend>
            <p>
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" id="nombre" 
                	value='<jsp:getProperty property="nombre" name="login"/>' />
            </p>
            <p>
                <label for="password">Contraseña</label>
                <input type="text" name="password" id="password" />
                <input type="hidden" name="ACCION" id="ACCION" value="LOGIN"/>
            </p>
            <p>
                <button value="1">Login</button> <button value="2">Registrar</button>
                <span class="errorTexto">
                	<jsp:getProperty property="mensajeError" name="login"/>
                </span>
            </p>
        </fieldset>
    </form>
  
     
    
</body>
</html>
