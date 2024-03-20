package com.hackaboss.votacion.servlets;

import com.hackaboss.votacion.logica.Controladora;
import com.hackaboss.votacion.logica.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvVoto", urlPatterns = {"/SvVoto"})
public class SvVoto extends HttpServlet {

    Controladora control = new Controladora();
    List<Voto> listaVotos = new ArrayList<>();
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession misesion = request.getSession();
        listaVotos = control.traerVotos();
        misesion.setAttribute("listaVotos",listaVotos);
        
        response.sendRedirect("mostrarResultados.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String votoSeleccionado = request.getParameter("partido");
        control.crearVoto(new Voto(1,votoSeleccionado));
               
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
