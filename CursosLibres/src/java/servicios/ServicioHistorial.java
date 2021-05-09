/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.beans.ConjuntoCurso;
import modelo.beans.ConjuntoGrupo;
import modelo.beans.Curso;
import modelo.beans.Grupo;
import modelo.beans.Matricula;

/**
 *
 * @author Esteban
 */
public class ServicioHistorial extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException, DocumentException {
        response.setContentType("text/html;charset=UTF-8");
        Enumeration<String> e = request.getParameterNames();
        String p = e.nextElement();
        modelo.beans.ConjuntoHistorial ch = new modelo.beans.ConjuntoHistorial();
        crearPDF(ch.buscarHistorialID(Integer.parseInt(request.getParameter(p))));
        response.sendRedirect("listadoCurso.jsp");
    }

    public static void crearPDF(List<Matricula> result) throws FileNotFoundException, DocumentException {
        Document documento = new Document();
        FileOutputStream ficheroPDF = new FileOutputStream("C:/Users/Esteban/Desktop/Historial" + ".pdf");

        PdfWriter.getInstance(documento, ficheroPDF);

        documento.open();
        Paragraph titulo = new Paragraph("Historial de cursos \n\n",
                FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLUE)
        );

        documento.add(titulo);

        PdfPTable tabla = new PdfPTable(9);
        tabla.addCell("Estudiante_id");
        tabla.addCell("Num_grupo");
        tabla.addCell("Descripcion_area");
        tabla.addCell("Descricion_curso");
        tabla.addCell("Nombre_profesor");
        tabla.addCell("Apellido_1");
        tabla.addCell("Apellido_2");
        tabla.addCell("Nota");
        tabla.addCell("Estado");

        for (Matricula matricula : result) {
            tabla.addCell(String.valueOf(matricula.getEstudiante_id().getId_estudiante()));
            tabla.addCell(String.valueOf(matricula.getGrupo_num()));
            tabla.addCell(String.valueOf(obtenerCurso(matricula.getCurso_id()).getAreaTematica_id().getTematica_descrip()));
            tabla.addCell(obtenerCurso(matricula.getCurso_id()).getCurso_descrip());
            tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getNombre());
            tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getApellido1());
            tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getApellido2());
            tabla.addCell(String.valueOf(matricula.getNota()));
            tabla.addCell(matricula.getEstado_id().getEst_descripcion());
        }

        /*tabla.addCell(String.valueOf(matricula.getEstudiante_id()));
        tabla.addCell(String.valueOf(matricula.getGrupo_num()));
        tabla.addCell(obtenerCurso(matricula.getCurso_id()).getAreaTematica_id().getTematica_descrip());
        tabla.addCell(obtenerCurso(matricula.getCurso_id()).getCurso_descrip());
        tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getNombre());
        tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getApellido1());
        tabla.addCell(obtenerGrupo(matricula.getGrupo_num()).getProfesor_id().getApellido2());
        tabla.addCell(String.valueOf(matricula.getNota()));
        tabla.addCell(matricula.getEstado_id().getEst_descripcion());*/
        documento.add(tabla);

        documento.close();
    }

    public static Curso obtenerCurso(int id_curso) {
        ConjuntoCurso obj = new ConjuntoCurso();
        return obj.obtenerCurso(id_curso);
    }

    public static Grupo obtenerGrupo(int id_grupo) {
        ConjuntoGrupo obj = new ConjuntoGrupo();
        return obj.getGrupo(id_grupo);
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (DocumentException ex) {
            Logger.getLogger(ServicioHistorial.class.getName()).log(Level.SEVERE, null, ex);
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (DocumentException ex) {
            Logger.getLogger(ServicioHistorial.class.getName()).log(Level.SEVERE, null, ex);
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
