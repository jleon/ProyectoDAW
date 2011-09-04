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
 * Formulario104a generated by hbm2java
 */
@Entity
@Table(name="formulario_104a"
    ,catalog="fdi_db"
)
public class Formulario104a  implements java.io.Serializable {


     private Long idFormulario104a;
     private Usuario usuario;
     private Integer c101;
     private Integer c102;
     private Integer c103;
     private Integer c104;
     private String c201;
     private String c202;
     private Double c401;
     private Double c402;
     private Double c403;
     private Double c404;
     private Double c405;
     private Double c406;
     private Double c409;
     private Double c411;
     private Double c412;
     private Double c413;
     private Double c414;
     private Double c415;
     private Double c416;
     private Double c419;
     private Double c421;
     private Double c422;
     private Double c429;
     private Double c431;
     private Double c432;
     private Double c433;
     private Double c434;
     private Double c443;
     private Double c444;
     private Double c480;
     private Double c481;
     private Double c482;
     private Double c483;
     private Double c484;
     private Double c485;
     private Double c499;
     private Double c501;
     private Double c503;
     private Double c507;
     private Double c509;
     private Double c511;
     private Double c512;
     private Double c513;
     private Double c517;
     private Double c518;
     private Double c519;
     private Double c521;
     private Double c522;
     private Double c523;
     private Double c529;
     private Double c531;
     private Double c532;
     private Double c533;
     private Double c534;
     private Double c543;
     private Double c544;
     private Double c553;
     private Double c554;
     private Double c601;
     private Double c602;
     private Double c605;
     private Double c607;
     private Double c609;
     private Double c611;
     private Double c615;
     private Double c617;
     private Double c619;
     private Double c621;
     private Double c699;
     private Double c890;
     private Double c897;
     private Double c898;
     private Double c899;
     private Double c902;
     private Double c903;
     private Double c904;
     private Double c999;
     private Double c905;
     private Double c906;
     private Double c907;
     private Double c908;
     private Double c909;
     private Double c910;
     private Double c911;
     private Double c912;
     private Double c913;
     private Double c914;
     private Double c915;
     private Double c916;
     private Double c917;
     private Double c918;
     private Double c919;
     private String c921;
     private String c922;
     private Date fechaGeneracion;
     private boolean declaracionEfectuada;
     private boolean pagoEfectuado;

