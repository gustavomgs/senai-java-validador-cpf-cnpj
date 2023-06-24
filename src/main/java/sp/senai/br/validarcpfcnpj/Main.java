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
        
        String cpf = teclado.nextLine();

        if (CPF.validar(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

    	System.exit(0);
		
    }
}
