/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mango.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class TelevisionTest {
    
    public TelevisionTest() {
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
     * Test of cambiarVolumen method, of class Television.
     */
    @Test
    public void testCambiarVolumen() {
        System.out.println("cambiarVolumen");
        int cantidad = 84;
        Television tv = new Television("Samsung", "XH256", "Negro", 55, 35);
        String expResult = "Se cambió el volumen a 84";
        String result = tv.cambiarVolumen(cantidad);
        assertEquals(expResult, result);
   
    }
    
}
