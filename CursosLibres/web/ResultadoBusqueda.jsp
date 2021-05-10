<%-- 
    Document   : ResultadoBusqueda
    Created on : 04/05/2021, 05:41:14 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/listaResultadoBusqueda.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <p>
            <%
             Enumeration<String> e = request.getParameterNames();
             String p = e.nextElement();
             modelo.beans.ConjuntoCurso c = new modelo.beans.ConjuntoCurso();
             out.println(c.toStringHTMLBusqueda2(request.getParameter(p)));
            %>
        </p>
        <p>
            <a href="VistaCursos.jsp" >Volver a la lista de cursos</a>
        </p>
    </body>
</html>
