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
import java.util.Enumeration;
import modelo.beans.Estado;
import modelo.beans.Estudiante;
import modelo.beans.Matricula;

/**
 *
 * @author Esteban
 */
public class ServicioNota extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        modelo.beans.ConjuntoNota cn = new modelo.beans.ConjuntoNota();
        Enumeration<String> e = request.getParameterNames();
        String ced = null;
        String nota = null;
        while (e.hasMoreElements()) {
            String p = e.nextElement();
            
            if (nota == null) {
                nota = p;
                p = null;
                
            }
            
            if (ced == null) {
                ced = p;
                p = "";
            }
            
        }
        Matricula m = new Matricula();
        Estudiante est = new Estudiante();
        est.setId_estudiante(Integer.parseInt(request.getParameter(ced)));
        Estado ee = new Estado();
        m.setNota(Integer.parseInt(request.getParameter(nota)));
        m.setEstudiante_id(est);
        if (m.getNota() >= 70) {
            ee.setId_estado(1);
            m.setEstado_id(ee);
        } else {
            ee.setId_estado(2);
            m.setEstado_id(ee);
        }
        cn.actualizarNota(m.getEstudiante_id().getId_estudiante(), m);
        response.sendRedirect("CursosAsignados.jsp");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
