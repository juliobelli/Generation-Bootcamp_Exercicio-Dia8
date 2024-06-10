package AtividadesDia12.Parte1;

import java.util.*;


public class Exe1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0, numCores = 0;
        String cores;

        List<String> lista = new ArrayList<String>();


        while (numCores <= 0) {
            System.out.println("\nDigite o número de cores que deseja adicionar (maior que 0): ");
            if (sc.hasNextInt()) {
                numCores = sc.nextInt();
                if (numCores <= 0) {
                    System.out.println("\nDigite um número válido.");
                }
            }else {
                System.out.println("\nDigite um número válido.");
            }
        }

        for(int i = 0; i < numCores; i++){
            System.out.println("\nDigite a cor que deseja adicionar: ");
            cores = sc.next();
            lista.add(cores);
        }
        do {

            System.out.println("\nEscolha a opção que deseja: "
                    + "\n1. Exibir as cores adicionadas."
                    + "\n2. Exibir as cores adicionadas em ordem alfabética."
                    + "\n0. Sair do programa.");
            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("\nTodas as cores adicionadas: " + lista);
                }
                case 2 -> {
                    Collections.sort(lista);
                    System.out.println("\nTodas as cores adicionadas em ordem afabética: " + lista);
                }
                case 0 -> {
                    System.out.println("\nEncerrando o programa.");
                }
                default -> {
                    System.out.println("\nOpção inválida.");
                }
            }

        }while (op != 0);
    }
}
