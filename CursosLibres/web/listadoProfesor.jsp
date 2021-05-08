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
            
             <div id="etiquetas">
                <form method="GET" action="ResultadoNombreProfesor.jsp">
                    <p class="let">
                        <label type="label" name="nombre_profesor">
                            Digite el nombre del profesor:
                        </label>
                        <input type="text" name="nombre_profesor"/>


                        <button type="submit">Buscar</button>

                    </p>


                </form>
            </div>
            
            <div id="contents">
                <!-- Un comentario HTML -->
                <%-- Un comentario JSP --%>

                <%-- <jsp:getProperty name="profesores" property="tabla"></jsp:getProperty> --%>
                <%-- <%= ((modelo.beans.ConjuntoProfesor) getServletContext().getAttribute("profesores")).getTabla()%> --%>
                
                ${profesor.tabla}

            </div>
            <footer></footer>
        </div>
    </body>
</html>
