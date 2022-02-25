/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package desafio.capgemini.pkg2022;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   25-02-2022
 */
public class Questao3Test {
    
    public Questao3Test() {
    }

    /**
     * Test of contarAnagramas(), of class Questao3.
     */
    @Test
    public void testeOvo() {
        
        int respostaEsperada = 2;
	int output = Questao3.contarAnagramas("ovo");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
    }
    
     /**
     * Test of contarAnagramas(), of class Questao3.
     */
    @Test
    public void testeOvo2() {
        
        int respostaEsperada = 2;
	int output = Questao3.contarAnagramas("Ovo");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
    }

     /**
     * Test of contarAnagramas(), of class Questao3.
     */
    @Test
    public void testeIfa() {
        
        int respostaEsperada = 3;
	int output = Questao3.contarAnagramas("ifailuhkqq");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
    }
    
    @Test
    public void testeA() {
        
        int respostaEsperada = 0;
	int output = Questao3.contarAnagramas("a");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
    }
    
}
