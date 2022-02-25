/**
 * Este programa recebe uma string e retorna o número de pares de substrings
 * que são anagramas.
 * 
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   25-02-2022
 */

package desafio.capgemini.pkg2022;

import java.util.*;

public class Questao3 {

    public static void main(String[] args) {     
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String s = input.nextLine();
        System.out.println(contarAnagramas(s));
        input.close();
    }
    
    /**
     * Analisa uma string e retorna o número de pares de substrings que são
     * anagramas.
     * 
     * @param s                 a string a ser avaliada
     * @return paresAnagramas   o número de substrings que são anagramas
     */
    public static int contarAnagramas(String s) {

        // Strings vazias ou com uma só letra não possuem anagramas
        if (s.length() == 0 || s.length() == 1) return 0;
        
        s = s.toUpperCase();
        
        HashMap<String, Integer> freqLetras = new HashMap<>();
        
	for (int i = 0; i < s.length(); i++) {
            
            for (int j = i; j < s.length(); j++) {
                
		char[] arrayPalavra = s.substring(i, j + 1).toCharArray();
		Arrays.sort(arrayPalavra);
		String chaveArrayPalavra = new String(arrayPalavra);
		
                if (freqLetras.containsKey(chaveArrayPalavra))
                    freqLetras.put(chaveArrayPalavra, freqLetras.get(chaveArrayPalavra) + 1);
		else
                    freqLetras.put(chaveArrayPalavra, 1);
                
                /*
                freqLetras.entrySet().forEach(entry -> {
                String format = "%-5s%s%n";
                System.out.printf(format, entry.getKey(), entry.getValue());
                });
                System.out.println();
                */
            }
	}  

	int paresAnagramas = 0;
	for (String chave : freqLetras.keySet()) {
            int n = freqLetras.get(chave);
            paresAnagramas += (n * (n - 1)) / 2;
        }
	return paresAnagramas;
    }
}