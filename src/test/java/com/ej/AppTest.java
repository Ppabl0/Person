package com.ej;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    @DisplayName("suma rigurosa Test")
    public void sumacion(){
        assertEquals(9, 4+5, "la suma no dio 9");
    }

    @Test
    public void suma1Test(){
        assertEquals(1, DemoRestController.suma1());
    }

    @Test
    public void suma2Test(){
        assertEquals(2, DemoRestController.suma2());
    }

    @Test
    public void suma3Test(){
        assertEquals(3, DemoRestController.suma3());
    }

    @Test
    public void suma4Test(){
        assertEquals(4, DemoRestController.suma4());
    }

    @Test
    public void suma5Test(){
        assertEquals(5, DemoRestController.suma5());
    }

    @Test
    public void suma6Test(){
        assertEquals(6, DemoRestController.suma6());
    }

    @Test
    public void suma7Test(){
        assertEquals(7, DemoRestController.suma7());
    }

    @Test
    public void saludoTest(){
        assertEquals("saludo", DemoRestController.saludo());
    }
}
