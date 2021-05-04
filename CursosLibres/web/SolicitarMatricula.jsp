<%-- 
    Document   : VerificarMatricula
    Created on : 04/05/2021, 04:44:19 PM
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
        <form action="ServicioMatricula" method="post">
            <p>
                <label>Digite su numero de cedula</label>
                <input type="text" name="id_cedula" placeholder="Cedula">
                <br/>
                <button type="submit">Matricular</button>
            </p>
            <p>
                <a><a href="listadoCurso.jsp" >Volver al listado de cursos</a>
            </p>
        </form>
    </body>
</html>
