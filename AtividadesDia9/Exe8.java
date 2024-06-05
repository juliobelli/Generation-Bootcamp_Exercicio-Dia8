package AtividadesDia9;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {

        int opcao;
        float valorOperacao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        float saldo = scanner.nextFloat();

        while (true) {
            // Apresentar o menu de opções
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

          
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$");
                    valorOperacao = scanner.nextFloat();
                    scanner.nextLine(); // Consumir quebra de linha
                    saldo += valorOperacao;
                    System.out.printf("Depósito realizado com sucesso! Novo saldo: R$%.2f\n", saldo);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$");
                    valorOperacao = scanner.nextFloat();
                    scanner.nextLine(); // Consumir quebra de linha
                    if (saldo >= valorOperacao) {
                        saldo -= valorOperacao;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$%.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para saque!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nossos serviços!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Operação inválida!");
            }
        }

    }
}
