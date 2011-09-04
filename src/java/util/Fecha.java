/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase que permite el manejo de fechas usando el calendario gregoriano.
 *
 * @author Gustavo
 */
public class Fecha {

    private Calendar fecha;

    /**
     * Constructor de la clase Fecha
     * No recibe parametros, instancia con la fecha del sistema
     */
    public Fecha() {
        this.fecha = GregorianCalendar.getInstance();
    }

     public Fecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.getDiaDeLaSemana() + ", "
                + this.getDia() + " de " + this.getMesCadena() + " de "
                + this.getAnio();
    }

    public java.util.Date toDate(){
        return this.fecha.getTime();
    }
    
    /**
     * Este metodo permite obtener el tiempo en milisegundos
     * que represente al objeto actual de tipo Fecha tomando como 0 milisegundos
     * al Miercoles, 31 de Diciembre de 1969 (19:00:00 h).
     *
     * @return El tiempo en milisegundos que representa a la fecha.
     */
    public long getTiempoEnMilisegundos() {
        return this.fecha.getTimeInMillis();
    }

    /**
     * Este metodo permite obtener el dia de la semana
     * para el actual objeto de tipo Fecha.
     *
     * @return  Una cadena indicando el dia de la semana (Domingo, Lunes,
     * Martes, Miercoles, Jueves, Viernes o Sabado).
     */
    public String getDiaDeLaSemana() {
        switch (this.fecha.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                return "Domingo";
            case Calendar.MONDAY:
                return "Lunes";
            case Calendar.TUESDAY:
                return "Martes";
            case Calendar.WEDNESDAY:
                return "Miercoles";
            case Calendar.THURSDAY:
                return "Jueves";
            case Calendar.FRIDAY:
                return "Viernes";
            case Calendar.SATURDAY:
                return "Sabado";
            default:
                return "";
        }
    }

    /**
     * Este metodo permite obtener el dia de tipo entero
     * para el actual objeto de tipo Fecha y este puede ir
     * desde el 1 hasta el 31 dependiendo de la fecha.
     *
     * @return Un entero indicando el dia (1 - 31).
     */
    public int getDia() {
        return this.fecha.get(Calendar.DATE);
    }


    /**
     * Este metodo permite obtener el mes de tipo entero
     * para el actual objeto de tipo Fecha y este puede ir
     * desde el 1 hasta el 12 representando desde Enero hasta
     * Diciembre.
     *
     * @return Un entero indicando el mes (1 - 12).
     */
    public int getMesEntero() {
        return (this.fecha.get(Calendar.MONTH) + 1);
    }

    /**
     * Este metodo permite obtener una cadena que indica el mes
     * para el actual objeto de tipo Fecha y este puede ir
     * desde Enero hasta Diciembre.
     *
     * @return Una cadena indicando el mes (Enero hasta Diciembre).
     */
    public String getMesCadena() {
        switch (this.fecha.get(Calendar.MONTH)) {
            case Calendar.JANUARY:
                return "Enero";
            case Calendar.FEBRUARY:
                return "Febrero";
            case Calendar.MARCH:
                return "Marzo";
            case Calendar.APRIL:
                return "Abril";
            case Calendar.MAY:
                return "Mayo";
            case Calendar.JUNE:
                return "Junio";
            case Calendar.JULY:
                return "Julio";
            case Calendar.AUGUST:
                return "Agosto";
            case Calendar.SEPTEMBER:
                return "Septiembre";
            case Calendar.OCTOBER:
                return "Octubre";
            case Calendar.NOVEMBER:
                return "Noviembre";
            case Calendar.DECEMBER:
                return "Diciembre";
            default:
                return "";
        }
    }

    /**
     * Este metodo permite obtener el anio de tipo entero
     * para el actual objeto de tipo Fecha.
     *
     * @return Un entero indicando el anio.
     */
    public int getAnio() {
        return this.fecha.get(Calendar.YEAR);
    }

    /**
     * Este metodo permite asignar el tiempo en milisegundos
     * que represente al objeto actual de tipo Fecha tomando como 0 milisegundos
     * al Miercoles, 31 de Diciembre de 1969 (19:00:00 h).
     *
     * @param ms Entero largo que representa los milisegundos de la fecha.
     */
    public void setTiempoEnMilisegundos(long ms) {
        this.fecha.setTimeInMillis(ms);
    }

    /**
     * Este metodo permite asignar directamente la fecha de un objeto
     * del tipo java.util.Date al objeto actual de tipo Fecha.
     *
     * @param fecha Del tipo java.util.Date que representa una fecha particular
     */
    public void setDate(java.util.Date fecha) {
        this.fecha.setTime(fecha);
    }

    /**
     * Este metodo permite asignar el dia de tipo entero
     * para el actual objeto de tipo Fecha y si el numero
     * sobrepasa al numero de dias del mes lo que hace
     * es seguir aumentando el numero de dias con respectivo
     * aumento de meses y anios.
     *
     * @param dia Entero que representa el numero de dias a asignar.
     */
    public void setDia(int dia) {
        this.fecha.set(Calendar.DATE, dia);
    }

    /**
     * Este metodo permite asignar el mes de tipo entero
     * para el actual objeto de tipo Fecha y si el numero
     * sobrepasa al numero de meses del anio lo que hace
     * es seguir aumentando el numero de meses con respectivo
     * aumento de anios.
     *
     * @param mes Entero que representa el numero de meses a asignar.
     */
    public void setMes(int mes) {
        this.fecha.set(Calendar.MONTH, mes - 1);
    }

    /**
     * Este metodo permite asignar el mes de tipo String
     * para el actual objeto de tipo Fecha, si la cadena recibida
     * como parametro no es un mes valido simplemente no cambia
     * el mes que tiene el actual objeto de tipo Fecha.
     *
     * @param mesCadena Cadena que representa el mes a asignar.
     */
    public void setMes(String mesCadena) {
        this.setMes(Fecha.aMesEntero(mesCadena));
    }

    /**
     * Este metodo permite asignar el anio de tipo entero
     * para el actual objeto de tipo Fecha
     *
     * @param anio Entero que representa el anio a asignar.
     */
    public void setAnio(int anio) {
        this.fecha.set(Calendar.YEAR, anio);
    }

    /**
     * Este metodo permite asignar el dia, mes y anio enteros
     * para el actual objeto de tipo Fecha y si el numero de dias
     * sobrepasa al numero de dias del mes lo que hace
     * es seguir aumentando el numero de dias con respectivo
     * aumento de meses y anios; si el numero de meses
     * sobrepasa al numero de meses del anio lo que hace
     * es seguir aumentando el numero de meses con respectivo
     * aumento de anios.
     *
     * @param dia Entero que representa el numero de dias a asignar.
     * @param mes Entero que representa el numero de meses a asignar.
     * @param anio Entero que representa el anio a asignar.
     */
    public void setFecha(int dia, int mes, int anio) {
        this.fecha.set(anio, mes - 1, dia);
    }

    /**
     * Este metodo permite obtener la representacion entera de un mes
     * (1 - 12) dado una cadena con el nombre del mes.
     *
     * @param mesCadena Cadena que representa un mes del anio.
     * @return Entero del 1 al 12 que represente a los meses desde
     * Enero hasta Diciembre.
     */
    private static int aMesEntero(String mesCadena) {
        if (mesCadena.equalsIgnoreCase("Enero")) {
            return 1;
        }
        if (mesCadena.equalsIgnoreCase("Febrero")) {
            return 2;
        }
        if (mesCadena.equalsIgnoreCase("Marzo")) {
            return 3;
        }
        if (mesCadena.equalsIgnoreCase("Abril")) {
            return 4;
        }
        if (mesCadena.equalsIgnoreCase("Mayo")) {
            return 5;
        }
        if (mesCadena.equalsIgnoreCase("Junio")) {
            return 6;
        }
        if (mesCadena.equalsIgnoreCase("Julio")) {
            return 7;
        }
        if (mesCadena.equalsIgnoreCase("Agosto")) {
            return 8;
        }
        if (mesCadena.equalsIgnoreCase("Septiembre")) {
            return 9;
        }
        if (mesCadena.equalsIgnoreCase("Noviembre")) {
            return 10;
        }
        if (mesCadena.equalsIgnoreCase("Diciembre")) {
            return 12;
        }
        return 0;
    }


    /**
     * Este genera un objeto Fecha dado el string que representa el formato YYYY-MM-DD y lo retorna.
     *
     * @param formatoFecha String con el formato YYYY-MM-DD
     * @return El objeto de tipo Fecha que contine los datos del string fecha formato enviado como
     *          parametro.
     */
    public static Fecha convertirFomatoAFecha(String formatoFecha){
        Fecha f= new Fecha();
        f.setFecha(Integer.parseInt(formatoFecha.substring(8)),Integer.parseInt(formatoFecha.substring(5,7)),Integer.parseInt(formatoFecha.substring(0,4)));
        return f;
    }


    public Calendar getCalendarInstance(){
        return this.fecha;
    }

    public String mostrarFormatoSimple(){
        String dia,mes,anio;
        if(this.getDia()<10)
            dia="0"+this.getDia();
        else
            dia=""+this.getDia();
        if(this.getMesEntero()<10)
            mes="0"+this.getMesEntero();
        else
            mes=""+this.getMesEntero();
        anio=""+this.getAnio();
        return (anio+"/"+mes+"/"+dia);
    }
    
    public String getMySqlFormatDate(){
        String dia,mes,anio;
        if(this.getDia()<10)
            dia="0"+this.getDia();
        else
            dia=""+this.getDia();
        if(this.getMesEntero()<10)
            mes="0"+this.getMesEntero();
        else
            mes=""+this.getMesEntero();
        anio=""+this.getAnio();
        return (anio+"-"+mes+"-"+dia);
    }
}
