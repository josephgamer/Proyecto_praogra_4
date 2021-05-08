<%-- 
    Document   : CursosAsignados
    Created on : 08/05/2021, 01:17:02 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        modelo.beans.ConjuntoAsignacionCursos cac = new modelo.beans.ConjuntoAsignacionCursos();
        out.println(cac.toStringAsignados(Integer.parseInt(request.getSession(true).getAttribute("cedula").toString())));
        %>
        
        <p>
            <a href="index.jsp">Cerrar Sesion</a>
        </p>
    </body>
</html>
