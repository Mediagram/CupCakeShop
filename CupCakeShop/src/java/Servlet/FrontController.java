package Servlet;

import Backend.CupcakeMapper;
import Backend.UserMapper;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Backend.User;

@WebServlet(urlPatterns =
{
    "/FrontController"
})
public class FrontController extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        RequestDispatcher rd = null;
        String action = request.getParameter("action");
        
        if ("login".equals(action))
        {
            CupcakeMapper ccm = new CupcakeMapper();
            request.setAttribute("toppingMap", ccm.getCupcakeElements("Topping"));
            request.setAttribute("bottomMap", ccm.getCupcakeElements("Bottom"));

            User user = new UserMapper().loginUser(request.getParameter("username"), request.getParameter("password"));
            if (user != null)
            {
                request.getSession().setAttribute("user", user);
                rd = request.getRequestDispatcher("/shop.jsp");
            }
            else
            {
                request.setAttribute("message", "Failed login error.");
                rd = request.getRequestDispatcher("/index.jsp");
            }
        }
        
        
        
        else if ("addToBasket".equals(action))
        {
            String[] cupcakes = request.getParameterValues("cupcake-fields");
            String totalAmount = request.getParameter("sum-up-field");
            
            User currentUser = (User)request.getSession().getAttribute("user");
            
            for (String str : cupcakes)
            {
                String[] split = str.split(" ");
                split[0] = split[0].replace("x", "");
                split[2] = split[2].replace("kr", "");
                
                currentUser.addCupcake(split[1], Integer.parseInt(split[0]), Integer.parseInt(split[2]));
            }
            request.setAttribute("shoppingContent", cupcakes);
            request.setAttribute("totalAmount", totalAmount);
            rd = request.getRequestDispatcher("/shopping_cart.jsp");
        }
        
        
        
        else if ("order".equals(action))
        {
            request.setAttribute("invoice", rd);
            rd = request.getRequestDispatcher("/invoice.jsp");
        }
        
        
        
        else if ("logout".equals(action))
        {
            request.getSession().setAttribute("user", null);
            request.setAttribute("message", "Logged out.");
            rd = request.getRequestDispatcher("/index.jsp");
        }
        
        
        
        else
        {
            rd = request.getRequestDispatcher("/index.jsp");
        }
        rd.forward(request, response);
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
