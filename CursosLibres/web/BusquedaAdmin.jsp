<%-- 
    Document   : BusquedaAdmin
    Created on : 08/05/2021, 09:56:50 AM
    Author     : YENDRI
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <%
             Enumeration<String> e = request.getParameterNames();
             String p = e.nextElement();
             modelo.beans.ConjuntoCurso c = new modelo.beans.ConjuntoCurso();
             out.println(c.toStringHTMLBusquedaAdmin(request.getParameter(p)));
            %>
        </p>
        <p>
            <a href="ListadoCursoAdmin.jsp" >Volver a la lista de cursos</a>
        </p>
    </body>
</html>
