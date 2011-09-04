/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.FDIDB;
import FDI_Model.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class Login extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user= request.getParameter("user");
        String password= request.getParameter("password");
        if(user != null && password != null){
            String adminFile= this.getInitParameter("adminFile");
            RequestDispatcher view= null;
            boolean isAdministrator = AdminFile.isAdministrator(user, password, adminFile);
            if(isAdministrator){
                request.getSession().setAttribute("administrator", user);
                view= this.getServletContext().getRequestDispatcher("/systemConfigMenu.jsp");
            }
            else{
                FDIDB db= new FDIDB();
                db.beginTransaction();
                Usuario usuario= db.getUsuario(user, password);
                db.commit();
                if (usuario==null){
                    view= this.getServletContext().getRequestDispatcher("/index.jsp");
                }
                else{
                    request.getSession().setAttribute("idUsuario", usuario.getIdUsuario());
                    view= this.getServletContext().getRequestDispatcher("/AdministracionIngresos.jsp");
                }
            }
            view.forward(request, response);
        }   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
