package FDI_Model;
// Generated 4/09/2011 06:56:48 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * IngresoRelacionDependencia generated by hbm2java
 */
@Entity
@Table(name="ingreso_relacion_dependencia"
    ,catalog="fdi_db"
)
public class IngresoRelacionDependencia  implements java.io.Serializable {


     private Long idIngresoRelacionDependencia;
     private EmpresaContratante empresaContratante;
     private Usuario usuario;
     private Date fecha;
     private String ingConcepto;
     private double ingValor;
     private String ingTipo;
     private String egrConcepto;
     private double egrValor;
     private String egrTipo;
     private double liquidoRecibido;

    public IngresoRelacionDependencia() {
    }

    public IngresoRelacionDependencia(EmpresaContratante empresaContratante, Usuario usuario, Date fecha, String ingConcepto, double ingValor, String ingTipo, String egrConcepto, double egrValor, String egrTipo, double liquidoRecibido) {
       this.empresaContratante = empresaContratante;
       this.usuario = usuario;
       this.fecha = fecha;
       this.ingConcepto = ingConcepto;
       this.ingValor = ingValor;
       this.ingTipo = ingTipo;
       this.egrConcepto = egrConcepto;
       this.egrValor = egrValor;
       this.egrTipo = egrTipo;
       this.liquidoRecibido = liquidoRecibido;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID_INGRESO_RELACION_DEPENDENCIA", unique=true, nullable=false)
    public Long getIdIngresoRelacionDependencia() {
        return this.idIngresoRelacionDependencia;
    }
    
    public void setIdIngresoRelacionDependencia(Long idIngresoRelacionDependencia) {
        this.idIngresoRelacionDependencia = idIngresoRelacionDependencia;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_EMPRESA_CONTRATANTE", nullable=false)
    public EmpresaContratante getEmpresaContratante() {
        return this.empresaContratante;
    }
    
    public void setEmpresaContratante(EmpresaContratante empresaContratante) {
        this.empresaContratante = empresaContratante;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_USUARIO", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Column(name="ING_CONCEPTO", nullable=false, length=60)
    public String getIngConcepto() {
        return this.ingConcepto;
    }
    
    public void setIngConcepto(String ingConcepto) {
        this.ingConcepto = ingConcepto;
    }
    
    @Column(name="ING_VALOR", nullable=false, precision=22, scale=0)
    public double getIngValor() {
        return this.ingValor;
    }
    
    public void setIngValor(double ingValor) {
        this.ingValor = ingValor;
    }
    
    @Column(name="ING_TIPO", nullable=false, length=30)
    public String getIngTipo() {
        return this.ingTipo;
    }
    
    public void setIngTipo(String ingTipo) {
        this.ingTipo = ingTipo;
    }
    
    @Column(name="EGR_CONCEPTO", nullable=false, length=60)
    public String getEgrConcepto() {
        return this.egrConcepto;
    }
    
    public void setEgrConcepto(String egrConcepto) {
        this.egrConcepto = egrConcepto;
    }
    
    @Column(name="EGR_VALOR", nullable=false, precision=22, scale=0)
    public double getEgrValor() {
        return this.egrValor;
    }
    
    public void setEgrValor(double egrValor) {
        this.egrValor = egrValor;
    }
    
    @Column(name="EGR_TIPO", nullable=false, length=30)
    public String getEgrTipo() {
        return this.egrTipo;
    }
    
    public void setEgrTipo(String egrTipo) {
        this.egrTipo = egrTipo;
    }
    
    @Column(name="LIQUIDO_RECIBIDO", nullable=false, precision=22, scale=0)
    public double getLiquidoRecibido() {
        return this.liquidoRecibido;
    }
    
    public void setLiquidoRecibido(double liquidoRecibido) {
        this.liquidoRecibido = liquidoRecibido;
    }




}


