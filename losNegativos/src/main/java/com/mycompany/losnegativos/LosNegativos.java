

package com.mycompany.losnegativos;



import  spark.Spark.*;
import java.util.ArrayList;
import java.util.Date;
import static spark.Spark.get;
import static spark.Spark.post;

public class LosNegativos {

    public static void main(String[] args) {
        // Crear objetos y relaciones aquí
        Autor autor = new Autor("daniel", "venezolano", new Date(), new ArrayList<>());
        Libro libro = new Libro("tengo hambre", "panamericana", "terror", "1802", new ArrayList<>(), new ArrayList<>());
        Copia copia = new Copia("V564", "disponible", libro);
        lector lector = new lector(1, "nicolle", "montaño", "Mi casa", new ArrayList<>());
        prestamo prestamo = new prestamo(new Date(), new Date());

        // Añadir relaciones
        autor.libros.add(libro);
        libro.escrito.add(autor);
        libro.copias.add(copia);
        lector.prestamos.add(prestamo);

        get("/libros", (var req, var res) -> {
        return libro.toString();
        });

        post("/libros", (req, res) -> {
         
            Libro nuevoLibro = new Libro("Nuevo libro", "Editorial", "Tipo", "Año", new ArrayList<>(), new ArrayList<>());
            autor.libros.add(nuevoLibro);
            return "Libro creado: " + nuevoLibro.nombre;
        });

        get("/prestar", (req, res) -> {
          
            copia.prestar();
            return "Libro prestado: " + copia.identificador;
        });

        get("/devolver", (req, res) -> {
          
            copia.devolver();
            return "Libro devuelto: " + copia.identificador;
        });

        get("/multa", (req, res) -> {
           
            prestamo.generarMulta();
            return "Multa generada: " + (prestamo.multa != null ? prestamo.multa.calcularMulta() : "No hay multa");
        });
    }
}

    
