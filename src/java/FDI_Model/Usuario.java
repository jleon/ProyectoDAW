package FDI_Model;
// Generated 23/08/2011 12:47:11 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Long idUsuario;
     private String contrasenia;
     private String tipoIdentificacionUsuario;
     private String numIdentificacionUsuario;
     private String razonSocial;
     private String tipoIdentificacionContribuyente;
     private String numIdentificacionContribuyente;
     private String periodoDeclaracionIva;
     private String email;
     private String provincia;
     private String ciudad;
     private boolean alertaIva;
     private boolean alertaIr;
     private Set ingresoFacturados = new HashSet(0);
     private Set ingresoRelacionDependencias = new HashSet(0);
     private Set clientes = new HashSet(0);
     private Set facturas = new HashSet(0);
     private Set formulario104as = new HashSet(0);
     private Set formulario102as = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String contrasenia, String tipoIdentificacionUsuario, String numIdentificacionUsuario, String razonSocial, String tipoIdentificacionContribuyente, String numIdentificacionContribuyente, String periodoDeclaracionIva, String provincia, String ciudad, boolean alertaIva, boolean alertaIr) {
        this.contrasenia = contrasenia;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numIdentificacionUsuario = numIdentificacionUsuario;
        this.razonSocial = razonSocial;
        this.tipoIdentificacionContribuyente = tipoIdentificacionContribuyente;
        this.numIdentificacionContribuyente = numIdentificacionContribuyente;
        this.periodoDeclaracionIva = periodoDeclaracionIva;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.alertaIva = alertaIva;
        this.alertaIr = alertaIr;
    }
    public Usuario(String contrasenia, String tipoIdentificacionUsuario, String numIdentificacionUsuario, String razonSocial, String tipoIdentificacionContribuyente, String numIdentificacionContribuyente, String periodoDeclaracionIva, String email, String provincia, String ciudad, boolean alertaIva, boolean alertaIr, Set ingresoFacturados, Set ingresoRelacionDependencias, Set clientes, Set facturas, Set formulario104as, Set formulario102as) {
       this.contrasenia = contrasenia;
       this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
       this.numIdentificacionUsuario = numIdentificacionUsuario;
       this.razonSocial = razonSocial;
       this.tipoIdentificacionContribuyente = tipoIdentificacionContribuyente;
       this.numIdentificacionContribuyente = numIdentificacionContribuyente;
       this.periodoDeclaracionIva = periodoDeclaracionIva;
       this.email = email;
       this.provincia = provincia;
       this.ciudad = ciudad;
       this.alertaIva = alertaIva;
       this.alertaIr = alertaIr;
       this.ingresoFacturados = ingresoFacturados;
       this.ingresoRelacionDependencias = ingresoRelacionDependencias;
       this.clientes = clientes;
       this.facturas = facturas;
       this.formulario104as = formulario104as;
       this.formulario102as = formulario102as;
    }
   
    public Long getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getTipoIdentificacionUsuario() {
        return this.tipoIdentificacionUsuario;
    }
    
    public void setTipoIdentificacionUsuario(String tipoIdentificacionUsuario) {
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
    }
    public String getNumIdentificacionUsuario() {
        return this.numIdentificacionUsuario;
    }
    
    public void setNumIdentificacionUsuario(String numIdentificacionUsuario) {
        this.numIdentificacionUsuario = numIdentificacionUsuario;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getTipoIdentificacionContribuyente() {
        return this.tipoIdentificacionContribuyente;
    }
    
    public void setTipoIdentificacionContribuyente(String tipoIdentificacionContribuyente) {
        this.tipoIdentificacionContribuyente = tipoIdentificacionContribuyente;
    }
    public String getNumIdentificacionContribuyente() {
        return this.numIdentificacionContribuyente;
    }
    
    public void setNumIdentificacionContribuyente(String numIdentificacionContribuyente) {
        this.numIdentificacionContribuyente = numIdentificacionContribuyente;
    }
    public String getPeriodoDeclaracionIva() {
        return this.periodoDeclaracionIva;
    }
    
    public void setPeriodoDeclaracionIva(String periodoDeclaracionIva) {
        this.periodoDeclaracionIva = periodoDeclaracionIva;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public boolean isAlertaIva() {
        return this.alertaIva;
    }
    
    public void setAlertaIva(boolean alertaIva) {
        this.alertaIva = alertaIva;
    }
    public boolean isAlertaIr() {
        return this.alertaIr;
    }
    
    public void setAlertaIr(boolean alertaIr) {
        this.alertaIr = alertaIr;
    }
    public Set getIngresoFacturados() {
        return this.ingresoFacturados;
    }
    
    public void setIngresoFacturados(Set ingresoFacturados) {
        this.ingresoFacturados = ingresoFacturados;
    }
    public Set getIngresoRelacionDependencias() {
        return this.ingresoRelacionDependencias;
    }
    
    public void setIngresoRelacionDependencias(Set ingresoRelacionDependencias) {
        this.ingresoRelacionDependencias = ingresoRelacionDependencias;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getFormulario104as() {
        return this.formulario104as;
    }
    
    public void setFormulario104as(Set formulario104as) {
        this.formulario104as = formulario104as;
    }
    public Set getFormulario102as() {
        return this.formulario102as;
    }
    
    public void setFormulario102as(Set formulario102as) {
        this.formulario102as = formulario102as;
    }




}


