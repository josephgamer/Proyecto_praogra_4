<%-- 
    Document   : BusquedaProfesor
    Created on : 08/05/2021, 10:22:51 AM
    Author     : Gabriela Gutierrez L
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <%
             Enumeration<String> e = request.getParameterNames();
             String p = e.nextElement();
             modelo.beans.ConjuntoProfesor c = new modelo.beans.ConjuntoProfesor();
             out.println(c.toStringHTMLBusqueda2(request.getParameter(p)));
             out.println(c);
            %>
        </p>
        <p>
            <a href="VistaCursos.jsp" >Volver a la lista de cursos</a>
        </p>
    </body>
</html>
