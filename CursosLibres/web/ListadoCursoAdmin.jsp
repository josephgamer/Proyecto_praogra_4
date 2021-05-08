<%-- 
    Document   : ListadoCursoAdmin
    Created on : 08/05/2021, 09:34:22 AM
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
                ${c.tabla3}
            </div>
            <footer></footer>
        </div>
    </body>
</html>
