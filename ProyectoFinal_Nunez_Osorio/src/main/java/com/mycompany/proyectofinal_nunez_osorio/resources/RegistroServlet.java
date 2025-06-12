/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.proyectofinal_nunez_osorio.resources;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author monts
 */
@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String fecha = request.getParameter("fecha");
        
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h2>Usuario Registrado</h2>");
            out.println("<p><strong>Nombre: </strong>"+ nombre + "</p>");
            out.println("<p><strong>Correo: </strong>"+ correo + "</p>");
            out.println("<p><strong>Fecha de registro: </strong>"+ fecha + "</p>");
            out.println("<a href='index.html'><button>Volver</button></a>");
            out.println("</body></html>");
        }
    }
}