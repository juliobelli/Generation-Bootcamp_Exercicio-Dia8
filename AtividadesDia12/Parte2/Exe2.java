package AtividadesDia12.Parte2;

import java.util.*;

public class Exe2 {
    public static void main(String[] args) {

        String nome, proximoLivro;
        int op;

        Scanner sc = new Scanner(System.in);

        Stack<String> livros = new Stack();

        do {

            System.out.println("\nEscolha uma das opções:\n"
                    + "\n1. Adicionar novo livro a pilha."
                    + "\n2. Listar todos os livros da pilha."
                    + "\n3. Retirar um livro da pilha."
                    + "\n0. Encerrar programa.");
            op = sc.nextInt();


            switch (op) {
                case 1 -> {

                    System.out.println("\nDigite o nome do livro: ");
                    sc.nextLine();
                    nome = sc.next();
                    livros.add(nome);

                }
                case 2 -> {

                    if (!livros.isEmpty()) {
                        for (String livro : livros) {
                            System.out.println(livros);
                        }
                    }else{
                        System.out.println("\nNão há livros na pilha.");
                    }

                }
                case 3 -> {

                    if (!livros.isEmpty()) {
                        proximoLivro = livros.pop();
                        System.out.println("\nChamando: " + proximoLivro);
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
