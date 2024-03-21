package com.hackaboss.integrador.servlets;

import com.hackaboss.integrador.logica.Controladora;
import com.hackaboss.integrador.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPartidos", urlPatterns = {"/SvPartidos"})
public class SvPartidos extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> listaPartidos = control.traerPartidos();
        request.setAttribute("partidos", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fecha = request.getParameter("fechaPartido");
        Long idEquipo1 = Long.parseLong(request.getParameter("idEquipo1"));
        Long idEquipo2 = Long.parseLong(request.getParameter("idEquipo2"));
        String resultadoEquipo1 = request.getParameter("resultadoEquipo1");
        String resultadoEquipo2 = request.getParameter("resultadoEquipo2");
        
        Partido partido = new Partido();
        partido.setFecha(fecha);
        partido.setResultadoEquipo1(Integer.parseInt(resultadoEquipo1));
        partido.setResultadoEquipo2(Integer.parseInt(resultadoEquipo2));
        
        control.crearPartido(partido,idEquipo1,idEquipo2);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
