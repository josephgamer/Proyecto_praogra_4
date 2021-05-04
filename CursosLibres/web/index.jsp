<%-- 
    Document   : index
    Created on : 18/04/2021, 04:23:48 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
        <link href="css/default.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="ServicioLogin" method="post">
            <div class="imgcontainer">
                <img src="images/descarga.png" alt="Avatar" class="avatar" width="250" height="250">
            </div>

            <div class="container">
                <label for="uname"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="uname" required>
                
                <p>
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required>
                </p>

                
                <button type="submit">Login</button>
                <p>
                <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>
                </p>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </body>
    <nav>
        <p>
            <a href="historial.jsp">Página de registro</a>
        </p>
    </nav> 
</html>
