package AtividadesDia11;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int posicao, soma = 0, numPosicao = 0;
        double media;

        // Loop para garantir que o número de posições seja válido (maior que 0)
        while (numPosicao <= 0) {
            System.out.println("\nDigite o número de posições (maior que 0): ");
            numPosicao = sc.nextInt();
            if (numPosicao <= 0) {
                System.out.println("NÚMERO DE POSIÇÕES INVÁLIDO. Tente novamente.");
            }
        }

        // Criação do vetor com o tamanho especificado pelo usuário
        int[] vetor = new int[numPosicao];

        // Preenchimento do vetor com os números fornecidos pelo usuário
        for (posicao = 0; posicao < numPosicao; posicao++) {
            System.out.println("\nDigite um número na posição " + posicao + ": ");
            vetor[posicao] = sc.nextInt();
            soma += vetor[posicao]; // Adiciona o número à soma total
        }

        // Exibição dos números ímpares do vetor
        System.out.println("\nNúmeros ímpares do vetor:");
        for(posicao = 0; posicao < numPosicao; posicao++) {
            if (vetor[posicao] % 2 != 0) {
                System.out.println(vetor[posicao]);
            }
        }

        // Exibição dos números pares do vetor
        System.out.println("\nNúmeros pares do vetor:");
        for(posicao = 0; posicao < numPosicao; posicao++) {
            if (vetor[posicao] % 2 == 0) {
                System.out.println(vetor[posicao]);
            }
        }

        // Exibição da soma de todos os números do vetor
        System.out.println("\nSoma de todos os números do vetor: " + soma);

        // Cálculo da média de todos os números do vetor
        media = soma / numPosicao;
        System.out.println("Média de todos os números do vetor: " + media);
    }
}
