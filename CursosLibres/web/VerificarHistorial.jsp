<%-- 
    Document   : VerificarHistorial
    Created on : 05/05/2021, 03:11:15 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServicioHistorial" method="GET">
            <p>
                <label>Digite su numero de cedula:</label>
                <input type="text" name="id_cedula" placeholder="Cedula">
                
                <br/>
            </p>
            
            <p>
                <button type="submit">Descargar</button>
            </p>
        </form>
    </body>
</html>
