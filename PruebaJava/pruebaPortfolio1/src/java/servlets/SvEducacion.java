package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Educacion;

@WebServlet(name = "SvEducacion", urlPatterns = {"/SvEducacion"})
public class SvEducacion extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
         
         Educacion edu0 = new Educacion();
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
