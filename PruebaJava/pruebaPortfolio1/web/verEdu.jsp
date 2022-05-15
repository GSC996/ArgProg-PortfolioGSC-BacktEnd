<%@page import="java.util.List"%>
<%@page import="logica.Educacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Educacion</title>
    </head>
    <body>
        <h1>Lista de Titulos</h1>

        <%
            List<Educacion> listaEdu = (List) request.getSession().getAttribute("listaEdu");
            for (Educacion edu : listaEdu) {
        %>
        <p>Institucion: <%=edu.getInstitucion()%></p>
        <%
            }
        %>
    </body>
</html>
