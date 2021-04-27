/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author YENDRI
 */
@WebServlet(name = "ServicioHistorial", urlPatterns = {"/ServicioHistorial"})
public class ServicioHistorial extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//        System.out.println("Servlet ServicioHistorial..");
//
//        try {
//            Curso c = new Curso(
//                    Integer.parseInt(request.getParameter("id")),
//                    request.getParameter("descripción"));
//      
//
//            ConjuntoPersonas personas
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

    @Override
    public String getServletInfo() {
        return "ServicioHistorial";
    }

}
