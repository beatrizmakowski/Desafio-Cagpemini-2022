package desafio.capgemini.pkg2022;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   25-02-2022
 */
public class Questao1Test {
    
    /**
     * Test of gerarEscada method, of class Questao1.
     */
    @Test
    public void testGerarEscada1() {
        
        String respostaEsperada = "*\n";
	String output = Questao1.gerarEscada(1);

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    @Test
    public void testGerarEscada3() {
        
        String respostaEsperada = "  *\n **\n***\n";
	String output = Questao1.gerarEscada(3);

	assertNotNull(output);
	assertEquals(respostaEsperada, output);
        
    }
    
    @Test
    public void testGerarEscada6() {
        
        String respostaEsperada = "     *\n    **\n   ***\n  ****\n *****\n******\n";
	String output = Questao1.gerarEscada(6);
	
        assertNotNull(output);
	assertEquals(respostaEsperada, output);
    }
    
    //TODO
    //testar se receberAltura rejeita input não numérico
    //testar se receberAltura rejeita input numérico não inteiro
    //testar se receberAltura rejeita altura 0
    
 
}
