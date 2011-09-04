/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import FDI_Model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro
 */
public class ClienteCtrl extends HttpServlet {

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
                   this.sendIdCliente(response);
               break;
               case 1://update
                   view=this.update(request);
               break;
               case 2://delete
                   //view=this.delete(request);
               break;
               case 3://item
                   this.generarTagCliente(this.getClienteDB(request),response);
               break;
               case 4://buscar por coincidencia de nombre
                   this.generarOptionsHTMLCliente(this.getListadoClientes(request), response);                   
               break;
               case 5://buscar todos los clientes
                   this.generarOptionsHTMLCliente(this.getListadoTodosClientes(request), response);                   
               break;
               case 6://buscar por coincidencia de nombre
                   this.generarAutocompletadoClientes(this.getListadoClientesParamQ(request), response);                                      
               break;
               default:
                   //default case
               break;
           }
           
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
        Cliente newCli=this.getCliente(request); 
        try{                                        
            db.beginTransaction();
            db.insert(newCli);
            db.commit();               
            view=request.getRequestDispatcher("");//hay que cambiar esto
            return view;
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
    }
     
    private RequestDispatcher update(HttpServletRequest request) throws Exception{     
        FDIDB db= new FDIDB(); 
        RequestDispatcher view=null;
        Cliente modiCli=this.getCliente(request); 
        long id_cliente = Long.parseLong(request.getParameter("id_cliente"));
        modiCli.setIdCliente(new Long(id_cliente));
        try{                                        
            db.beginTransaction();
            db.update(modiCli);
            db.commit();               
            view=request.getRequestDispatcher("");//hay que cambiar esto
            return view;
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
    }
     
    private Cliente getCliente(HttpServletRequest request){
        String nombre=request.getParameter("nombre_cliente");
        String ruc_ci=request.getParameter("ruc_ci_cliente");
        String direccion=request.getParameter("dir_cliente");
        String telefono=request.getParameter("tlf_cliente");
        long id_usuario=Long.parseLong(request.getParameter("id_usuario"));
        Usuario user= new Usuario();
        user.setIdUsuario(new Long(id_usuario));
        
        Cliente newCli= new Cliente();
        newCli.setNombre(nombre);
        newCli.setRucCi(ruc_ci);
        newCli.setDireccion(direccion);
        newCli.setTelefono(telefono);
        newCli.setUsuario(user);
        
        return newCli;
    }
    
    private ArrayList<Cliente> getListadoClientesDB(Usuario user, String str) throws Exception{
        ArrayList<Cliente> result= new ArrayList<Cliente>();
        FDIDB db= new FDIDB(); 
        try{                                        
            db.beginTransaction();
            result=(ArrayList<Cliente>) db.getListadoClientes(user, str);
            db.commit();                           
            return result;
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
    }
    
    private ArrayList<Cliente> getListadoClientes(HttpServletRequest request) throws Exception{     
                         
        long id_usuario=Long.parseLong(request.getParameter("id_usuario"));        
        Usuario user= new Usuario();
        user.setIdUsuario(new Long(id_usuario));
        String nombre=request.getParameter("nombre_buscar");        
        if(!nombre.equals(""))
            return this.getListadoClientesDB(user, nombre);
        else
            return new ArrayList<Cliente>();
        
        
    }
    
    private ArrayList<Cliente> getListadoTodosClientes(HttpServletRequest request) throws Exception{ 
        long id_usuario=Long.parseLong(request.getParameter("id_usuario"));        
        Usuario user= new Usuario();
        user.setIdUsuario(new Long(id_usuario));
        String nombre="";        
        return this.getListadoClientesDB(user, nombre);        
    }    
    
    private ArrayList<Cliente> getListadoClientesParamQ(HttpServletRequest request) throws Exception{ 
        long id_usuario=Long.parseLong(request.getParameter("id_usuario"));        
        Usuario user= new Usuario();
        user.setIdUsuario(new Long(id_usuario));
        String nombre=request.getParameter("q");   
        return this.getListadoClientesDB(user, nombre);        
    }    
    
    private void generarOptionsHTMLCliente(ArrayList<Cliente> lst_clientes, HttpServletResponse response) throws Exception{
        try{  
            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");        
            PrintWriter out = response.getWriter();            
            for(Cliente cl: lst_clientes){
                out.write("<option value='"+cl.getIdCliente()+"' >"+cl.getNombre()+"</option>");                
            }   
         }catch(Exception e){            
            throw e;
        }     
    }
    
    private void generarAutocompletadoClientes(ArrayList<Cliente> lst_clientes, HttpServletResponse response) throws Exception{
        try{  
            response.setContentType("text/plain");
            response.setHeader("Cache-Control", "no-cache");        
            PrintWriter out = response.getWriter();            
            for(Cliente cl: lst_clientes){
                out.println(cl.getIdCliente()+"|"+cl.getNombre());                
            }   
         }catch(Exception e){            
            throw e;
        }     
    }
    
        
    private Cliente getClienteDB(HttpServletRequest request)throws Exception{
        long id_cliente = Long.parseLong(request.getParameter("id_cliente"));
        Cliente cl= new Cliente();           
        FDIDB db= new FDIDB(); 
        try{                                        
            db.beginTransaction();
            cl=db.getCliente(new Long(id_cliente));
            db.commit();                           
            return cl;
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
    }
    
    private void generarTagCliente(Cliente cl,HttpServletResponse response)throws Exception{
        try{  
            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");        
            PrintWriter out = response.getWriter();                   
            out.write("<cliente id='"+cl.getIdCliente()+"' nombre='"+cl.getNombre()+"' direccion='"+cl.getDireccion()+"' rucci='"+cl.getRucCi()+"' telefono='"+cl.getTelefono()+"' ></cliente>");
         }catch(Exception e){            
            throw e;
        }     
    }
    
    private void sendIdCliente(HttpServletResponse response) throws Exception{
        FDIDB db= new FDIDB(); 
        try{        
            db.beginTransaction();
            response.setContentType("text/plain");
            response.setHeader("Cache-Control", "no-cache");        
            PrintWriter out = response.getWriter();                   
            out.write(""+db.getLastCliente().getIdCliente());
            db.commit();
        }catch(Exception e){
            db.rollback();
            throw e;
        }        
        
    }
}
