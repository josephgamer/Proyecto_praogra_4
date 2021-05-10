<%-- 
    Document   : registroCurso
    Created on : 08/05/2021, 12:32:47 AM
    Author     : Gabriela Gutierrez L
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Cursos</title>
        <link href="css/registro.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="cursos" class="modelo.beans.ConjuntoCurso" scope="application">
        </jsp:useBean>
        <div id="wrapper">
            <header>
                <h1>Formulario de Curso</h1>
            </header>
            <form class='curs' method="GET" action="ServRegistroCurso">
                <table class="formulario1" action="ServRegistroCurso">
                    <tr>
                        <td class="etiqueta">Id:&nbsp;</td>
                        <td class="campo">  
                            <input type="number" name="Id"
                                   min=1
                                   placeholder="(id)"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="etiqueta">Descripcion:&nbsp;</td>
                        <td class="campo"> 
                            <input name="Descripcion"
                                   placeholder="(descripcion)"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="etiqueta">Tematica:&nbsp;</td>
                        <td class="campo">  
                            <input name="Tematica" id="Tematica"
                                   placeholder="(area tematica)"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="botones">
                            <button type="submit">Registrar</button>
                        </td>
                    </tr>
                </table>
            </form>
            <p class='volver1'>
                <a href="Administrador.jsp" >Volver</a>
            </p>
        </div>
    </body>
</html>