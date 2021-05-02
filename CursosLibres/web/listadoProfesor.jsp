<%-- 
    Document   : listadoProfesor
    Created on : 27 abr. 2021, 12:19:41
    Author     : YENDRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de profesores</title>
        <meta charset="UTF-8">
        <link href="css/listadoProfesor.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="profesor" class="modelo.beans.ConjuntoProfesor" scope="application">
        </jsp:useBean>
        <div id="wrapper">
            <header>
                <h1>Listado de profesores</h1>
            </header>
            <div id="contents">
                <!-- Un comentario HTML -->
                <%-- Un comentario JSP --%>

                <%-- <jsp:getProperty name="profesores" property="tabla"></jsp:getProperty> --%>
                <%-- <%= ((modelo.beans.ConjuntoProfesor) getServletContext().getAttribute("profesores")).getTabla()%> --%>
                
                ${profesor.tabla}

            </div>
            <div style="margin-top: 24px;">
                <form action="ServicioBorrar">
                    <button>Borrar todos</button>
                </form>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
