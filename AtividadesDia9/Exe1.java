package AtividadesDia9;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        //Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e
        // imprima na tela se a soma de A + B é maior,
        // menor ou igual a C.

        float n1, n2, n3, soma;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o número B: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o número C: ");
        n3 = entrada.nextFloat();

        if (n1 + n2 > n3) {
            System.out.println("A soma de A + B é maior do que C: " + n1 + " + " +  n2 + " = " + (n1+n2) + " > " + n3);
        } else if (n1 + n2 < n3) {
            System.out.println("A soma de A + B é menor do que C: " + n1 + " + " +  n2 + " = " + (n1+n2) + " < " + n3);
        } else if (n1 + n2 == n3) {
            System.out.println("A soma de A + B é igual a C: " + n1 + " + " +  n2 + " = " + (n1+n2) + " = " + n3);
        }
    }
}
