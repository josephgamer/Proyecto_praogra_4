<%-- 
    Document   : registroGrupo
    Created on : 08/05/2021, 02:56:38 PM
    Author     : YENDRI
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
            <h1>Formulario de registro de grupo</h1>
        </header>
        <table class="formulario">
            <body>
            <tr>
                <td class="etiqueta">Dia:&nbsp;</td>
                <td class="campo">  
                    <input type="number" name="Dia"
                           min=1 max=31
                           placeholder="(dia)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Hora:&nbsp;</td>
                <td class="campo"> 
                    <input name="Hora"
                           placeholder="(hora militar)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Numero grupo:&nbsp;</td>
                <td class="campo">  
                    <input name="Numero de grupo" 
                           placeholder="(numero de grupo)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Apellido1:&nbsp;</td>
                <td class="campo">  
                    <input name="Apellido1" 
                           placeholder="(apellido1)"/>
                </td>
            </tr>
            <tr>
                <td class="etiqueta">Apellido2:&nbsp;</td>
                <td class="campo">  
                    <input name="Apellido2" 
                           placeholder="(apellido2)"/>
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
                <td colspan="2" class="botones">
                    <button type="submit">Registrar</button>
                </td>
        </table>
    </form>
</div>
</body>
</html>
