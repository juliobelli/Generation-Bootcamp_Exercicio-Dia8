package ProjetoContaBancaria.Conta;

import ProjetoContaBancaria.Conta.controller.ContaController;
import ProjetoContaBancaria.Conta.util.Cores;
import ProjetoContaBancaria.Conta.model.*;

import java.io.IOException;
import java.util.*;

public class Menu {
    public static void main(String[] args) {


        ContaController contas = new ContaController();

        Scanner sc = new Scanner(System.in);

        int op, numero, agencia, tipo, aniversario, numeroDestino;
        String titular;
        float saldo, limite, valor;

        ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
        contas.cadastrar(cc1);
        ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
        contas.cadastrar(cc2);
        ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
        contas.cadastrar(cp1);
        ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
        contas.cadastrar(cp2);

        contas.listarTodas();

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
                    System.out.println("Digite o Número da Agência: ");
                    agencia = sc.nextInt();
                    System.out.println("Digite o Nome do Titular: ");
                    sc.skip("\\R?");
                    titular = sc.nextLine();

                    do {
                        System.out.println("Digite o Tipo da Conta (1-CC ou 2-CC): ");
                        tipo = sc.nextInt();
                    }while (tipo < 1 && tipo > 2);

                    System.out.println("Digite o saldo do Conta (R$): ");
                    saldo = sc.nextFloat();

                    switch (tipo){
                        case 1 -> {
                            System.out.println("Digite o limite de Crédito (R$): ");
                            limite = sc.nextFloat();
                            contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
                        }
                        case 2 -> {
                            System.out.println("Digite o dia do Aniversário da conta: ");
                            aniversario = sc.nextInt();
                            contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
                        }
                    }
                    keyPress();
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
                    contas.listarTodas();
                    keyPress();
                }
                case 3 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
                    keyPress();
                }
                case 4 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextInt();

                    var buscaConta = contas.buscarNaCollection(numero);

                    if (buscaConta == null){
                        tipo = buscaConta.getTipo();

                        System.out.println("Digite o numero da agência: ");
                        agencia = sc.nextInt();
                        System.out.println("Digite o Nome do Titular: ");
                        sc.skip("\\R?");
                        titular = sc.nextLine();

                        System.out.println("Digite o saldo do Conta (R$): ");
                        saldo = sc.nextFloat();

                        switch (tipo){
                            case 1 -> {
                                System.out.println("Digite o limite de Crédito (R$): ");
                                limite = sc.nextFloat();

                                contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
                            }
                            case 2 -> {
                                System.out.println("Digite o dia do aniversário da conta: ");
                                aniversario = sc.nextInt();

                                contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
                            }
                            default -> {
                                System.out.println("Tipo de conta inválido!");
                            }
                        }
                    }else {
                        System.out.println("A conta não foi encontrada!");
                    }
                    keyPress();
                }
                case 5 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");

                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextInt();

                    contas.deletar(numero);
                    keyPress();
                }
                case 6 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

                    System.out.println("Digite o numero da conta: ");
                    numero = sc.nextInt();

                    do{
                        System.out.println("Digite o Valor do Saque (R$)");
                        valor = sc.nextFloat();
                    }while(valor <= 0);

                    contas.sacar(numero, valor);

                    keyPress();
                }
                case 7 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

                    System.out.println("Digite o numero da conta: ");
                    numero = sc.nextInt();

                    do {
                        System.out.println("Digite o valor do depósito (R$): ");
                        valor = sc.nextFloat();
                    }while(valor <= 0);

                    contas.depositar(numero, valor);
                    keyPress();
                }
                case 8 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

                    System.out.println("Digite o numero da conta de origem: ");
                    numero = sc.nextInt();
                    System.out.println("Digite o numero da conta de destino: ");
                    numeroDestino = sc.nextInt();

                    do {
                        System.out.println("Digite o valor do origem (R$): ");
                        valor = sc.nextFloat();
                    }while(valor <= 0);

                    contas.transferir(numero, numeroDestino, valor);
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
