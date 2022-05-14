<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario prueba</title>
    </head>
    <body>
        <h1>Educacion</h1>
        <form action="SvEducacion" method="POST">
            
            <p><label>Institucion: </label><input type="text" name="institucion"></p>
            <p><label>Titulo: </label><input type="text" name="titulo"></p>
            <p><label>Inicio: </label><input type="text" name="inicio"></p>
            <p><label>Fin: </label><input type="text" name="fin"></p>
            <p><label>Url Logo: </label><input type="text" name="urlLogo"></p>
            <button type="submit" >Enviar </button>
        </form>
        
        <h1>Mostrar Historial Academico</h1>
        <form action="" method="">
            <button type="submit" >Mostrar </button>
        </form>
        
        <h1>Eliminar Dato</h1>
        <p>Ingresar id</p>
        <form action="" method="">
            <p><label>Id: </label><input type="text" name="id_elim"></p>
            <button type="submit" >Eliminar </button>
        </form>
    </body>
</html>
