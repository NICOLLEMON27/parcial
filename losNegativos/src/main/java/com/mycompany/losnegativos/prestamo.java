/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author IngSis
 */
public class prestamo {
    public Date fechaInicio;
    public Date fechaFin;
    public Multa multa;
    

    public prestamo(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
      public void generarMulta() {
        Date hoy = new Date();
        if (hoy.after(this.fechaFin)) {
            this.multa = new Multa();
            System.out.println("Se ha generado una multa por retraso en la devolución del libro.");
        }    
}
       public Date calcularFechaFin() {
        Calendar c = Calendar.getInstance();
        c.setTime(this.fechaInicio);
        c.add(Calendar.DATE, 14);  // número de días a añadir, o restar en caso de días<0
        this.fechaFin = c.getTime();
        return this.fechaFin;
    }
}