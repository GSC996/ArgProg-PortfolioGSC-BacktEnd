package servlets;

import static java.awt.SystemColor.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Educacion;

@WebServlet(name = "SvEducacion", urlPatterns = {"/SvEducacion"})
public class SvEducacion extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Educacion> listaEdu = control.traerEducacion();
        
        HttpSession miSesion = request.getSession();
        miSesion.getAttribute("listaEdu");
        
        response.sendRedirect("verEdu.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String institucion = request.getParameter("institucion");
        String titulo = request.getParameter("titulo");
        String inicio = request.getParameter("inicio");
        String fin = request.getParameter("fin");
        String urlLogo = request.getParameter("urlLogo");

        Educacion edu0 = new Educacion(0, "hola", "titulo", "2019", "2010", "url");
        control.crearEducacion(edu0);
        
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
