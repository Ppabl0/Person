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

//    @Test
//    public void shul_pass(){}
}
