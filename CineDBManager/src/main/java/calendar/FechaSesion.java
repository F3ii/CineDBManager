/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendar;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author danie
 */
public class FechaSesion implements Serializable{
    private int dia;
    private int mes;
    private int agno;
    private int hora;
    private int minuto;
    private int segundo;

    public FechaSesion(){};
    
    public FechaSesion(int dia, int mes, int agno, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.agno = agno;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public Time getTime(){
        return Time.valueOf(LocalTime.of(hora, minuto, segundo));
    }
    
    public Date getDate(){
        return Date.valueOf(LocalDate.of(agno, mes, dia));
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + agno + " a las " + hora + ":" + minuto + ":" + segundo;
    }
    
}
