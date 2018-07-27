<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comencemos a jugar</title>
</head>
<body>


<jsp:useBean id="letra" scope="session" class="com.ipartek.ahorcado.pojo.Letra" /><!-- getters y setters Tiene que ser una clase modelo, objejo -->

    
    <!-- el action le dice a que parte del  deployedresources/webapp/webinf/webxml-->
    <form action="comprobarLetra" method="post">
        <fieldset>
            <legend>Letra</legend>
            <p>
                <label for="letra">Letra</label>
                <input type="text" name="letra" id="letra" />
                	<!--value='<jsp:getProperty property="letra" name="letra"/>' /-->
            </p>
           
        </fieldset>
    </form>
  
</body>
</html>