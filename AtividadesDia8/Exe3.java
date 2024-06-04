package AtividadesDia8;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        //Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno,
        // as Horas Extras e os Descontos de um Colaborador,
        // em variáveis do tipo float e exiba na tela o Salário Líquido.
        // Veja o exemplo abaixo:
        //SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS

        float salarioB, salarioL, addNoturno, addHoras, desconto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        salarioB = entrada.nextFloat();
        System.out.println("Digite o adicional noturno: ");
        addNoturno = entrada.nextFloat();
        System.out.println("Digite as horas extras: ");
        addHoras = entrada.nextFloat();
        System.out.println("Digite seu desconto: ");
        desconto = entrada.nextFloat();

        salarioL = salarioB + (addNoturno + (addHoras * 5) - desconto);

        System.out.printf("O salário líquido é: %.2f", salarioL);


    }
}
