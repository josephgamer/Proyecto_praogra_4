<%-- 
    Document   : ResultadoAreaTematica
    Created on : 03/05/2021, 03:06:07 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/listaResultadoArea.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <p>
            <%
             Enumeration<String> e = request.getParameterNames();
             String p = e.nextElement();
             modelo.beans.ConjuntoCurso c = new modelo.beans.ConjuntoCurso();
             out.println(c.toStringHTMLBusquedaPrueba(request.getParameter(p)));
            %>
        </p>
        <p>
            <a href="ListadoCursoAdmin.jsp" >Volver</a>
        </p>
    </body>
</html>
