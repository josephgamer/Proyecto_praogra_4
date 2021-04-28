<%-- 
    Document   : registroProfesor
    Created on : 28 abr. 2021, 17:26:04
    Author     : YENDRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de registro de profesor</title>
        <link href="css/registroProfesor.css" rel="stylesheet" type="text/css"/>
    </head>
    <div id="wrapper">
        <header>
            <h1>Formulario de registro de profesor</h1>
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
                <td class="etiqueta">Apellido 1:&nbsp;</td>
                <td class="campo"> 
                    <input name="Apellido1"
                           placeholder="(primer apellido)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Apellido 2:&nbsp;</td>
                <td class="campo">  
                    <input name="Apellido2" 
                           placeholder="(segundo apellido)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Nombre:&nbsp;</td>
                <td class="campo">
                    <input name="Nombre" 
                           placeholder="(nombre)"/> 
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Correo:&nbsp;</td>
                <td class="campo"> 
                    <input name="Correo" 
                           placeholder="(correo)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Telefono:&nbsp;</td>
                <td class="campo"> 
                    <input name="Telefono" 
                           placeholder="(telefono)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Especialidad:&nbsp;</td>
                <td class="campo"> 
                    <input name="Especialidad" 
                           placeholder="(especialidad)"/>
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
