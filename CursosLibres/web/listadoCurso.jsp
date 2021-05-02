<%-- 
    Document   : listadoCurso
    Created on : 28 abr. 2021, 16:55:45
    Author     : YENDRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de cursos</title>
        <meta charset="UTF-8">
        <link href="css/listadoCurso.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="c" class="modelo.beans.ConjuntoCurso" scope="application">
        </jsp:useBean>
        <div id="wrapper">
            <header>
                <h1>Listado de cursos</h1>
            </header>
            <div id="contents">
                <!-- Un comentario HTML -->
                <%-- Un comentario JSP --%>

                <%-- <jsp:getProperty name="personas" property="tabla"></jsp:getProperty> --%>
                <%-- <%= ((modelo.beans.ConjuntoPersonas) getServletContext().getAttribute("personas")).getTabla()%> --%>
                
                ${c.tabla}

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
