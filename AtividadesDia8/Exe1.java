package AtividadesDia8;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        float salario, abono, novoSalario;

        Scanner leia = new Scanner(System.in);

        System.out.print("\nDigite o seu salário: ");
        salario = leia.nextFloat();
        System.out.print("\nDigite o seu abono: ");
        abono = leia.nextFloat();

        novoSalario = salario + abono;

        System.out.printf("\nSeu salário é: %.2f%n", novoSalario);
    }
}
