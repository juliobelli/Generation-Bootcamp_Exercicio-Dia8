package AtividadesDia9;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        int idCargo;
        float salario;
        float novoSalario;

        System.out.println("Digite o nome do funcionário: ");
        nome = ler.nextLine();

        System.out.println("Digite o ID do cargo");
        idCargo = ler.nextInt();

        System.out.println("Digite o salário");
        salario = ler.nextFloat();

        switch (idCargo){
            case 1 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Gerente"
                        + "\nSalário: R$" + (salario + (10*salario)
                ));
            }
            case 2 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Vendedor"
                        + "\nSalário: R$" + (salario + (7*salario)
                ));
            }
            case 3 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Supervisor"
                        + "\nSalário: R$" + (salario + (9*salario)
                ));
            }
            case 4 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Motorista"
                        + "\nSalário: R$" + (salario + (6*salario)
                ));
            }
            case 5 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Estoquista"
                        + "\nSalário: R$" + (salario + (5*salario)
                ));
            }
            case 6 -> {
                System.out.println("\nNome do colaborador: " + nome
                        + "\nCargo: Técnico de TI"
                        + "\nSalário: R$" + (salario + (8*salario)
                ));
            }
        }
    }
}
