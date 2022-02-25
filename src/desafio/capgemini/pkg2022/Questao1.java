/**
 * Este programa mostra na tela uma escada de tamanho "n" utilizando o caractere
 * "*" e espaços, com base e altura iguais ao valor de "n".
 * 
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   23-02-2022
 */

package desafio.capgemini.pkg2022;

import java.util.Scanner;

/**
 * Este programa mostra na tela uma escada de tamanho "n" utilizando o caractere
 * "*" e espaços, com base e altura iguais ao valor de "n".
 * 
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   23-02-2022
 */
public class Questao1 {
   
    public static void main(String[] args) {     
        
        String escada = gerarEscada(receberAltura());
        System.out.println(escada);   
    }
    
     /**
     * Verifica se: 
     * 1) se o input do usuário é numérico;
     * 2) caso seja numérico, se é maior do que zero. 
     * O loop irá repetir até o usuário cooperar com as condições acima.
     * 
     * @return h        altura da escada
     */
    public static int receberAltura() {
        
        Scanner scanner = new Scanner(System.in);
        int h = -1;
        
        do{
            System.out.print("Digite a altura desejada: ");
            String input = scanner.nextLine();
            try {
                h = Integer.parseInt(input);
            } catch (NumberFormatException erroInputNaoNumerico) {
                System.err.println("Não é permitido inserir caracteres não "
                        + "numéricos!");
            }
            if (h <= 0) {
                System.out.println("A altura deve ser um número inteiro maior "
                        + "que zero. Tente novamente.\n");
            }
        } while (h <= 0); 
        
        scanner.close();
        
        return h;
    }
    
    
    /**
     * Imprime na tela uma escada de tamanho "n" utilizando o caractere "*" e 
     * espaços, com base e altura iguais ao valor de "n".
     * 
     * @param h             altura da escada
     * @return strEscada    string que contém os caracteres da escada gerada
     */
    public static String gerarEscada(int h) {
        int contador = 1;
        String strEscada = new String();
        do {
            for (int i = 0; i < (h - contador); i++){
                strEscada += " ";
            }
            for (int i = 0; i < contador; i++){
                strEscada += "*";
            }
            strEscada += "\n";
            contador++;
        } while (contador <= h);
        
        return strEscada;
    }
    
    
}
