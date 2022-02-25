package desafio.capgemini.pkg2022;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   25-02-2022
 */
public class Questao2Test {
    
    /**
     * Test of gerarEscada method, of class Questao1.
     */
    @Test
    public void verificarRequisitosDaSenhaYa3() {
        
        int respostaEsperada = 3;
	int output = Questao2.verificarRequisitosDaSenha("Ya3");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    @Test
    public void verificarRequisitosDaSenha123456() {
        
        int respostaEsperada = 3;
	int output = Questao2.verificarRequisitosDaSenha("123456");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    @Test
    public void verificarRequisitosDaSenha123Abc() {
        
        int respostaEsperada = 1;
	int output = Questao2.verificarRequisitosDaSenha("123Abc");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    @Test
    public void verificarRequisitosDaSenha1Ab$() {
        
        int respostaEsperada = 2;
	int output = Questao2.verificarRequisitosDaSenha("1Ab$");

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    
    
 
}
