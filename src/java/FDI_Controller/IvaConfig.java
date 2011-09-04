/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.PlazosIva;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icesa
 */
public class IvaConfig extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action= request.getParameter("action");
        List<PlazosIva> listaPlazosIva= new ArrayList<PlazosIva>();
        RequestDispatcher view= null;
        if(action.equalsIgnoreCase("show")){
        
        }
        else if(action.equalsIgnoreCase("new")){
            for(int i=0; i<=9; i++){
                PlazosIva pi= new PlazosIva();
                pi.setIdPlazosIva((long) 0);
                pi.setFechaPublicacion(null);
                pi.setNovenoDigitoRuc(i);
                pi.setMensual(0);
                pi.setSemestre1(null);
                pi.setSemestre2(null);
                listaPlazosIva.add(i, pi);
            }
        }
        else if(action.equalsIgnoreCase("save")){
        }
        else if(action.equalsIgnoreCase("cancel")){
        
        }
        else{
        
        }
        request.setAttribute("listaPlazosIva", listaPlazosIva);
        view= request.getRequestDispatcher("ivaConfig.jsp");
        view.forward(request, response);
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
