<%-- 
    Document   : index
    Created on : 20 mar 2024, 20:05:33
    Author     : Patito
--%>

<%@page import="com.hackaboss.integrador.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.hackaboss.integrador.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneo Baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        
        <form action="SvEquipos" method="POST">
            <h2>FORMULARIO EQUIPO</h2>
            <div class="form-group col">
                <div>
                    <p>Nombre: </p>
                    <p><input name="nombreEquipo"></p>
                </div>
                <div >
                    <p>Ciudad: </p>
                    <input name="ciudadEquipo">
                </div>
            </div>
            <div class="col-md-6 mb-3">
               <button type="submit" class="btn btn-primary">Guardar</button> 
            </div>
        </form>
        <hr>
        <form action="SvEquipos" method="GET">
            <div class="col-md-6">
               <button type="submit" class="btn btn-primary">Ver Equipos</button> 
            </div>
            <%List<Equipo> listaEquipos = (List)request.getAttribute("equipos"); 
                if(listaEquipos != null){%>
                <div>
                    
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Id Equipo</th>
                                <th>Nombre Equipo</th>
                                <th>Ciudad Equipo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for(Equipo equi : listaEquipos) {%>
                            <tr>
                                <td><%=equi.getId() %></td>
                                <td><%=equi.getNombre() %></td>
                                <td><%=equi.getCiudad() %></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                    
                </div>
            <%}%>
        </form>
        <div>
           
        </div>
        <hr>
        <form action="SvPartidos" method="POST">
            <h2>FORMULARIO PARTIDOS</h2>
            <div class="form-group col">
                <div>
                    <p>Fecha: </p>
                    <p><input name="fechaPartido"></p>
                </div>
                <div >
                    <p>Id Equipo 1: </p>
                    <input name="idEquipo1">
                </div>
                <div >
                    <p>Id Equipo 2: </p>
                    <input name="idEquipo2">
                </div>
                <div >
                    <p>Resultado Equipo 1: </p>
                    <input name="resultadoEquipo1">
                </div>
                <div >
                    <p>Resultado Equipo 2: </p>
                    <input name="resultadoEquipo2">
                </div>
            </div>
            <div class="col-md-6 mb-3">
               <button type="submit" class="btn btn-primary">Guardar Partido</button> 
            </div>
        </form>
        <hr>
        <form action="SvPartidos" method="GET">
            <div class="col-md-6 mb-3">
               <button type="submit" class="btn btn-primary">Ver Partidos</button> 
            </div>
            <%List<Partido> listaPartidos = (List)request.getAttribute("partidos"); 
                if(listaPartidos != null){%>
                <div>
                    
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Fecha</th>
                                <th>Equipo 1</th>
                                <th>Equipo 2</th>
                                <th>Resultado Equipo 1</th>
                                <th>Resultado Equipo 2</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for(Partido part : listaPartidos) {%>
                            <tr>
                                <td><%=part.getFecha() %></td>
                                <td><%=part.getEquipo1().getNombre() %></td>
                                <td><%=part.getEquipo2().getNombre() %></td>
                                <td><%=part.getResultadoEquipo1() %></td>
                                <td><%=part.getResultadoEquipo2() %></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                    
                </div>
            <%}%>
        </form>
        
    </body>
</html>
