/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;
import FDI_Model.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Pedro
 */
public class Pruebas extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //try {
             FDIDB db= new FDIDB(); 
        
        //try{                                        
            db.beginTransaction();
            IngresoFacturado ingFact =db.getIngresoFacturado(15);
            db.commit();               
            
            byte[] bAvatar = ingFact.getImagenFactura();
            
            try{
                FileOutputStream fos = new FileOutputStream("C:/testBase.jpg"); 
                fos.write(bAvatar);
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        /*}catch(Exception e){
            db.rollback();
            throw e;
        } */      
            
            
        //} finally {            
            
            response.setContentType("image/jpeg"); 
            response.setContentLength(bAvatar.length); 
            response.getOutputStream().write(bAvatar); 
            
            //request.getRequestDispatcher("/pruebas.jsp").forward(request, response);
        //}
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
