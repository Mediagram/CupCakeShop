package Servlet;

import Backend.CupcakeMapper;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    //private ArrayList<String> getToppings = new ArrayList();
    
    CupcakeMapper ccm;
    
    public FrontController() throws Exception {
        this.ccm = new CupcakeMapper();
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // From login page
        if (request.getParameter("login") != null) {
            
            
            request.setAttribute("list", ccm.getToppings());
            
            // Do something...
            RequestDispatcher rd = request.getRequestDispatcher("/shop.jsp");
            rd.forward(request, response);
        
            
            
        // From another form    
        } else if (request.getParameter("xxxx") != null) {
            
            // Do something..
            RequestDispatcher rd = request.getRequestDispatcher("/another_page.jsp");
            rd.forward(request, response);
            
        }
        
        
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
