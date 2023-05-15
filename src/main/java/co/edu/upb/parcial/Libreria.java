/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.parcial;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author informatica
 */
class Libreria {
    private List<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado:");
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Categoría: " + libro.getCategoria());
                System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }

    public void reservarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro reservado correctamente.");
                } else {
                    System.out.println("El libro no está disponible para reservar.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }

    public void comprarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro comprado correctamente.");
                } else {
                    System.out.println("El libro no está disponible para comprar.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Libro devuelto correctamente.");
                } else {
                    System.out.println("No se puede devolver un libro que está disponible.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }
}

