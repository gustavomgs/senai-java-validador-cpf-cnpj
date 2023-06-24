/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.validarcpfcnpj;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String args[]){   
        
         Scanner teclado = new Scanner(System.in);
        
        String cnpj = teclado.nextLine();

        if (CNPJ.validar(cnpj)) {
            System.out.println("CNPJ válido!");
        } else {
            System.out.println("CNPJ inválido!");
        }

    	System.exit(0);
		
    }
}
