/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.beans.ConjuntoEstudiantes;
import modelo.beans.Estudiante;
import modelo.beans.Rol;
import modelo.beans.Usuario;

/**
 *
 * @author Esteban
 */
public class RegistroEstudiante extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(request.getParameter("Id"));
        System.out.println(request.getParameter("Nombre"));
        System.out.println(request.getParameter("Apellido1"));
        System.out.println(request.getParameter("Apellido2"));
        Estudiante student = new Estudiante();
        Rol rol = new Rol();
        Date date = new Date();
        rol.setDescripcion("Estudiante");
        rol.setId_rol(3);
        student.setId_estudiante(Integer.parseInt(request.getParameter("Id")));
        student.setNombre(request.getParameter("Nombre"));
        student.setApellido1(request.getParameter("Apellido1"));
        student.setApellido2(request.getParameter("Apellido2"));
        student.setEmail(request.getParameter("Correo"));
        student.setTelefono(request.getParameter("Telefono"));
        Usuario user = new Usuario();
        user.setActivo(false);
        user.setClave(request.getParameter("Contrasena"));
        user.setId_usuario(request.getParameter("Id"));
        user.setRol_id(rol);
        user.setUltimo_acceso(date);
        student.setUsuario_id(user);
        ConjuntoEstudiantes ce
                    = (ConjuntoEstudiantes) getServletContext().getAttribute("estudiantes");
        ce.agregar(student);
        response.sendRedirect("index.jsp");
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
            Logger.getLogger(RegistroEstudiante.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RegistroEstudiante.class.getName()).log(Level.SEVERE, null, ex);
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
