package ProjetoContaBancaria.Conta;

import ProjetoContaBancaria.Conta.util.Cores;
import ProjetoContaBancaria.Conta.model.*;

import java.io.IOException;
import java.util.*;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op;


        ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
        cc1.visualizar();
        cc1.sacar(12000.0f);
        cc1.visualizar();
        cc1.depositar(5000.0f);
        cc1.visualizar();


        ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
        cp1.visualizar();
        cp1.sacar(1000.0f);
        cp1.visualizar();
        cp1.depositar(5000.0f);
        cp1.visualizar();



        while (true){
            System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println("\n*****************************************************"
                            + "\n                                                     "
                            + "\n                   BANCO DO CLEITO                   "
                            + "\n                                                     "
                            + "\n*****************************************************"
                            + "\n                                                     "
                            + "\n            1 - Criar Conta                          "
                            + "\n            2 - Listar todas as Contas               "
                            + "\n            3 - Buscar Conta por Numero              "
                            + "\n            4 - Atualizar Dados da Conta             "
                            + "\n            5 - Apagar Conta                         "
                            + "\n            6 - Sacar                                "
                            + "\n            7 - Depositar                            "
                            + "\n            8 - Transferir valores entre Contas      "
                            + "\n            9 - Sair                                 "
                            + "\n                                                     "
                            + "\n*****************************************************"
                            + "\nEntre com a opção desejada:                          "
                            + "\n                                                     ");
            op = sc.nextInt();

            if (op == 9){
                System.out.println(Cores.TEXT_BLUE +"\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                sobre();
                System.exit(0);
            }

            switch (op){
                case 1 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
                    keyPress();
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
                    keyPress();
                }
                case 3 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
                    keyPress();
                }
                case 4 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
                    keyPress();
                }
                case 5 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");
                    keyPress();
                }
                case 6 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
                    keyPress();
                }
                case 7 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
                    keyPress();
                }
                case 8 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
                    keyPress();
                }
                default -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção inválida!\n");
                    keyPress();
                }
            }
        }
    }
    public static void sobre(){
        System.out.println("\n*****************************************************"
                + "\nProjeto Desenvolvido por: "
                + "\nGeneration Brasil - generation@generation.org"
                + "\ngithub.com/juliobelli "
                + "\n*****************************************************");
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}
