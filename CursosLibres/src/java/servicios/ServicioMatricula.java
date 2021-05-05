/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.beans.Estudiante;
import modelo.beans.Grupo;
import modelo.beans.Matricula;

/**
 *
 * @author Esteban
 */
public class ServicioMatricula extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        Enumeration<String> e = request.getParameterNames();
        String numGrupo = null;
        String cedula = null;
        while (e.hasMoreElements()) {
            String p = e.nextElement();
            if (cedula == null) {
                cedula = p;
                p = null;
            }

            if (numGrupo == null) {
                numGrupo = p;
                p = "";

            }
        }
        modelo.beans.ConjuntoGrupo cg = new modelo.beans.ConjuntoGrupo();
        modelo.beans.ConjuntoMatricula cm = new modelo.beans.ConjuntoMatricula();
        Matricula matricula = new Matricula();
        Grupo g = cg.buscarCurso(Integer.parseInt(request.getParameter(numGrupo)));
        Estudiante student = new Estudiante();
        student.setId_estudiante(Integer.parseInt(request.getParameter(cedula)));
        matricula.setGrupo_num(g.getNum_grupo());
        matricula.setCurso_id(g.getCurso_id().getId_curso());
        matricula.setEstudiante_id(student);
        cm.agregar(matricula);
        response.sendRedirect("listadoCurso.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
