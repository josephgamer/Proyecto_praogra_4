/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.beans.ConjuntoCurso;
import modelo.beans.Curso;

/**
 *
 * @author YENDRI
 */
@WebServlet(name = "ServicioListadoCurso", urlPatterns = {"/ServicioListadoCurso"})
public class ServicioListadoCurso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("Servlet ServicioListadoCurso..");

        try {
            Curso c = new Curso(
                    Integer.parseInt(request.getParameter("id")),
                    request.getParameter("descripcion"));

            ConjuntoCurso cursos
                    = (ConjuntoCurso) getServletContext().getAttribute("cursos");
            cursos.agregar(c);
            System.out.println(cursos);

            response.sendRedirect("listadoCurso.jsp");

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
            response.sendRedirect("error.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "ServicioListadoCurso";
    }

}
