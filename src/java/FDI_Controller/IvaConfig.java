/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.FDIDB;
import FDI_Model.PlazosIva;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Fecha;

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
               
        // Lista para los casos new, cancel.
        for(int i=0; i<=9; i++){
            PlazosIva pi= new PlazosIva();
            pi.setIdPlazosIva((long) 0);
            pi.setFechaPublicacion(null);
            pi.setNovenoDigitoRuc(i);
            pi.setMensual(0);
            pi.setSemestre1(0);
            pi.setSemestre2(0);
            listaPlazosIva.add(i, pi);
        }
        
        if(action.equalsIgnoreCase("show")){
            
        }
        else if(action.equalsIgnoreCase("new")){
            // Lista generada arriba
        }
        else if(action.equalsIgnoreCase("search")){
            Fecha fecha= new Fecha();
            try{
                int day= Integer.parseInt(request.getParameter("day"));
                String sMonth= request.getParameter("month");
                int year= Integer.parseInt(request.getParameter("year"));
                fecha.setDia(day);
                fecha.setMes(sMonth);
                fecha.setAnio(year);
                
                FDIDB db= new FDIDB();
                db.beginTransaction();
                List<PlazosIva> tmp= db.getPlazosIvaWithDate(fecha.getMySqlFormatDate());
                db.commit();
                if(tmp.isEmpty()){
                    request.setAttribute("searchError", "No existen plazos para la fecha indicada");
                }
                else{
                    listaPlazosIva= tmp;
                }            
            }catch(Exception e){}
        }
        else if(action.equalsIgnoreCase("save")){
            Fecha fecha= new Fecha();
            try{
                int day= Integer.parseInt(request.getParameter("day"));
                String sMonth= request.getParameter("month");
                int year= Integer.parseInt(request.getParameter("year"));
                fecha.setDia(day);
                fecha.setMes(sMonth);
                fecha.setAnio(year);
                
                for(int i=0; i<10; i++){
                    int novenoDig= Integer.parseInt(request.getParameter("noveno-dig-"+i));
                    int mensual= Integer.parseInt(request.getParameter("mensual-"+i));
                    int semestre1= Integer.parseInt(request.getParameter("semestre1-"+i));
                    int semestre2= Integer.parseInt(request.getParameter("semestre2-"+i));
                    PlazosIva pi= new PlazosIva();
                    pi.setFechaPublicacion(fecha.toDate());
                    pi.setNovenoDigitoRuc(novenoDig);
                    pi.setMensual(mensual);
                    pi.setSemestre1(semestre1);
                    pi.setSemestre2(semestre2);
                    
                    FDIDB db= new FDIDB();
                    db.beginTransaction();
                    List<PlazosIva> tmp= db.getPlazosIvaWithDateAndNovenoD(fecha.getMySqlFormatDate(), pi.getNovenoDigitoRuc());
                    if(!(tmp.isEmpty())){
                        PlazosIva t= tmp.get(0);
                        t.setMensual(mensual);
                        t.setNovenoDigitoRuc(novenoDig);
                        t.setSemestre1(semestre1);
                        t.setSemestre2(semestre2);
                        db.update(t);
                    }
                    else{
                        db.insert(pi);
                    }
                    db.commit();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else if(action.equalsIgnoreCase("cancel")){
            // Lista generada arriba
        }
        else{
            // Lista generada arriba
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
