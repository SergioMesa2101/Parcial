/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.upb.parcial;

import co.edu.upb.parcial.Libreria;
import java.util.Scanner;


/**
 *
 * @author informatica
 */
public class Principal {

    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Agregar algunos libros a la librería
        libreria.agregarLibro(new Libro("Libro 1", "Autor 1", "Categoría 1"));
        libreria.agregarLibro(new Libro("Libro 2", "Autor 2", "Categoría 2"));
        libreria.agregarLibro(new Libro("Libro 3", "Autor 3", "Categoría 1"));

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el título del libro a buscar: ");
                        scanner.nextLine();
                        String tituloBusqueda = scanner.nextLine();
                        libreria.buscarLibro(tituloBusqueda);
                        break;
                    case 2:
                        System.out.print("Ingrese el título del libro a reservar: ");
                        scanner.nextLine();
                        String tituloReserva = scanner.nextLine();
                        libreria.reservarLibro(tituloReserva);
                        break;
                    case 3:
                        System.out.print("Ingrese el título del libro a comprar: ");
                        scanner.nextLine();
                        String tituloCompra = scanner.nextLine();
                        libreria.comprarLibro(tituloCompra);
                        break;
                    case 4:
                        System.out.print("Ingrese el título del libro a devolver: ");
                        scanner.nextLine();
                        String tituloDevolucion = scanner.nextLine();
                        libreria.devolverLibro(tituloDevolucion);
                        break;
                    case 5:
                        System.out.println("Gracias por utilizar el sistema de gestión de la librería.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente nuevamente.");
                        break;
                }
                
                System.out.println();
            } while (opcion != 5);
        }
    }

    public static void mostrarMenu() {
        System.out.println("===== Libros para Todos =====");
        System.out.println("1. Buscar libro");
        System.out.println("2. Reservar libro");
        System.out.println("3. Comprar libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
