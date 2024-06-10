package AtividadesDia12.Parte1;

import java.util.*;

public class Exe2 {
    public static void main(String[] args) {

        int pesquisa, posicao;

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();

        lista.add(2);
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(9);
        lista.add(7);
        lista.add(8);
        lista.add(10);
        lista.add(6);

        do {
            System.out.println("\nDigite um número para pesquisar (digite 0 pra sair): ");
            while (!sc.hasNextInt()) {
                System.out.println("\nNúmero inválido. Digite um número inteiro:");
                sc.next();
            }
            pesquisa = sc.nextInt();

            if (pesquisa == 0) {
                System.out.println("\nEncerrando.");
                break;
            }

            if (lista.contains(pesquisa)) {
                posicao = lista.indexOf(pesquisa);
                System.out.println("\nO número " + pesquisa + " existe no banco de dados na posição " + posicao + ".\n");
            } else {
                System.out.println("\nO número " + pesquisa + " não existe no banco de dados.\n");
            }
        } while (pesquisa != 0);
    }
}
