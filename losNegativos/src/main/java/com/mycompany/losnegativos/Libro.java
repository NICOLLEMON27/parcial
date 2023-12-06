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
public class Libro {
    
    public String nombre;
    public String editorial;
    public String tipo;
    public String año;
   public List<Autor> escrito;

    public Libro(String nombre, String editorial, String tipo, String año, List<Autor> escrito, List<Copia> copias) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.tipo = tipo;
        this.año = año;
        this.escrito = escrito;
        this.copias = copias;
    }
   public List<Copia> copias; 

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", editorial=" + editorial + ", tipo=" + tipo + ", a\u00f1o=" + año + ", escrito=" + escrito + ", copias=" + copias + '}';
    }

  

    
}
