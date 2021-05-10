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
        <link href="css/listaCursos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="c" class="modelo.beans.ConjuntoCurso" scope="application">
        </jsp:useBean>
        <div id="wrapper">
            <header>
                <h1>Listado de cursos</h1>
            </header>
            <div id="etiquetas">
                <form method="GET" action="ResultadoAreaTematica.jsp">
                    <p class="let">
                        <label type="label" name="area_tematica">
                            Digite el area temática o nombre del curso:
                        </label>
                        <input type="text" name="area_tematica"/>


                        <button type="submit">Buscar</button>

                    </p>


                </form>
            </div>
            <div id="contents">
                <!-- Un comentario HTML -->
                <%-- Un comentario JSP --%>

                <%-- <jsp:getProperty name="personas" property="tabla"></jsp:getProperty> --%>
                <%-- <%= ((modelo.beans.ConjuntoPersonas) getServletContext().getAttribute("personas")).getTabla()%> --%>

                ${c.tabla}
                <%
                  String p = request.getSession(true).getAttribute("cedula").toString();
                  request.getSession(true).setAttribute("ced", p);
                %>
                <p>
                    <a><a href="historial.jsp" >Ir al historial</a> 
                </p> 
            </div>
            <footer></footer>
        </div>
    </body>
</html>
