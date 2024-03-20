
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votación</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="form-group col">
            <div class="col-md-6">
                <h1 >Votación</h1>
                <p>Elija su voto</p>
            </div>
        </div>
        <form action="SvVoto" method="POST">
            <div class="form-group col">
            <div class="col-md-6">
                <input type="radio" name="partido" value="partidoA"><span class="checkmark"></span> Partido A
                
            </div>
            <div class="col-md-6">
                <input type="radio" name="partido" value="partidoB"><span class="checkmark"></span> Partido B
               
            </div>
            <div class="col-md-6 mb-3" >
                <input type="radio" name="partido" value="partidoC"><span class="checkmark"></span> Partido C
               
            </div>
            <div class="col-md-6 mb-3">
               <button type="submit" class="btn btn-primary">Votar</button> 
            </div>
        </form>
        <form action="SvVoto" method="GET">
            <div class="col-md-6">
               <button type="submit" class="btn btn-success">Mostrar Resultados</button> 
            </div>
        </div>
        </form>
        
        
    </body>
</html>
