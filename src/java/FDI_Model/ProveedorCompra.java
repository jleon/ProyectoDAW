package FDI_Model;
// Generated 23/08/2011 12:47:11 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * ProveedorCompra generated by hbm2java
 */
public class ProveedorCompra  implements java.io.Serializable {


     private Long idProveedorCompra;
     private String rucCi;
     private String razonSocial;
     private String direccion;
     private String ubiGoogleMaps;
     private String telefono;
     private Set facturas = new HashSet(0);

    public ProveedorCompra() {
    }

	
    public ProveedorCompra(String rucCi, String razonSocial, String direccion) {
        this.rucCi = rucCi;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }
    public ProveedorCompra(String rucCi, String razonSocial, String direccion, String ubiGoogleMaps, String telefono, Set facturas) {
       this.rucCi = rucCi;
       this.razonSocial = razonSocial;
       this.direccion = direccion;
       this.ubiGoogleMaps = ubiGoogleMaps;
       this.telefono = telefono;
       this.facturas = facturas;
    }
   
    public Long getIdProveedorCompra() {
        return this.idProveedorCompra;
    }
    
    public void setIdProveedorCompra(Long idProveedorCompra) {
        this.idProveedorCompra = idProveedorCompra;
    }
    public String getRucCi() {
        return this.rucCi;
    }
    
    public void setRucCi(String rucCi) {
        this.rucCi = rucCi;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getUbiGoogleMaps() {
        return this.ubiGoogleMaps;
    }
    
    public void setUbiGoogleMaps(String ubiGoogleMaps) {
        this.ubiGoogleMaps = ubiGoogleMaps;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


