package FDI_Model;
// Generated 4/09/2011 06:56:48 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Intereses generated by hbm2java
 */
@Entity
@Table(name="intereses"
    ,catalog="fdi_db"
)
public class Intereses  implements java.io.Serializable {


     private Long idIntereses;
     private int anio;
     private double trimestre1;
     private double trimestre2;
     private double trimestre3;
     private double trimestre4;

    public Intereses() {
    }

    public Intereses(int anio, double trimestre1, double trimestre2, double trimestre3, double trimestre4) {
       this.anio = anio;
       this.trimestre1 = trimestre1;
       this.trimestre2 = trimestre2;
       this.trimestre3 = trimestre3;
       this.trimestre4 = trimestre4;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID_INTERESES", unique=true, nullable=false)
    public Long getIdIntereses() {
        return this.idIntereses;
    }
    
    public void setIdIntereses(Long idIntereses) {
        this.idIntereses = idIntereses;
    }
    
    @Column(name="ANIO", nullable=false)
    public int getAnio() {
        return this.anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Column(name="TRIMESTRE_1", nullable=false, precision=22, scale=0)
    public double getTrimestre1() {
        return this.trimestre1;
    }
    
    public void setTrimestre1(double trimestre1) {
        this.trimestre1 = trimestre1;
    }
    
    @Column(name="TRIMESTRE_2", nullable=false, precision=22, scale=0)
    public double getTrimestre2() {
        return this.trimestre2;
    }
    
    public void setTrimestre2(double trimestre2) {
        this.trimestre2 = trimestre2;
    }
    
    @Column(name="TRIMESTRE_3", nullable=false, precision=22, scale=0)
    public double getTrimestre3() {
        return this.trimestre3;
    }
    
    public void setTrimestre3(double trimestre3) {
        this.trimestre3 = trimestre3;
    }
    
    @Column(name="TRIMESTRE_4", nullable=false, precision=22, scale=0)
    public double getTrimestre4() {
        return this.trimestre4;
    }
    
    public void setTrimestre4(double trimestre4) {
        this.trimestre4 = trimestre4;
    }




}


