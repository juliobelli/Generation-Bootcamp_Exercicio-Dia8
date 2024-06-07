package AtividadesDia11;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numPesquisa, posicao, numPosicao = 0, posicaoAlvo = -1;

        // Loop para garantir que o número de posições seja válido (maior que 0)
        while (numPosicao <= 0) {
            System.out.println("Digite o número de posições (maior que 0): ");
            numPosicao = sc.nextInt();
            if (numPosicao <= 0) {
                System.out.println("\nNÚMERO DE POSIÇÕES INVÁLIDO. Tente novamente.");
            }
        }


        int[] vetor = new int[numPosicao];

        // Loop para preencher o vetor com números fornecidos pelo usuário
        for (posicao = 0; posicao < numPosicao; posicao++){
            System.out.println("\nDigite um número na posição " + posicao + ": ");
            vetor[posicao] = sc.nextInt();
        }

        System.out.println("\nDigite um número para pesquisar: ");
        numPesquisa = sc.nextInt();

        // Loop para pesquisar o número no vetor
        for (posicao = 0; posicao < numPosicao; posicao++){
            if (vetor[posicao] == numPesquisa){ // Verifica se o número foi encontrado
                posicaoAlvo = posicao; // Armazena a posição onde o número foi encontrado
                break;
            }
        }

        // Verifica se o número foi encontrado e exibe a posição
        if (posicaoAlvo != -1){ // Se posicaoAlvo for diferente de -1, o número foi encontrado
            System.out.println("\nO número " + numPesquisa + " foi encontrado na posição: " + posicaoAlvo);
        } else {
            System.out.println("\nO número não foi encontrado.");
        }
    }
}
