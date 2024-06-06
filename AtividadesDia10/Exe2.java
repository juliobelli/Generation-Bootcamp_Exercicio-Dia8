package AtividadesDia10;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        int num, contImpar = 0, contPar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");
        num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (num % 2 == 0) {
                contPar++;
            }else {
                contImpar++;
            }

            num = sc.nextInt();
        }

        System.out.println("\nTotal de numero par é: " + contPar
                + "\nTotal de numero impar é: " + contImpar);
    }
}
