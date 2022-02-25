/**
 * Este programa recebe uma string (potencial senha) e retorna o número mínimo
 * de caracteres que devem ser adicionados para a senha ser considerada segura.
 * 
 * Uma senha é considerada segura quando ela satisfaz os seguintes critérios:
 * - Possui no mínimo 6 caracteres.
 * - Contém no mínimo 1 dígito.
 * - Contém no mínimo 1 letra em minúsculo.
 * - Contém no mínimo 1 letra em maiúsculo.
 * - Contém no mínimo 1 caractere especial "!@#$%^&*()-+"
 * 
 * @author  Beatriz Makowski
 * @version 1.0
 * @since   23-02-2022
 */

package desafio.capgemini.pkg2022;

import java.util.*;

public class Questao2 {

    public static void main(String[] args) {     
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = input.nextLine();
        System.out.println(verificarRequisitosDaSenha(senha));
        input.close();
    }
    
    /**
     * Verifica se a senha inputada pelo usuária atende todos os requisitos pré-
     * definidos. Retorna o número mínimo de caracteres que devem ser adiciona-
     * dos para a senha ser considerada segura.
     * 
     * @param senha     a senha a ser avaliada
     * @return n        o número mínimo de caracteres adicionais para que a
     *                  senha seja considerada segura
     */
    public static int verificarRequisitosDaSenha(String senha) {

        Set<Character> charsEspeciais = new HashSet<Character>(Arrays.asList(
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        HashMap<String, Boolean> requisitos = new HashMap<String, Boolean>() {{
          put("temNumero", false);
          put("temMinusculo", false);
          put("temMaiusculo", false);
          put("temEspecial", false);
        }};
        int n = 0; 
        
        for (char i : senha.toCharArray()) {
            if (Character.isDigit(i))
                requisitos.put("temNumero", true);
            //else
                //System.err.println("Sua senha deve conter ao menos um número!");
            
            if (Character.isLowerCase(i))
                requisitos.put("temMinusculo", true);
            //else
                //System.err.println("Sua senha deve conter ao menos um caractere minúsculo!");
            
            if (Character.isUpperCase(i))
                requisitos.put("temMaiusculo", true);
            //else
                //System.err.println("Sua senha deve conter ao menos um caractere maiúsculo!");
            
            if (charsEspeciais.contains(i))
                requisitos.put("temEspecial", true);
            //else
                //System.err.println("Sua senha deve conter ao menos um caractere especial!");
        }
        
        // Cada requisito não atendido sinaliza a necessidade de pelo menos
        // um caractere adicional.
        for (var value : requisitos.values()) {
            if (value == false)
                n++;
        }
        
        // Considera o pior caso entre número de requisitos não atendidos e o
        // número de caracteres da senha inputada pelo usuário.
        if ((senha.length() < 6) && (6 - senha.length() > n)) {
            n = 6 - senha.length();
            //System.err.println("Sua senha deve conter ao menos 6 dígitos!");
        }
        
        return n;
    }
}