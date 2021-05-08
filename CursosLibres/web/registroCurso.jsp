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
        <link href="css/registroProfesor.css" rel="stylesheet" type="text/css"/>
    </head>
    <div id="wrapper">
        <header>
            <h1>Formulario de registro de cursos</h1>
        </header>
        <table class="formulario">
            <body>
            <tr>
                <td class="etiqueta">Id:&nbsp;</td>
                <td class="campo">  
                    <input type="number" name="Id"
                           min=100010001 max=999999999
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
                    <input name="Area Tematica" 
                           placeholder="(tematica)"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" class="botones">
                    <button type="reset">Borrar</button>&nbsp;
                    <button type="submit">Registrar</button>
                </td>
                </div>
                </body>
</html>