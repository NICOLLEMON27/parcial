/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

import java.util.Date;
import java.util.List;

public class Autor {
    
    public String nombre;
    public String nacionslidad;
   public Date fechaNacimiento;
     public List<Libro> libros; 

    public Autor(String nombre, String nacionslidad, Date fechaNacimiento, List<Libro> libros) {
        this.nombre = nombre;
        this.nacionslidad = nacionslidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionslidad=" + nacionslidad + ", fechaNacimiento=" + fechaNacimiento + ", libros=" + libros + '}';
    }
    
    
          
}
