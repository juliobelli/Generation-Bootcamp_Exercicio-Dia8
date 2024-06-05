package AtividadesDia9;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor1, valor2, resultado;
        int operacao;
        System.out.println("=== CALCULADORA ===");
        System.out.println("Digite o primeiro valor entre 1 e 4: ");
        valor1 = entrada.nextFloat();

        System.out.println("Digite o segundo valor entre 1 e 4: ");
        valor2 = entrada.nextFloat();

        if (valor1 >= 1 && valor1 <= 4 && valor2 >= 1 && valor2 <= 4) {
            System.out.println(" === Escolha o número da operação ===");
            System.out.println("SOMA[1] | SUBTRAÇÃO[2] | MULTIPLICAÇÃO[3] | DIVISÃO[4] ");
            operacao = entrada.nextInt();
            switch (operacao) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.println(valor1 + " + " + valor2 + " = " + resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.println(valor1 + " - " + valor2 + " = " + resultado);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.println(valor1 + " * " + valor2 + " = " + resultado);
                }
                case 4 -> {
                    resultado = valor1 / valor2;
                    System.out.println(valor1 + " / " + valor2 + " = " + resultado);
                }
                default -> {
                    System.out.println("Entrada Invalida");
                }
            }
        } else {
            System.out.println("Entrada Invalida");
        }
    }
}