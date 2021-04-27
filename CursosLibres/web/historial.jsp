<%-- 
    Document   : historial
    Created on : 27 abr. 2021, 11:38:32
    Author     : YENDRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Historial de cursos</title>
        <meta charset="UTF-8">
        <link href="css/historial.css" rel="stylesheet" type="text/css"/>
    </head>
    <table class="historial">
    <body>
        <div id="wrapper">
            <header>
                <h1>Historial de cursos</h1>
            </header>
            <div id="contents">
                <!-- Un comentario HTML -->
                <%-- Un comentario JSP --%>

                <%-- <jsp:getProperty name="personas" property="tabla"></jsp:getProperty> --%>
                <%-- <%= ((modelo.beans.ConjuntoPersonas) getServletContext().getAttribute("personas")).getTabla()%> --%>
                ${personas.tabla}

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
