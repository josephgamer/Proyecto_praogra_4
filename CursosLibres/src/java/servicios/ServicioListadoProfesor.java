/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Curso;
import modelo.beans.Profesor;
import modelo.beans.ConjuntoProfesor;

/**
 *
 * @author YENDRI
 */

@WebServlet(name = "ServicioListadoProfesor", urlPatterns = {"/ServicioListadoProfesor"})
public class ServicioListadoProfesor extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//        System.out.println("Servlet ServicioListadoProfesor..");
//
//        try {
//            Profesor p = new Profesor(
//                    Integer.parseInt(request.getParameter("id")),
//                    request.getParameter("apellido1"),
//                    request.getParameter("apellido2"),
//                    request.getParameter("nombre"),
//                    request.getParameter("correo"),
//                    request.getParameter("telefono"));
//      
//            ConjuntoProfesor personas
//                    = (ConjuntoPersonas) getServletContext().getAttribute("cursos");
//            personas.agregar(c);
//            System.out.println(personas);
//
//            response.sendRedirect("historial.jsp");
//
//        } catch (IOException | NumberFormatException | SQLException | ParseException ex) {
//            System.err.printf("Excepción: '%s'%n", ex.getMessage());
//            response.sendRedirect("error.jsp");
//        }
//
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    public String getServletInfo() {
//        return "ServicioHistorial";
//    }

}


