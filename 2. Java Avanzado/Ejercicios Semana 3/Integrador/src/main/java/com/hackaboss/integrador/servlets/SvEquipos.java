package com.hackaboss.integrador.servlets;

import com.hackaboss.integrador.logica.Controladora;
import com.hackaboss.integrador.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvEquipos", urlPatterns = {"/SvEquipos"})
public class SvEquipos extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Equipo> listaEquipos = control.traerEquipos();
        request.setAttribute("equipos",listaEquipos);
        request.getRequestDispatcher("index.jsp").forward(request, response); 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreEq = request.getParameter("nombreEquipo");
        String ciudadEq = request.getParameter("ciudadEquipo");
        
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEq);
        equipo.setCiudad(ciudadEq);
        control.crearEquipo(equipo);
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
