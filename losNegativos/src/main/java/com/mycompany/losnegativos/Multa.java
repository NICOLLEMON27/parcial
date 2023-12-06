/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

/**
 *
 * @author IngSis
 */
public class Multa {
      private int diasRetraso;
    private double montoMulta;

    public double calcularMulta() {
        this.montoMulta = this.diasRetraso * 5.0; // asumimos que la multa es de 5.0 por día de retraso
        return this.montoMulta;
    }
}
