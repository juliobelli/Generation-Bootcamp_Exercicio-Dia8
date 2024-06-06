package AtividadesDia10;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        int idade, contMenor = 0, contMaior = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades (Digite um numero negativo para encerrar): ");

        while (true) {
            idade = sc.nextInt();

            if (idade < 0){
                break;
            }

            if (idade < 21) {
                contMenor++;
            } else if (idade > 50) {
                contMaior++;
            }
        }

        System.out.println("\nTotal de pessoas menores de 21 anos: " + contMenor
                + "\nTotal de pessoas maiores de 50 anos: " + contMaior);
    }
}
