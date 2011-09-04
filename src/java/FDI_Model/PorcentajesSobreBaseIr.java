package FDI_Model;
// Generated 23/08/2011 12:47:11 AM by Hibernate Tools 3.2.1.GA



/**
 * PorcentajesSobreBaseIr generated by hbm2java
 */
public class PorcentajesSobreBaseIr  implements java.io.Serializable {


     private Long idPorcentajesSobreBaseIr;
     private int anio;
     private double fraccionBasica;
     private double excesoHasta;
     private double impuestoFraccionBasica;
     private double procentajeImpuestoFraccionExcedente;

    public PorcentajesSobreBaseIr() {
    }

    public PorcentajesSobreBaseIr(int anio, double fraccionBasica, double excesoHasta, double impuestoFraccionBasica, double procentajeImpuestoFraccionExcedente) {
       this.anio = anio;
       this.fraccionBasica = fraccionBasica;
       this.excesoHasta = excesoHasta;
       this.impuestoFraccionBasica = impuestoFraccionBasica;
       this.procentajeImpuestoFraccionExcedente = procentajeImpuestoFraccionExcedente;
    }
   
    public Long getIdPorcentajesSobreBaseIr() {
        return this.idPorcentajesSobreBaseIr;
    }
    
    public void setIdPorcentajesSobreBaseIr(Long idPorcentajesSobreBaseIr) {
        this.idPorcentajesSobreBaseIr = idPorcentajesSobreBaseIr;
    }
    public int getAnio() {
        return this.anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getFraccionBasica() {
        return this.fraccionBasica;
    }
    
    public void setFraccionBasica(double fraccionBasica) {
        this.fraccionBasica = fraccionBasica;
    }
    public double getExcesoHasta() {
        return this.excesoHasta;
    }
    
    public void setExcesoHasta(double excesoHasta) {
        this.excesoHasta = excesoHasta;
    }
    public double getImpuestoFraccionBasica() {
        return this.impuestoFraccionBasica;
    }
    
    public void setImpuestoFraccionBasica(double impuestoFraccionBasica) {
        this.impuestoFraccionBasica = impuestoFraccionBasica;
    }
    public double getProcentajeImpuestoFraccionExcedente() {
        return this.procentajeImpuestoFraccionExcedente;
    }
    
    public void setProcentajeImpuestoFraccionExcedente(double procentajeImpuestoFraccionExcedente) {
        this.procentajeImpuestoFraccionExcedente = procentajeImpuestoFraccionExcedente;
    }




}


