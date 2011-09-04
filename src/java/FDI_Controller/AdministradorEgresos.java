/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.FDIDB;
import FDI_Model.Factura;
import FDI_Model.ProveedorCompra;
import FDI_Model.TipoBienServicio;
import FDI_Model.Usuario;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jleon
 */
public class AdministradorEgresos extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Date fecha=null;
        boolean derecho_a_credito=false;
        int nro_factura = 0 ;
        double subtotal_cero=0, subtotal_iva=0, valor_deducible=0, total=0;
        
        
     
            // jquery valida que se ingrese solo números y el separador '/' (No valida algunas tildes)
            String fecha_tmp = request.getParameter("fecha");
            String proveedor = request.getParameter("proveedor");
            String tipo = request.getParameter("tipo");
            String nro_factura_tmp = request.getParameter("nro_factura");
            String subtotal_cero_tmp = request.getParameter("subtotal_cero");
            String subtotal_iva_tmp = request.getParameter("subtotal_iva");
            String derecho_a_credito_tmp = request.getParameter("derecho_a_credito");
            String valor_deducible_tmp = request.getParameter("valor_deducible");
            String total_tmp = request.getParameter("total");
            
            if(this.fechaStringCorrecta(fecha_tmp)){
                if(this.IsNumeric(nro_factura_tmp) && this.IsNumeric(subtotal_cero_tmp) && this.IsNumeric(subtotal_iva_tmp)
                       && this.IsNumeric(valor_deducible_tmp) && this.IsNumeric(total_tmp))
                    if(this.IsBoolean(derecho_a_credito_tmp)){
                    fecha = this.ConvertirStringFecha_a_Date(fecha_tmp);
                    nro_factura = Integer.parseInt(nro_factura_tmp);
                    subtotal_cero = Double.parseDouble(subtotal_cero_tmp);
                    subtotal_iva = Double.parseDouble(subtotal_iva_tmp);
                    derecho_a_credito = this.ConvertirString_a_boolean(derecho_a_credito_tmp);
                    valor_deducible = Double.parseDouble(valor_deducible_tmp);
                    total = Double.parseDouble(total_tmp);
                    
                    
                    /*********** ESTO SE DEBE CAMBIAR    ******************/
                    
                    TipoBienServicio tipoBienServicio = new TipoBienServicio(tipo);
                    
                    FDIDB db= new FDIDB();
                    db.beginTransaction();
                    
                    
                    Usuario usuario = db.getUsuario(request.getParameter("user"),request.getParameter("password"));
                    ProveedorCompra proveedorCompra = db.getProveedor(proveedor);
                    
                    db.commit();
                    
                    
                    
                    Factura factura = new Factura(tipoBienServicio, usuario, proveedorCompra, total, subtotal_iva, derecho_a_credito, total);
                    factura.setFecha(fecha);
                    
                    /******************************************************/
                    
                }
            }
            
            
        
    }
    
    /** private boolean fechaStringCorrecta(String fecha)
     *  Verifica que el String que representa la fecha
     *  pueda ser convertido a date sin problema.
     *  No valida ingreso de letras.
     */
    private boolean fechaStringCorrecta(String fecha){
        boolean resp = false;
        if(!fecha.isEmpty())
            if(fecha.split("/").length == 3){
                String tmp[] = fecha.split("/");
                int dia = Integer.parseInt(tmp[0]);
                int mes = Integer.parseInt(tmp[1]);
                if(dia>0 && dia<32 && mes>0 && mes<13)
                    resp = true;
            }
        return resp;
    }

    /** private Date ConvertirStringFecha_a_Date(String stringfecha)
     *  Convierte el String que se pasa por parámetro
     *  en un Date, separando por '/'.
     *  Debe estar previamente validado.
     */
    private Date ConvertirStringFecha_a_Date(String stringfecha){
        Date fecha = new Date(0);
        String tmp[] = stringfecha.split("/");
        fecha.setDate(Integer.parseInt(tmp[0]));
        fecha.setMonth(Integer.parseInt(tmp[1])-1);
        fecha.setYear(Integer.parseInt(tmp[2])-1900);
        return fecha;
    }
    
    
    /** private boolean IsNumeric(String num)
     *  Valida que el String ingresado pueda ser convertido
     *  a tipo int
     */
    private boolean IsNumeric(String num){
        boolean resp = false;
        try{
            Integer.parseInt(num);
            resp = true;
        }catch(NumberFormatException ex){
            resp=false;
        }finally{
            return resp;
        }
    }
    
    /** private boolean IsBoolean(String frase)
     *  Valida que el String ingresado pueda ser convertido
     *  a un tipo boolean
     */
    private boolean IsBoolean(String frase){
        boolean resp=false;
            if(frase.toLowerCase().equals("si") || frase.toLowerCase().equals("no")){
                resp = true;
            }
        return resp;
    }
    
    /** private boolean ConvertirString_a_boolean(String frase)
     *  Convierte el String que se pasa por parámetro
     *  en un booelan. 
     *  Debe estar previamente validado.
     */
    private boolean ConvertirString_a_boolean(String frase){
        boolean resp=false;
        if(frase.toLowerCase().equals("si"))
            resp=true;
        if(frase.toLowerCase().equals("no"))
            resp=false;
        return resp;
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
