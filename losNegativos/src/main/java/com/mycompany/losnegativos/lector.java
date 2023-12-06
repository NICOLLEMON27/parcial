/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

import java.util.List;

/**
 *
 * @author IngSis
 */
public class lector {
    public int numSocio;
    public String nombre;
    public String apellido;
    public String direccion;
 public List<prestamo> prestamos; 
    // assuming a reader can borrow multiple books

    public lector(int numSocio, String nombre, String apellido, String direccion, List<prestamo> prestamos) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.prestamos = prestamos;
    }
   
  
}
