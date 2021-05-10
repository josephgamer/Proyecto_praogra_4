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
        <link href="css/registro.css" rel="stylesheet" type="text/css"/>
    </head>
    <div id="wrapper">
        <header>
            <h1>Formulario de registro de grupo</h1>
        </header>
        <form class='grup' method="GET" action="ServicioRegistroGrupo">
            <table class="formulario3">
                <body>
                    <jsp:useBean id="grupos" class="modelo.beans.ConjuntoGrupo" scope="application">
                    </jsp:useBean>


                    <jsp:useBean id="horarios" class="modelo.beans.ConjuntoHorario" scope="application">
                    </jsp:useBean>
                <tr>
                    <td class="etiqueta">Id Curso:&nbsp;</td>
                    <td class="campo">  
                        <input type="number" name="IdCurso"
                               min=1
                               placeholder="(id Curso)"/>
                    </td>
                </tr>
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
                    <td class="etiqueta">NumeroGrupo:&nbsp;</td>
                    <td class="campo">  
                        <input name="NumeroGrupo" 
                               placeholder="(numero de grupo)"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta">Id Profesor:&nbsp;</td>
                    <td class="campo">  
                        <input name="IdProfesor" 
                               placeholder="(id Profesor)"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="botones">
                        <button type="submit">Registrar</button>
                    </td>
            </table>
        </form>
        <p class='volver3'>
            <a href="Administrador.jsp" >Volver</a>
        </p>
    </div>
</body>
</html>