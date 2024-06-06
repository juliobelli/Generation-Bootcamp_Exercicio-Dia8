package AtividadesDia10;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero menor: ");
        num1 = sc.nextInt();
        System.out.println("Digite um numero maior: ");
        num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido");
        }else{
            System.out.println("Números que são múltiplos de 3 e 5: ");

            for (int i = num1; i <= num2; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }
    }
}