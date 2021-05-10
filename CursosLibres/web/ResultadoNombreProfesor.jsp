<%-- 
    Document   : ResultadoNombreProfesor
    Created on : 08/05/2021, 10:21:19 AM
    Author     : Gabriela Gutierrez L
--%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/listaProfesor.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <p>
            <%
             Enumeration<String> e = request.getParameterNames();
             String p = e.nextElement();
             modelo.beans.ConjuntoProfesor c = new modelo.beans.ConjuntoProfesor();
             out.println(c.toStringHTMLBusqueda(request.getParameter(p)));
            %>
        </p>
        <p>
            <a href="listadoProfesor.jsp" >Volver a la lista de profesores</a>
        </p>
    </body>
</html>
