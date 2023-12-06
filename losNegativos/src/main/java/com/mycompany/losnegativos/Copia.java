/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

/**
 *
 * @author IngSis
 */
public class Copia {
  public String identificador;
  public String estado;
  public Libro original;
  public lector lector;
    public Copia(String identificador, String estado, Libro original) {
        this.identificador = identificador;
        this.estado = estado;
        this.original = original;
    }
   
   
    public void prestar(){
    this.estado= "prestado";
        System.out.println("El libro se ha prestado");
    }
    public void devolver(){
    this.estado= "disponible";
        System.out.println("El libro esta disponible");
    }
    
}