    public Formulario104a() {
    }

	
    public Formulario104a(Usuario usuario, Date fechaGeneracion, boolean declaracionEfectuada, boolean pagoEfectuado) {
        this.usuario = usuario;
        this.fechaGeneracion = fechaGeneracion;
        this.declaracionEfectuada = declaracionEfectuada;
        this.pagoEfectuado = pagoEfectuado;
    }
    public Formulario104a(Usuario usuario, Integer c101, Integer c102, Integer c103, Integer c104, String c201, String c202, Double c401, Double c402, Double c403, Double c404, Double c405, Double c406, Double c409, Double c411, Double c412, Double c413, Double c414, Double c415, Double c416, Double c419, Double c421, Double c422, Double c429, Double c431, Double c432, Double c433, Double c434, Double c443, Double c444, Double c480, Double c481, Double c482, Double c483, Double c484, Double c485, Double c499, Double c501, Double c503, Double c507, Double c509, Double c511, Double c512, Double c513, Double c517, Double c518, Double c519, Double c521, Double c522, Double c523, Double c529, Double c531, Double c532, Double c533, Double c534, Double c543, Double c544, Double c553, Double c554, Double c601, Double c602, Double c605, Double c607, Double c609, Double c611, Double c615, Double c617, Double c619, Double c621, Double c699, Double c890, Double c897, Double c898, Double c899, Double c902, Double c903, Double c904, Double c999, Double c905, Double c906, Double c907, Double c908, Double c909, Double c910, Double c911, Double c912, Double c913, Double c914, Double c915, Double c916, Double c917, Double c918, Double c919, String c921, String c922, Date fechaGeneracion, boolean declaracionEfectuada, boolean pagoEfectuado) {
       this.usuario = usuario;
       this.c101 = c101;
       this.c102 = c102;
       this.c103 = c103;
       this.c104 = c104;
       this.c201 = c201;
       this.c202 = c202;
       this.c401 = c401;
       this.c402 = c402;
       this.c403 = c403;
       this.c404 = c404;
       this.c405 = c405;
       this.c406 = c406;
       this.c409 = c409;
       this.c411 = c411;
       this.c412 = c412;
       this.c413 = c413;
       this.c414 = c414;
       this.c415 = c415;
       this.c416 = c416;
       this.c419 = c419;
       this.c421 = c421;
       this.c422 = c422;
       this.c429 = c429;
       this.c431 = c431;
       this.c432 = c432;
       this.c433 = c433;
       this.c434 = c434;
       this.c443 = c443;
       this.c444 = c444;
       this.c480 = c480;
       this.c481 = c481;
       this.c482 = c482;
       this.c483 = c483;
       this.c484 = c484;
       this.c485 = c485;
       this.c499 = c499;
       this.c501 = c501;
       this.c503 = c503;
       this.c507 = c507;
       this.c509 = c509;
       this.c511 = c511;
       this.c512 = c512;
       this.c513 = c513;
       this.c517 = c517;
       this.c518 = c518;
       this.c519 = c519;
       this.c521 = c521;
       this.c522 = c522;
       this.c523 = c523;
       this.c529 = c529;
       this.c531 = c531;
       this.c532 = c532;
       this.c533 = c533;
       this.c534 = c534;
       this.c543 = c543;
       this.c544 = c544;
       this.c553 = c553;
       this.c554 = c554;
       this.c601 = c601;
       this.c602 = c602;
       this.c605 = c605;
       this.c607 = c607;
       this.c609 = c609;
       this.c611 = c611;
       this.c615 = c615;
       this.c617 = c617;
       this.c619 = c619;
       this.c621 = c621;
       this.c699 = c699;
       this.c890 = c890;
       this.c897 = c897;
       this.c898 = c898;
       this.c899 = c899;
       this.c902 = c902;
       this.c903 = c903;
       this.c904 = c904;
       this.c999 = c999;
       this.c905 = c905;
       this.c906 = c906;
       this.c907 = c907;
       this.c908 = c908;
       this.c909 = c909;
       this.c910 = c910;
       this.c911 = c911;
       this.c912 = c912;
       this.c913 = c913;
       this.c914 = c914;
       this.c915 = c915;
       this.c916 = c916;
       this.c917 = c917;
       this.c918 = c918;
       this.c919 = c919;
       this.c921 = c921;
       this.c922 = c922;
       this.fechaGeneracion = fechaGeneracion;
       this.declaracionEfectuada = declaracionEfectuada;
       this.pagoEfectuado = pagoEfectuado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID_FORMULARIO_104A", unique=true, nullable=false)
    public Long getIdFormulario104a() {
        return this.idFormulario104a;
    }
    
    public void setIdFormulario104a(Long idFormulario104a) {
        this.idFormulario104a = idFormulario104a;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_USUARIO", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="C101")
    public Integer getC101() {
        return this.c101;
    }
    
    public void setC101(Integer c101) {
        this.c101 = c101;
    }
    
    @Column(name="C102")
    public Integer getC102() {
        return this.c102;
    }
    
    public void setC102(Integer c102) {
        this.c102 = c102;
    }
    
    @Column(name="C103")
    public Integer getC103() {
        return this.c103;
    }
    
    public void setC103(Integer c103) {
        this.c103 = c103;
    }
    
    @Column(name="C104")
    public Integer getC104() {
        return this.c104;
    }
    
    public void setC104(Integer c104) {
        this.c104 = c104;
    }
    
    @Column(name="C201", length=13)
    public String getC201() {
        return this.c201;
    }
    
    public void setC201(String c201) {
        this.c201 = c201;
    }
    
    @Column(name="C202", length=100)
    public String getC202() {
        return this.c202;
    }
    
    public void setC202(String c202) {
        this.c202 = c202;
    }
    
    @Column(name="C401", precision=22, scale=0)
    public Double getC401() {
        return this.c401;
    }
    
    public void setC401(Double c401) {
        this.c401 = c401;
    }
    
    @Column(name="C402", precision=22, scale=0)
    public Double getC402() {
        return this.c402;
    }
    
    public void setC402(Double c402) {
        this.c402 = c402;
    }
    
    @Column(name="C403", precision=22, scale=0)
    public Double getC403() {
        return this.c403;
    }
    
    public void setC403(Double c403) {
        this.c403 = c403;
    }
    
    @Column(name="C404", precision=22, scale=0)
    public Double getC404() {
        return this.c404;
    }
    
    public void setC404(Double c404) {
        this.c404 = c404;
    }
    
    @Column(name="C405", precision=22, scale=0)
    public Double getC405() {
        return this.c405;
    }
    
    public void setC405(Double c405) {
        this.c405 = c405;
    }
    
    @Column(name="C406", precision=22, scale=0)
    public Double getC406() {
        return this.c406;
    }
    
    public void setC406(Double c406) {
        this.c406 = c406;
    }
    
    @Column(name="C409", precision=22, scale=0)
    public Double getC409() {
        return this.c409;
    }
    
    public void setC409(Double c409) {
        this.c409 = c409;
    }
    
    @Column(name="C411", precision=22, scale=0)
    public Double getC411() {
        return this.c411;
    }
    
    public void setC411(Double c411) {
        this.c411 = c411;
    }
    
    @Column(name="C412", precision=22, scale=0)
    public Double getC412() {
        return this.c412;
    }
    
    public void setC412(Double c412) {
        this.c412 = c412;
    }
    
    @Column(name="C413", precision=22, scale=0)
    public Double getC413() {
        return this.c413;
    }
    
    public void setC413(Double c413) {
        this.c413 = c413;
    }
    
    @Column(name="C414", precision=22, scale=0)
    public Double getC414() {
        return this.c414;
    }
    
    public void setC414(Double c414) {
        this.c414 = c414;
    }
    
    @Column(name="C415", precision=22, scale=0)
    public Double getC415() {
        return this.c415;
    }
    
    public void setC415(Double c415) {
        this.c415 = c415;
    }
    
    @Column(name="C416", precision=22, scale=0)
    public Double getC416() {
        return this.c416;
    }
    
    public void setC416(Double c416) {
        this.c416 = c416;
    }
    
    @Column(name="C419", precision=22, scale=0)
    public Double getC419() {
        return this.c419;
    }
    
    public void setC419(Double c419) {
        this.c419 = c419;
    }
    
    @Column(name="C421", precision=22, scale=0)
    public Double getC421() {
        return this.c421;
    }
    
    public void setC421(Double c421) {
        this.c421 = c421;
    }
    
    @Column(name="C422", precision=22, scale=0)
    public Double getC422() {
        return this.c422;
    }
    
    public void setC422(Double c422) {
        this.c422 = c422;
    }
    
    @Column(name="C429", precision=22, scale=0)
    public Double getC429() {
        return this.c429;
    }
    
    public void setC429(Double c429) {
        this.c429 = c429;
    }
    
    @Column(name="C431", precision=22, scale=0)
    public Double getC431() {
        return this.c431;
    }
    
    public void setC431(Double c431) {
        this.c431 = c431;
    }
    
    @Column(name="C432", precision=22, scale=0)
    public Double getC432() {
        return this.c432;
    }
    
    public void setC432(Double c432) {
        this.c432 = c432;
    }
    
    @Column(name="C433", precision=22, scale=0)
    public Double getC433() {
        return this.c433;
    }
    
    public void setC433(Double c433) {
        this.c433 = c433;
    }
    
    @Column(name="C434", precision=22, scale=0)
    public Double getC434() {
        return this.c434;
    }
    
    public void setC434(Double c434) {
        this.c434 = c434;
    }
    
    @Column(name="C443", precision=22, scale=0)
    public Double getC443() {
        return this.c443;
    }
    
    public void setC443(Double c443) {
        this.c443 = c443;
    }
    
    @Column(name="C444", precision=22, scale=0)
    public Double getC444() {
        return this.c444;
    }
    
    public void setC444(Double c444) {
        this.c444 = c444;
    }
    
    @Column(name="C480", precision=22, scale=0)
    public Double getC480() {
        return this.c480;
    }
    
    public void setC480(Double c480) {
        this.c480 = c480;
    }
    
    @Column(name="C481", precision=22, scale=0)
    public Double getC481() {
        return this.c481;
    }
    
    public void setC481(Double c481) {
        this.c481 = c481;
    }
    
    @Column(name="C482", precision=22, scale=0)
    public Double getC482() {
        return this.c482;
    }
    
    public void setC482(Double c482) {
        this.c482 = c482;
    }
    
    @Column(name="C483", precision=22, scale=0)
    public Double getC483() {
        return this.c483;
    }
    
    public void setC483(Double c483) {
        this.c483 = c483;
    }
    
    @Column(name="C484", precision=22, scale=0)
    public Double getC484() {
        return this.c484;
    }
    
    public void setC484(Double c484) {
        this.c484 = c484;
    }
    
    @Column(name="C485", precision=22, scale=0)
    public Double getC485() {
        return this.c485;
    }
    
    public void setC485(Double c485) {
        this.c485 = c485;
    }
    
    @Column(name="C499", precision=22, scale=0)
    public Double getC499() {
        return this.c499;
    }
    
    public void setC499(Double c499) {
        this.c499 = c499;
    }
    
    @Column(name="C501", precision=22, scale=0)
    public Double getC501() {
        return this.c501;
    }
    
    public void setC501(Double c501) {
        this.c501 = c501;
    }
    
    @Column(name="C503", precision=22, scale=0)
    public Double getC503() {
        return this.c503;
    }
    
    public void setC503(Double c503) {
        this.c503 = c503;
    }
    
    @Column(name="C507", precision=22, scale=0)
    public Double getC507() {
        return this.c507;
    }
    
    public void setC507(Double c507) {
        this.c507 = c507;
    }
    
    @Column(name="C509", precision=22, scale=0)
    public Double getC509() {
        return this.c509;
    }
    
    public void setC509(Double c509) {
        this.c509 = c509;
    }
    
    @Column(name="C511", precision=22, scale=0)
    public Double getC511() {
        return this.c511;
    }
    
    public void setC511(Double c511) {
        this.c511 = c511;
    }
    
    @Column(name="C512", precision=22, scale=0)
    public Double getC512() {
        return this.c512;
    }
    
    public void setC512(Double c512) {
        this.c512 = c512;
    }
    
    @Column(name="C513", precision=22, scale=0)
    public Double getC513() {
        return this.c513;
    }
    
    public void setC513(Double c513) {
        this.c513 = c513;
    }
    
    @Column(name="C517", precision=22, scale=0)
    public Double getC517() {
        return this.c517;
    }
    
    public void setC517(Double c517) {
        this.c517 = c517;
    }
    
    @Column(name="C518", precision=22, scale=0)
    public Double getC518() {
        return this.c518;
    }
    
    public void setC518(Double c518) {
        this.c518 = c518;
    }
    
    @Column(name="C519", precision=22, scale=0)
    public Double getC519() {
        return this.c519;
    }
    
    public void setC519(Double c519) {
        this.c519 = c519;
    }
    
    @Column(name="C521", precision=22, scale=0)
    public Double getC521() {
        return this.c521;
    }
    
    public void setC521(Double c521) {
        this.c521 = c521;
    }
    
    @Column(name="C522", precision=22, scale=0)
    public Double getC522() {
        return this.c522;
    }
    
    public void setC522(Double c522) {
        this.c522 = c522;
    }
    
    @Column(name="C523", precision=22, scale=0)
    public Double getC523() {
        return this.c523;
    }
    
    public void setC523(Double c523) {
        this.c523 = c523;
    }
    
    @Column(name="C529", precision=22, scale=0)
    public Double getC529() {
        return this.c529;
    }
    
    public void setC529(Double c529) {
        this.c529 = c529;
    }
    
    @Column(name="C531", precision=22, scale=0)
    public Double getC531() {
        return this.c531;
    }
    
    public void setC531(Double c531) {
        this.c531 = c531;
    }
    
    @Column(name="C532", precision=22, scale=0)
    public Double getC532() {
        return this.c532;
    }
    
    public void setC532(Double c532) {
        this.c532 = c532;
    }
    
    @Column(name="C533", precision=22, scale=0)
    public Double getC533() {
        return this.c533;
    }
    
    public void setC533(Double c533) {
        this.c533 = c533;
    }
    
    @Column(name="C534", precision=22, scale=0)
    public Double getC534() {
        return this.c534;
    }
    
    public void setC534(Double c534) {
        this.c534 = c534;
    }
    
    @Column(name="C543", precision=22, scale=0)
    public Double getC543() {
        return this.c543;
    }
    
    public void setC543(Double c543) {
        this.c543 = c543;
    }
    
    @Column(name="C544", precision=22, scale=0)
    public Double getC544() {
        return this.c544;
    }
    
    public void setC544(Double c544) {
        this.c544 = c544;
    }
    
    @Column(name="C553", precision=22, scale=0)
    public Double getC553() {
        return this.c553;
    }
    
    public void setC553(Double c553) {
        this.c553 = c553;
    }
    
    @Column(name="C554", precision=22, scale=0)
    public Double getC554() {
        return this.c554;
    }
    
    public void setC554(Double c554) {
        this.c554 = c554;
    }
    
    @Column(name="C601", precision=22, scale=0)
    public Double getC601() {
        return this.c601;
    }
    
    public void setC601(Double c601) {
        this.c601 = c601;
    }
    
    @Column(name="C602", precision=22, scale=0)
    public Double getC602() {
        return this.c602;
    }
    
    public void setC602(Double c602) {
        this.c602 = c602;
    }
    
    @Column(name="C605", precision=22, scale=0)
    public Double getC605() {
        return this.c605;
    }
    
    public void setC605(Double c605) {
        this.c605 = c605;
    }
    
    @Column(name="C607", precision=22, scale=0)
    public Double getC607() {
        return this.c607;
    }
    
    public void setC607(Double c607) {
        this.c607 = c607;
    }
    
    @Column(name="C609", precision=22, scale=0)
    public Double getC609() {
        return this.c609;
    }
    
    public void setC609(Double c609) {
        this.c609 = c609;
    }
    
    @Column(name="C611", precision=22, scale=0)
    public Double getC611() {
        return this.c611;
    }
    
    public void setC611(Double c611) {
        this.c611 = c611;
    }
    
    @Column(name="C615", precision=22, scale=0)
    public Double getC615() {
        return this.c615;
    }
    
    public void setC615(Double c615) {
        this.c615 = c615;
    }
    
    @Column(name="C617", precision=22, scale=0)
    public Double getC617() {
        return this.c617;
    }
    
    public void setC617(Double c617) {
        this.c617 = c617;
    }
    
    @Column(name="C619", precision=22, scale=0)
    public Double getC619() {
        return this.c619;
    }
    
    public void setC619(Double c619) {
        this.c619 = c619;
    }
    
    @Column(name="C621", precision=22, scale=0)
    public Double getC621() {
        return this.c621;
    }
    
    public void setC621(Double c621) {
        this.c621 = c621;
    }
    
    @Column(name="C699", precision=22, scale=0)
    public Double getC699() {
        return this.c699;
    }
    
    public void setC699(Double c699) {
        this.c699 = c699;
    }
    
    @Column(name="C890", precision=22, scale=0)
    public Double getC890() {
        return this.c890;
    }
    
    public void setC890(Double c890) {
        this.c890 = c890;
    }
    
    @Column(name="C897", precision=22, scale=0)
    public Double getC897() {
        return this.c897;
    }
    
    public void setC897(Double c897) {
        this.c897 = c897;
    }
    
    @Column(name="C898", precision=22, scale=0)
    public Double getC898() {
        return this.c898;
    }
    
    public void setC898(Double c898) {
        this.c898 = c898;
    }
    
    @Column(name="C899", precision=22, scale=0)
    public Double getC899() {
        return this.c899;
    }
    
    public void setC899(Double c899) {
        this.c899 = c899;
    }
    
    @Column(name="C902", precision=22, scale=0)
    public Double getC902() {
        return this.c902;
    }
    
    public void setC902(Double c902) {
        this.c902 = c902;
    }
    
    @Column(name="C903", precision=22, scale=0)
    public Double getC903() {
        return this.c903;
    }
    
    public void setC903(Double c903) {
        this.c903 = c903;
    }
    
    @Column(name="C904", precision=22, scale=0)
    public Double getC904() {
        return this.c904;
    }
    
    public void setC904(Double c904) {
        this.c904 = c904;
    }
    
    @Column(name="C999", precision=22, scale=0)
    public Double getC999() {
        return this.c999;
    }
    
    public void setC999(Double c999) {
        this.c999 = c999;
    }
    
    @Column(name="C905", precision=22, scale=0)
    public Double getC905() {
        return this.c905;
    }
    
    public void setC905(Double c905) {
        this.c905 = c905;
    }
    
    @Column(name="C906", precision=22, scale=0)
    public Double getC906() {
        return this.c906;
    }
    
    public void setC906(Double c906) {
        this.c906 = c906;
    }
    
    @Column(name="C907", precision=22, scale=0)
    public Double getC907() {
        return this.c907;
    }
    
    public void setC907(Double c907) {
        this.c907 = c907;
    }
    
    @Column(name="C908", precision=22, scale=0)
    public Double getC908() {
        return this.c908;
    }
    
    public void setC908(Double c908) {
        this.c908 = c908;
    }
    
    @Column(name="C909", precision=22, scale=0)
    public Double getC909() {
        return this.c909;
    }
    
    public void setC909(Double c909) {
        this.c909 = c909;
    }
    
    @Column(name="C910", precision=22, scale=0)
    public Double getC910() {
        return this.c910;
    }
    
    public void setC910(Double c910) {
        this.c910 = c910;
    }
    
    @Column(name="C911", precision=22, scale=0)
    public Double getC911() {
        return this.c911;
    }
    
    public void setC911(Double c911) {
        this.c911 = c911;
    }
    
    @Column(name="C912", precision=22, scale=0)
    public Double getC912() {
        return this.c912;
    }
    
    public void setC912(Double c912) {
        this.c912 = c912;
    }
    
    @Column(name="C913", precision=22, scale=0)
    public Double getC913() {
        return this.c913;
    }
    
    public void setC913(Double c913) {
        this.c913 = c913;
    }
    
    @Column(name="C914", precision=22, scale=0)
    public Double getC914() {
        return this.c914;
    }
    
    public void setC914(Double c914) {
        this.c914 = c914;
    }
    
    @Column(name="C915", precision=22, scale=0)
    public Double getC915() {
        return this.c915;
    }
    
    public void setC915(Double c915) {
        this.c915 = c915;
    }
    
    @Column(name="C916", precision=22, scale=0)
    public Double getC916() {
        return this.c916;
    }
    
    public void setC916(Double c916) {
        this.c916 = c916;
    }
    
    @Column(name="C917", precision=22, scale=0)
    public Double getC917() {
        return this.c917;
    }
    
    public void setC917(Double c917) {
        this.c917 = c917;
    }
    
    @Column(name="C918", precision=22, scale=0)
    public Double getC918() {
        return this.c918;
    }
    
    public void setC918(Double c918) {
        this.c918 = c918;
    }
    
    @Column(name="C919", precision=22, scale=0)
    public Double getC919() {
        return this.c919;
    }
    
    public void setC919(Double c919) {
        this.c919 = c919;
    }
    
    @Column(name="C921", length=20)
    public String getC921() {
        return this.c921;
    }
    
    public void setC921(String c921) {
        this.c921 = c921;
    }
    
    @Column(name="C922", length=40)
    public String getC922() {
        return this.c922;
    }
    
    public void setC922(String c922) {
        this.c922 = c922;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_GENERACION", nullable=false, length=10)
    public Date getFechaGeneracion() {
        return this.fechaGeneracion;
    }
    
    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
    
    @Column(name="DECLARACION_EFECTUADA", nullable=false)
    public boolean isDeclaracionEfectuada() {
        return this.declaracionEfectuada;
    }
    
    public void setDeclaracionEfectuada(boolean declaracionEfectuada) {
        this.declaracionEfectuada = declaracionEfectuada;
    }
    
    @Column(name="PAGO_EFECTUADO", nullable=false)
    public boolean isPagoEfectuado() {
        return this.pagoEfectuado;
    }
    
    public void setPagoEfectuado(boolean pagoEfectuado) {
        this.pagoEfectuado = pagoEfectuado;
    }




}


