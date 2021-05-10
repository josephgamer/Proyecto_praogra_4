/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.beans.AreaTematica;
import modelo.beans.ConjuntoEspecialidad;
import modelo.beans.ConjuntoProfesor;
import modelo.beans.Especialidad;
import modelo.beans.Profesor;
import modelo.beans.Rol;
import modelo.beans.Usuario;

/**
 *
 * @author YENDRI
 */
@WebServlet(name = "RegistroProf", urlPatterns = {"/RegistroProf"})
public class RegistroProf extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");
        System.out.println(request.getParameter("Id"));
        System.out.println(request.getParameter("Nombre"));
        System.out.println(request.getParameter("Apellido1"));
        System.out.println(request.getParameter("Apellido2"));
        Profesor profesor = new Profesor();
        Rol rol = new Rol();
        Date date = new Date();
        AreaTematica area = new AreaTematica();
        Especialidad especialidad = new Especialidad();
        area.setId_area(Integer.parseInt(request.getParameter("area")));
        rol.setDescripcion("Profesor");
        rol.setId_rol(2);
        profesor.setId_profesor(Integer.parseInt(request.getParameter("Id")));
        profesor.setApellido1(request.getParameter("Apellido1"));
        profesor.setApellido2(request.getParameter("Apellido2"));
        profesor.setNombre(request.getParameter("Nombre"));
        profesor.setTelefono(request.getParameter("Telefono"));
        profesor.setEmail(request.getParameter("Correo"));
        especialidad.setArea_tematica_id(area);
        especialidad.setProfe_id_profe(profesor);
        
        Usuario user = new Usuario();
        user.setActivo(false);
        user.setClave(request.getParameter("Contrasena"));
        user.setId_usuario(request.getParameter("Id"));
        user.setRol_id(rol);
        user.setUltimo_acceso(date);
        profesor.setUsuario_id(user);
        
        ConjuntoProfesor cp
                    = (ConjuntoProfesor) getServletContext().getAttribute("profesores");
        cp.agregar2(profesor);       
        ConjuntoEspecialidad ce = (ConjuntoEspecialidad) getServletContext().getAttribute("especialidad");
        ce.agregarEspecialidad(especialidad);
        response.sendRedirect("Administrador.jsp");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(RegistroProf.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println(ex);
            Logger.getLogger(RegistroProf.class.getName()).log(Level.SEVERE, null, ex);
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
