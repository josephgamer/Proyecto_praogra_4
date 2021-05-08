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
        <title>Página de registro</title>
        <link href="css/registro.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="profesores" class="modelo.beans.ConjuntoProfesor" scope="application">
        </jsp:useBean>
        <div id="wrapper">
            <header>
                <h1>Formulario de registro</h1>
            </header>
            <form method="GET" action="RegistroProf">
                <table class="formulario" action="RegistroProf">

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
                        <td class="etiqueta">Contraseña:&nbsp;</td>
                        <td class="campo"> 
                            <input name="Contrasena" type="password" 
                                   placeholder="Escriba una contraseña"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="botones">
                            <button type="submit">Registrar</button>
                        </td>
                    <p>
                        <a href="index.jsp" >Volver al login</a>
                    </p>


                </table>
            </form>
        </div>
    </body>
</html>
