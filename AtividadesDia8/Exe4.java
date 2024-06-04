package AtividadesDia8;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        //Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e
        // mostre a diferença do produto entre o
        // n1 e n2 pelo produto entre o n3 e o n4.

        float n1, n2, n3, n4, calculo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o numero 3: ");
        n3 = entrada.nextFloat();
        System.out.println("Digite o numero 4: ");
        n4 = entrada.nextFloat();

        calculo = (n1 * n2) - (n3 * n4);

        System.out.printf("A diferença é: %.2f", calculo);
    }
}
