/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.multipart.*;

/**
 *
 * @author Pedro
 */
public class IngresoFacturadoCtrl extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int action= Integer.parseInt(request.getParameter("action"));
       PrintWriter out = response.getWriter();
       RequestDispatcher view=null;
        try{   
          switch(action){
               case 0://insert
                   view=this.insert(request);
               break;
               case 1://update
                   //view=this.update(request);
               break;
               case 2://delete
                   //view=this.delete(request);
               break;
               case 3://item
                   //view=this.putItem(request);
               break;
               case 4://colecction
                   //view=this.putCollection(request);
               break;
               default:
                   //default case
               break;
           }
           view.forward(request, response);
       }catch(Exception e){
            out.println("Surgio un error inesperado... Intente cargar de nuevo o comuniquese con el administrador del sitio\nError: "+e.getMessage());
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
    
    private RequestDispatcher insert(HttpServletRequest request) throws Exception{     
        FDIDB db= new FDIDB(); 
        RequestDispatcher view=null;
        IngresoFacturado newIngFact=this.getIngresoFacturado(request); 
        try{                                        
            db.beginTransaction();
            db.insert(newIngFact);
            db.commit();               
            view=request.getRequestDispatcher("/ingresosFacturados.jsp");//hay que cambiar esto
            return view;
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
    }
    
    private RequestDispatcher update(HttpServletRequest request) throws Exception{
        return null;
    }
    
    private RequestDispatcher delete(HttpServletRequest request) throws Exception {
        return null;
    }
    
    private RequestDispatcher putItem(HttpServletRequest request) throws Exception{
        return null;
    }
    
    private RequestDispatcher putCollection(HttpServletRequest request) throws Exception{
        return null;
    }
    
    private IngresoFacturado getIngresoFacturado(HttpServletRequest request){
        String fileTempFactura=null;
        String fileTempRetencion=null;
        Date fecha=null;
        int nro_factura=0;
        long id_cliente=0;
        Cliente cl=null;
        String desc_general=null;
        String tipo=null;
        double subtotal_cero=0.0, subtotal_iva=0.0, total=0.0, total_recibido=0.0;
        byte[] img_factura=null;
        try {
      MultipartParser mp = new MultipartParser(request, 1*1024*1024); // 10MB
      Part part;
      while ((part = mp.readNextPart()) != null) {
            String name = part.getName();
            if (part.isParam()) {
              // it's a parameter part
              ParamPart paramPart = (ParamPart) part;
              String value = paramPart.getStringValue();
              //request.getParameter("fecha");
             
                fecha= new Date();
                fecha.setDate(1);
                fecha.setMonth(5);
                fecha.setYear(2010-1900);
                if(name.equalsIgnoreCase("tipo"))
                    tipo=value;
                else if(name.equalsIgnoreCase("nro_factura"))                
                    nro_factura=Integer.parseInt(value);
                else if(name.equalsIgnoreCase("desc_general"))                
                    desc_general=value;
                else if(name.equalsIgnoreCase("subtotal_cero"))                
                    subtotal_cero=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("subtotal_iva"))                
                    subtotal_iva=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("total"))                
                    total=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("total_recibido"))                
                    total_recibido = Double.parseDouble(value);
                else if(name.equalsIgnoreCase("id_cliente")){                
                    id_cliente = Long.parseLong(value);
                    cl=new Cliente();
                    cl.setIdCliente(new Long(id_cliente));                              
                    }
                //Parametros de la retencion
                
                
                /*
                
                
                iva_porc_retencion
                iva_valor_retenido
                ir_ejerc_fiscal_anio
                ir_ejerc_fiscal_mes
                ir_base_imponible
                ir_porc_retencion
                ir_valor_retenido
                total_retenido
                img_retencion
                        
                if(name.equalsIgnoreCase("iva_ejerc_fiscal_anio"))
                    iva_anio=Integer.parseInt(value);
                else if(name.equalsIgnoreCase("iva_ejerc_fiscal_mes"))                
                    iva_mes=Integer.parseInt(value);
                else if(name.equalsIgnoreCase("iva_base_imponible"))                
                    iva_base=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("iva_porc_retencion"))                
                    iva_porc=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("subtotal_iva"))                
                    subtotal_iva=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("total"))                
                    total=Double.parseDouble(value);
                else if(name.equalsIgnoreCase("total_recibido"))                
                    total_recibido = Double.parseDouble(value);
                else if(name.equalsIgnoreCase("id_cliente")){                
                    id_cliente = Long.parseLong(value);
                    cl=new Cliente();
                    cl.setIdCliente(new Long(id_cliente));                              
                    }*/
               
            }
            else if (part.isFile()) {
              // it's a file part
              
                  FilePart filePart = (FilePart) part;
                  String fileName = filePart.getFileName();
              if(name.equalsIgnoreCase("img_factura") && fileName!=null){
                  fileTempFactura="c:/"+fileName;
                  File dir = new File(fileTempFactura);
                  if (fileName != null) {
                        // the part actually contained a file
                        filePart.writeTo(dir);                
                  }
              }else if(name.equalsIgnoreCase("img_retencion") && fileName!=null){
                  fileTempRetencion="c:/"+fileName;
                  File dir = new File(fileTempRetencion);
                  if (fileName != null) {
                        // the part actually contained a file
                        filePart.writeTo(dir);                
                  }
              }
            }
      }
    }
    catch (IOException lEx) {
      this.getServletContext().log(lEx, "error reading or saving file");
    }
        
        
        
        
        
        
        ComprobanteRetencion comRet= new ComprobanteRetencion();
        comRet.setIdComprobanteRetencion(new Long(1));        
        
        Usuario user= new Usuario();        
        user.setIdUsuario(new Long(1));
        IngresoFacturado newIngFact= new IngresoFacturado();
        newIngFact.setUsuario(user);
        //newIngFact.setComprobanteRetencion(comRet);
        newIngFact.setCliente(cl);
        newIngFact.setTipo(tipo);        
        newIngFact.setFecha(fecha);        
        newIngFact.setNumeroFactura(nro_factura);        
        newIngFact.setDescripcion(desc_general);        
        newIngFact.setSubtotal0(subtotal_cero);        
        newIngFact.setSubtotalIva(subtotal_iva);
        newIngFact.setTotal(total);        
        newIngFact.setTotalRecibido(total_recibido);            
        String paramImgFact=fileTempFactura;
        if(paramImgFact!=null)
            newIngFact.setImagenFactura(byteImagen(paramImgFact));  
        String paramImgRet=fileTempRetencion;
        if(paramImgRet!=null)
            //newIngFact.setImagenFactura(byteImagen(paramImgRet)); //AQUI SE ALMACENA EN EL AREA DE RETENCION 
            ;
        return newIngFact;
    }
    
    private byte[] byteImagen(String param){
        byte[] bFile=null;
        File file = new File(param);
        bFile = new byte[(int) file.length()];
        
        try {
	     FileInputStream fileInputStream = new FileInputStream(file);
	     //convert file into array of bytes
	     fileInputStream.read(bFile);
             fileInputStream.close();
             if(file.delete())//AQUI SE ELIMINA EL ARCHIVO
                 System.out.println("OK");
             else
                 System.out.println("No se elimino..");
	     
        } catch (Exception e) {
	     e.printStackTrace();
        }        
        return bFile;
    }
}
