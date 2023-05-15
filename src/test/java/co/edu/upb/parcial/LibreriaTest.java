/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.upb.parcial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class LibreriaTest {
    
    public LibreriaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregarLibro method, of class Libreria.
     */
    @Test
    public void testAgregarLibro() {
        System.out.println("agregarLibro");
        Libro libro = null;
        Libreria instance = new Libreria();
        instance.agregarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Libreria.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        String titulo = "";
        Libreria instance = new Libreria();
        instance.buscarLibro(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reservarLibro method, of class Libreria.
     */
    @Test
    public void testReservarLibro() {
        System.out.println("reservarLibro");
        String titulo = "";
        Libreria instance = new Libreria();
        instance.reservarLibro(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprarLibro method, of class Libreria.
     */
    @Test
    public void testComprarLibro() {
        System.out.println("comprarLibro");
        String titulo = "";
        Libreria instance = new Libreria();
        instance.comprarLibro(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverLibro method, of class Libreria.
     */
    @Test
    public void testDevolverLibro() {
        System.out.println("devolverLibro");
        String titulo = "";
        Libreria instance = new Libreria();
        instance.devolverLibro(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
