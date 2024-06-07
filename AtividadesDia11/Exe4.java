package AtividadesDia11;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int linha, coluna, numLinhas = 0, numColunas = 0;
        double soma = 0;

        // Loop para garantir que o número de participantes (linhas) seja válido (inteiro maior que 0)
        while (numLinhas <= 0) {
            System.out.println("\nDigite o número de participantes (maior que 0): ");
            if (sc.hasNextInt()) {
                numLinhas = sc.nextInt();
                if (numLinhas <= 0) {
                    System.out.println("\nNÚMERO DE PARTICIPANTES INVÁLIDO. Tente novamente.");
                }
            } else {
                System.out.println("\nNÚMERO INVÁLIDO. insira um número inteiro.");
                sc.next();
            }
        }

        // Loop para garantir que o número de notas (colunas) seja válido (inteiro maior que 0)
        while (numColunas <= 0) {
            System.out.println("\nDigite o número de notas (maior que 0): ");
            if (sc.hasNextInt()) {
                numColunas = sc.nextInt();
                if (numColunas <= 0) {
                    System.out.println("\nNÚMERO DE NOTAS INVÁLIDO. Tente novamente.");
                }
            } else {
                System.out.println("\nNÚMERO INVÁLIDO. insira um número inteiro.");
                sc.next();
            }
        }

        double[][] matriz = new double[numLinhas][numColunas];
        double[] vetor = new double[numLinhas];

        // Preenchimento da matriz com as notas dos participantes
        for (linha = 0; linha < numLinhas; linha++) {
            soma = 0;
            for (coluna = 0; coluna < numColunas; coluna++) {
                System.out.println("\nDigite a nota " + (coluna + 1) + " do participante " + (linha + 1) + ": ");
                matriz[linha][coluna] = sc.nextDouble();
                soma += matriz[linha][coluna];
            }
            vetor[linha] = soma / numColunas;
        }

        // Exibição da matriz das notas
        System.out.println("\nMatriz das notas:\n");
        for (linha = 0; linha < numLinhas; linha++) {
            for (coluna = 0; coluna < numColunas; coluna++) {
                System.out.print("[ " + matriz[linha][coluna] + " ]" + " ");
            }
            System.out.println();
        }

        // Exibição do vetor das médias
        System.out.println("\nVetor das médias:\n");
        for (linha = 0; linha < numLinhas; linha++) {
            System.out.printf("Média do participante %d: [ %.1f ]\n", (linha + 1), vetor[linha]);
        }
    }
}
