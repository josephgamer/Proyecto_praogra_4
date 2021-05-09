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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.beans.Horario;
import modelo.beans.ConjuntoGrupo;
import modelo.beans.ConjuntoHorario;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
import modelo.beans.ConjuntoProfesor;
import modelo.beans.Curso;
import modelo.beans.Grupo;
import modelo.beans.Profesor;
import modelo.beans.Rol;
import modelo.beans.Usuario;

/**
 *
 * @author YENDRI
 */
@WebServlet(name = "ServicioRegistroGrupo", urlPatterns = {"/ServicioRegistroGrupo"})
public class ServicioRegistroGrupo extends HttpServlet {

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

        Grupo grupito = new Grupo();     
        Curso cursito = new Curso();
        Profesor profesor = new Profesor();
        Horario horario = new Horario();
        
        grupito.setNum_grupo(Integer.parseInt(request.getParameter("NumeroGrupo")));
        cursito.setId_curso(Integer.parseInt(request.getParameter("IdCurso")));
        grupito.setCurso_id(cursito);
        profesor.setId_profesor(Integer.parseInt(request.getParameter("IdProfesor")));
        grupito.setProfesor_id(profesor);
        
        horario.setGrupo_curso_id(cursito);
        horario.setGrupo_num(grupito);
        horario.setDia(Integer.parseInt(request.getParameter("Dia")));
        horario.setHora(Integer.parseInt(request.getParameter("Hora")));
        

        //Grupo
         ConjuntoGrupo cg = (ConjuntoGrupo) getServletContext().getAttribute("grupos");
        cg.agregar(grupito);
        
        //Horario
        ConjuntoHorario ch  = (ConjuntoHorario) getServletContext().getAttribute("horarios");
        int seq = ch.getLast()+1;
        horario.setSeq(seq);
        ch.agregar(horario);
        
        response.sendRedirect("Administrador.jsp");
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
            Logger.getLogger(ServicioRegistroGrupo.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServicioRegistroGrupo.class.getName()).log(Level.SEVERE, null, ex);
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
