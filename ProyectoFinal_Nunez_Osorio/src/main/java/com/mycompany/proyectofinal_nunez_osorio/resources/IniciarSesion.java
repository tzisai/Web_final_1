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
@WebServlet(name = "IniciarSesion", urlPatterns = {"/IniciarSesion"})
public class IniciarSesion extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String correo = request.getParameter("correo");
            String password = request.getParameter("password");
            
        if ("usuario@ejemplo.com".equals(correo) && "contraseña".equals(password)) {
            response.sendRedirect("index.html");
        } else {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head><title>Error de inicio de sesión</title></head>");
                out.println("<body>");
                out.println("<h2>Error: Correo o contraseña incorrectos</h2>");
                out.println("<a href='index.html'>Volver a intentar</a>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}
