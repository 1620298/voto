/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.UserDAO;
import voto.UserDTO;

/**
 *
 * @author Gianpiero
 */
@WebServlet(urlPatterns = {"/UserSignup"})
public class UserSignup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            UserDTO user=new UserDTO();
            
            
            
            
            
            user.setFirstname(request.getParameter("fn"));
            user.setLastname(request.getParameter("ln"));
            user.setUbigeo(request.getParameter("ubigeo"));
            user.setDireccion(request.getParameter("direccion"));
            user.setSexo(request.getParameter("sexo"));
            user.setEstado_civil(request.getParameter("estado_civil"));
            user.setDni(request.getParameter("dni"));
            user.setFecha_caducidad(request.getParameter("fecha_caducidad"));
            
            
            
            UserDAO user1=new UserDAO();
            
            
            
            if(user1.Signup(user)){
                
               
               
                response.sendRedirect("index.jsp");
                
            }else{
                response.sendRedirect("signup.jsp");
            }
            
        }
        catch (Throwable theException){
            System.out.println(theException);
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
