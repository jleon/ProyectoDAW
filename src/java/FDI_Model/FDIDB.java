/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Model;

import java.util.Date;
import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author icesa
 */
public class FDIDB {
    private Session session;
    private Transaction tx;
    
    private void InitializeComponents(){
        session= FDIHibernateUtil.getSessionFactory().getCurrentSession();
        session.setFlushMode(FlushMode.COMMIT);
        tx = null;
    }

    public FDIDB() {
        this.InitializeComponents();
    }
    
    public void beginTransaction(){
        if(tx==null)
            tx = session.beginTransaction();
    }
    
    public void commit(){
        tx.commit();
        this.closeTransaction();
    }
    
    private void closeTransaction(){
        this.InitializeComponents();
    }
    
    public void insert(Object o){
        session.save(o);
    }
    
    public void delete(Object o){
        session.delete(o);
    }
    
    public void update(Object o){
        session.update(o);
    }
    
    public void rollback(){
        tx.rollback();
        this.closeTransaction();
    }
    
    public List<Cliente> getTodosClientes(){
        List<Cliente> result= null;
        Query q=  session.createQuery("from Cliente");
        result= (List<Cliente>) q.list();
        return result;
    }
    
    public List<ComprobanteRetencion> getTodosComprobantesDeRetencion(){
        List<ComprobanteRetencion> result= null;
        Query q=  session.createQuery("from ComprobanteRetencion");
        result= (List<ComprobanteRetencion>) q.list();
        return result;
    }
    
    public List<Usuario> getTodosUsuarios(){
        List<Usuario> result= null;
        Query q=  session.createQuery("from Usuario");
        result= (List<Usuario>) q.list();
        return result;
    }
    
    public Usuario getUsuario(String nickname, String password){
        Usuario result= null;
        Query q=  session.createQuery("from Usuario as u where u.numIdentificacionUsuario= :unumIdentificacionUsuario and u.contrasenia= :ucontrasenia");
        q.setParameter("unumIdentificacionUsuario", nickname);
        q.setParameter("ucontrasenia", password);
        result= (Usuario) q.uniqueResult();
        return result;
    }
    //Desde aqui: PEDRO
    public IngresoFacturado getIngresoFacturado(long Id){
        IngresoFacturado result= null;
        Query q=  session.createQuery("from IngresoFacturado as i where i.idIngresoFacturado=:id");        
        Long idl=new Long(Id);
        q.setParameter("id", idl);
        result= (IngresoFacturado) q.uniqueResult();
        return result;
    }
    
    public List<Cliente> getListadoClientes(Usuario user,String str){
        List<Cliente> result= null;
        Query q=  session.createQuery("from Cliente as c where c.usuario=:idUser and c.nombre like ('%"+str+"%')  ");        
        q.setParameter("idUser",user);        
        result= (List<Cliente>) q.list();
        return result;
    }
    
     public Cliente getCliente(long Id){
        Cliente result= null;
        Query q=  session.createQuery("from Cliente as c where c.idCliente=:id");        
        Long idl=new Long(Id);
        q.setParameter("id", idl);
        result= (Cliente) q.uniqueResult();
        return result;
    }
     
    public Cliente getLastCliente(){
        Cliente result= null;
        Query q=  session.createQuery("from Cliente as c where c.idCliente=( select max(cx.idCliente) from Cliente as cx)");             
        result= (Cliente) q.uniqueResult();
        return result;
    }
    
    public List<PlazosIva> getPlazosIvaWithDate(String date){
        List<PlazosIva> result= null;
        Query q=  session.createQuery("from PlazosIva as pi where pi.fechaPublicacion= :date");
        q.setParameter("date", date);
        result= (List<PlazosIva>) q.list();
        return result;
    }
    
    public List<PlazosIva> getPlazosIvaWithDateAndNovenoD(String date, int novenoDig){
        List<PlazosIva> result= null;
        Query q=  session.createQuery("from PlazosIva as pi where pi.fechaPublicacion= :date and pi.novenoDigitoRuc= :novenoDig");
        q.setParameter("date", date);
        q.setParameter("novenoDig", novenoDig);
        result= (List<PlazosIva>) q.list();
        return result;
    }
    
    public ProveedorCompra getProveedor(String RucCI) {
        ProveedorCompra result = null;
        Query q = session.createQuery("from ProveedorCompra as PC where PC.rucCi=: rucci ");
        q.setParameter("rucci", RucCI);
        result = (ProveedorCompra) q.uniqueResult();
        return result;
    }
}
