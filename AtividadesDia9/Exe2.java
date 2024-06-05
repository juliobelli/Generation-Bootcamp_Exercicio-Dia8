package AtividadesDia9;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        // Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
        // uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou
        // negativo. Veja os exemplos abaixo:

        int n1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();

        if (n1 % 2 == 0 && n1 > 0) {
            System.out.printf("O número %d é par e positivo!\n", n1);
        } else if (n1 % 2 != 0 && n1 > 0) {
            System.out.printf("O número %d é ímpar e positivo!\n", n1);
        } else if (n1 % 2 == 0 && n1 < 0) {
            System.out.printf("O número %d é par e negativo!\n", n1);
        } else if (n1 % 2 != 0 && n1 < 0) {
            System.out.printf("O número %d é ímpar e negativo!\n", n1);
        } else {
            System.out.printf("O número %d é zero!\n", n1);
        }
    }
}
