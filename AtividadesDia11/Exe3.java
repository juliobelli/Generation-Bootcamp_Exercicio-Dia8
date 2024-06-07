package AtividadesDia11;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int linha, coluna, numLinhas = 0, numColunas = 0, somaPrincipal = 0, somaSecundaria = 0;

        // Solicita ao usuário o número de linhas até que seja um valor válido (maior que 0)
        while (numLinhas <= 0) {
            System.out.println("Digite o número de linhas (maior que 0): ");
            numLinhas = sc.nextInt();
            if (numLinhas <= 0) {
                System.out.println("NÚMERO DE LINHAS INVÁLIDO. Tente novamente.");
            }
        }

        // Solicita ao usuário o número de colunas até que seja um valor válido (maior que 0)
        while (numColunas <= 0) {
            System.out.println("\nDigite o número de colunas (maior que 0): ");
            numColunas = sc.nextInt();
            if (numColunas <= 0) {
                System.out.println("NÚMERO DE COLUNAS INVÁLIDO. Tente novamente.");
            }
        }

        // Cria uma matriz com o número de linhas e colunas especificados pelo usuário
        int[][] matriz = new int[numLinhas][numColunas];

        // Preenche a matriz com os números fornecidos pelo usuário
        for(linha = 0; linha < numLinhas; linha++){
            for(coluna = 0; coluna < numColunas; coluna++){
                System.out.println("\nDigite um número para armazenar na linha " + linha + " e coluna " + coluna + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        // Exibe a matriz completa
        System.out.println("\nMatriz Completa:\n ");
        for (linha = 0; linha < numLinhas; linha++) {
            for (coluna = 0; coluna < numColunas; coluna++) {
                System.out.printf("[ %d ]", matriz[linha][coluna]); // Formata a exibição dos elementos da matriz
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        // Calcula e exibe os elementos da diagonal principal e sua soma
        System.out.println("\nNúmeros da Diagonal Principal:\n ");
        for (linha = 0; linha < numLinhas; linha++) {
            System.out.printf("[ %d ]", matriz[linha][linha]);
            somaPrincipal += matriz[linha][linha];
        }
        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);

        // Calcula e exibe os elementos da diagonal secundária e sua soma
        System.out.println("\nNúmeros da Diagonal Secundária:\n ");
        for (linha = 0; linha < numLinhas; linha++) {
            System.out.printf("[ %d ]", matriz[linha][numColunas - linha - 1]);
            somaSecundaria += matriz[linha][numColunas - linha - 1];
        }
        System.out.println("\nSoma da Diagonal Secundária: " + somaSecundaria);

    }
}
