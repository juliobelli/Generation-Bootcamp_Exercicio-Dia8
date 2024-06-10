package AtividadesDia12.Parte2;

import java.util.*;

public class Exe1 {
    public static void main(String[] args) {

        String nome, proximoCliente;
        int op;

        Scanner sc = new Scanner(System.in);

        Queue<String> clientes = new LinkedList<>();

        do {

            System.out.println("\nEscolha uma das opções:\n"
                    + "\n1. Adicionar novo cliente a fila."
                    + "\n2. Listar todos os clientes da fila."
                    + "\n3. Chamar uma pessoa da fila."
                    + "\n0. Encerrar programa.");
            op = sc.nextInt();


            switch (op) {
                case 1 -> {

                    System.out.println("\nDigite o nome do cliente: ");
                    nome = sc.next();
                    clientes.add(nome);

                }
                case 2 -> {

                    if (!clientes.isEmpty()) {
                        for (String cliente : clientes) {
                            System.out.println(cliente);
                        }
                    }else{
                        System.out.println("\nNão há clientes cadastrados.");
                    }

                }
                case 3 -> {

                    if (!clientes.isEmpty()) {
                        proximoCliente = clientes.poll();
                        System.out.println("\nChamando: " + proximoCliente);
                    } else {
                        System.out.println("\nNão tem clientes na fila.");
                    }

                }
                case 0 -> {

                    System.out.println("\nEncerrando.");

                }
                default -> {

                    System.out.println("\nInsira uma opção válida");

                }
            }
        }while (op != 0);
    }
}
