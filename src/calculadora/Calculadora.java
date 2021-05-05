/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Calculadora {

    // TODO code application logic here
    public static void main(String[] args) {

        int op = 0;

        Scanner s = new Scanner(System.in);

        while (op != 7) {
            System.out.println("\n\n Menu de Opções:");
            System.out.println("1 - Somar 2 números");
            System.out.println("2 - Subtrair dois números:");
            System.out.println("3 - Multiplicar 2 números:");
            System.out.println("4 - Dividir 2 números:");
            System.out.println("5 - Raiz de 1 número:");
            System.out.println("6 - Potenciação:");
            System.out.println("7 - Sair");

            System.out.print(">> ");
            op = s.nextInt();

        

        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha sua operação [1 2 3 4 5 6 7 ]: ");
        operacao = entrada.nextLine().charAt(0);

        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();

        switch (operacao) {
            case '1':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;

            case '2':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;

            case '3':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;

            case '4':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;

            case '5':
                System.out.printf("%.2f / (1/%.2f) = %.2f", numero1, Math.sqrt (numero1));
                break;
            
            case '7': 
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;

            default:
                System.out.printf("Você digitou uma operação inválida.");

        }
        }
    }
}

    
