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
 * TipoGasto generated by hbm2java
 */
@Entity
@Table(name="tipo_gasto"
    ,catalog="fdi_db"
)
public class TipoGasto  implements java.io.Serializable {


     private Long idTipoGasto;
     private String nombre;
     private Set<FacturaTipoGasto> facturaTipoGastos = new HashSet<FacturaTipoGasto>(0);

    public TipoGasto() {
    }

	
    public TipoGasto(String nombre) {
        this.nombre = nombre;
    }
    public TipoGasto(String nombre, Set<FacturaTipoGasto> facturaTipoGastos) {
       this.nombre = nombre;
       this.facturaTipoGastos = facturaTipoGastos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID_TIPO_GASTO", unique=true, nullable=false)
    public Long getIdTipoGasto() {
        return this.idTipoGasto;
    }
    
    public void setIdTipoGasto(Long idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }
    
    @Column(name="NOMBRE", nullable=false, length=15)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoGasto")
    public Set<FacturaTipoGasto> getFacturaTipoGastos() {
        return this.facturaTipoGastos;
    }
    
    public void setFacturaTipoGastos(Set<FacturaTipoGasto> facturaTipoGastos) {
        this.facturaTipoGastos = facturaTipoGastos;
    }




}


