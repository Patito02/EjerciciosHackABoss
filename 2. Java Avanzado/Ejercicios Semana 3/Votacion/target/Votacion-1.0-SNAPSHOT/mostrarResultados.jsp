
<%@page import="com.hackaboss.votacion.logica.Voto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.22.3/dist/bootstrap-table.min.css">
 
    </head>
    <body>
        <h1>Resultados de la Votación</h1>
        <% List<Voto> listaVotos = (List) request.getSession().getAttribute("listaVotos");
            int contadorA = 0, contadorB = 0, contadorC = 0;
            for (Voto vot : listaVotos) {
                if ("partidoA".equalsIgnoreCase(vot.getVoto())) {
                    contadorA = contadorA + 1;
                } else if ("partidoB".equalsIgnoreCase(vot.getVoto())) {
                    contadorB = contadorB + 1;
                } else if ("partidoC".equalsIgnoreCase(vot.getVoto())) {
                    contadorC = contadorC + 1;
                }

            }%>
            <div class="row">
            <div class="col-md-6">
            <table class="table table-bordered" width="50%" cellspacing="0">
                <thead>
                    <tr>
                        <th>Nombre Partido</th>
                        <th>Cantidad de Votos</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Partido A</td>
                        <td><%=contadorA%></td>
                    </tr>
                    <tr>
                        <td>Partido B</td>
                        <td><%=contadorB%></td>
                    </tr>
                    <tr>
                        <td>Partido C</td>
                        <td><%=contadorC%></td>
                    </tr>
                </tbody>
            </table> 
        </div>
            </div>
    
    
    </body>
</html>
