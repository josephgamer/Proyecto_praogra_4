<%-- 
    Document   : VerEstudiantes
    Created on : 08/05/2021, 02:39:05 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/listadoEstudiante.css" rel="stylesheet" type="text/css"/>
    </head>
    <header>
        <h1>Listado de cursos</h1>
    </header>
    <br>
    </br>
    <body>
        <%
            Enumeration<String> e = request.getParameterNames();
            String p = e.nextElement();
            modelo.beans.ConjuntoNota cn = new modelo.beans.ConjuntoNota();
            out.println(cn.toStringHTMLVerEstudiantes(Integer.parseInt(request.getParameter(p))));
            request.getSession(true).setAttribute("numGrupo", request.getParameter(p));
        %>

        <p>
            <a href="CursosAsignados.jsp">Volver</a>
        </p>
    </body>
</html>
