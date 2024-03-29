package FDI_Model;
// Generated 4/09/2011 06:56:48 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ComprobanteRetencion generated by hbm2java
 */
@Entity
@Table(name="comprobante_retencion"
    ,catalog="fdi_db"
)
public class ComprobanteRetencion  implements java.io.Serializable {


     private Long idComprobanteRetencion;
     private int numeroComprobante;
     private double totalRetenido;
     private byte[] imagenComprobante;
     private Set<ComprobanteRetencionIr> comprobanteRetencionIrs = new HashSet<ComprobanteRetencionIr>(0);
     private Set<IngresoFacturado> ingresoFacturados = new HashSet<IngresoFacturado>(0);
     private Set<ComprobanteRetencionIva> comprobanteRetencionIvas = new HashSet<ComprobanteRetencionIva>(0);

    public ComprobanteRetencion() {
    }

	
    public ComprobanteRetencion(int numeroComprobante, double totalRetenido) {
        this.numeroComprobante = numeroComprobante;
        this.totalRetenido = totalRetenido;
    }
    public ComprobanteRetencion(int numeroComprobante, double totalRetenido, byte[] imagenComprobante, Set<ComprobanteRetencionIr> comprobanteRetencionIrs, Set<IngresoFacturado> ingresoFacturados, Set<ComprobanteRetencionIva> comprobanteRetencionIvas) {
       this.numeroComprobante = numeroComprobante;
       this.totalRetenido = totalRetenido;
       this.imagenComprobante = imagenComprobante;
       this.comprobanteRetencionIrs = comprobanteRetencionIrs;
       this.ingresoFacturados = ingresoFacturados;
       this.comprobanteRetencionIvas = comprobanteRetencionIvas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID_COMPROBANTE_RETENCION", unique=true, nullable=false)
    public Long getIdComprobanteRetencion() {
        return this.idComprobanteRetencion;
    }
    
    public void setIdComprobanteRetencion(Long idComprobanteRetencion) {
        this.idComprobanteRetencion = idComprobanteRetencion;
    }
    
    @Column(name="NUMERO_COMPROBANTE", nullable=false)
    public int getNumeroComprobante() {
        return this.numeroComprobante;
    }
    
    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }
    
    @Column(name="TOTAL_RETENIDO", nullable=false, precision=22, scale=0)
    public double getTotalRetenido() {
        return this.totalRetenido;
    }
    
    public void setTotalRetenido(double totalRetenido) {
        this.totalRetenido = totalRetenido;
    }
    
    @Column(name="IMAGEN_COMPROBANTE")
    public byte[] getImagenComprobante() {
        return this.imagenComprobante;
    }
    
    public void setImagenComprobante(byte[] imagenComprobante) {
        this.imagenComprobante = imagenComprobante;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="comprobanteRetencion")
    public Set<ComprobanteRetencionIr> getComprobanteRetencionIrs() {
        return this.comprobanteRetencionIrs;
    }
    
    public void setComprobanteRetencionIrs(Set<ComprobanteRetencionIr> comprobanteRetencionIrs) {
        this.comprobanteRetencionIrs = comprobanteRetencionIrs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="comprobanteRetencion")
    public Set<IngresoFacturado> getIngresoFacturados() {
        return this.ingresoFacturados;
    }
    
    public void setIngresoFacturados(Set<IngresoFacturado> ingresoFacturados) {
        this.ingresoFacturados = ingresoFacturados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="comprobanteRetencion")
    public Set<ComprobanteRetencionIva> getComprobanteRetencionIvas() {
        return this.comprobanteRetencionIvas;
    }
    
    public void setComprobanteRetencionIvas(Set<ComprobanteRetencionIva> comprobanteRetencionIvas) {
        this.comprobanteRetencionIvas = comprobanteRetencionIvas;
    }




}


