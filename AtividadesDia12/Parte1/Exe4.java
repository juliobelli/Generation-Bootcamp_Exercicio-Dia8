package AtividadesDia12.Parte1;

import java.util.*;

public class Exe4 {
    public static void main(String[] args) {

        int pesquisa;

        Scanner sc = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<Integer>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

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

            if (numeros.contains(pesquisa)) {
                System.out.println("\nO número " + pesquisa + " existe no banco de dados.\n");
            } else {
                System.out.println("\nO número " + pesquisa + " não existe no banco de dados.\n");
            }
        } while (pesquisa != 0);
    }
}
