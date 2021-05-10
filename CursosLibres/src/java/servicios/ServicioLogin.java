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
import modelo.beans.Usuario;

/**
 *
 * @author Esteban
 */
public class ServicioLogin extends HttpServlet {

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
        modelo.beans.ConjuntoUsuario cu = new modelo.beans.ConjuntoUsuario();
        Enumeration<String> e = request.getParameterNames();
        String username = null;
        String password = null;
        while (e.hasMoreElements()) {
            String p = e.nextElement();
            if (username == null) {
                username = p;
                p = null;
            }
            
            if (password == null) {
                password = p;
                p = "";
                
            }
        }
        
        if (cu.existeUsuario(request.getParameter(username), request.getParameter(password))) {
            Usuario u = new Usuario();
            u = cu.obtenerRol(request.getParameter(username), request.getParameter(password));
            switch(u.getRol_id().getId_rol()){
                case 1: 
                    response.sendRedirect("Administrador.jsp");
                    break;
                case 2:
                    request.getSession(true).setAttribute("cedula", request.getParameter(username));
                    response.sendRedirect("CursosAsignados.jsp");
                    break;
                case 3:
                    request.getSession(true).setAttribute("cedula", request.getParameter(username));
                    response.sendRedirect("listadoCurso.jsp");
                    break;
                default:
                    response.sendRedirect("index.jsp");
        }
            
        } else {
            response.sendRedirect("index.jsp");
        }
        
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
