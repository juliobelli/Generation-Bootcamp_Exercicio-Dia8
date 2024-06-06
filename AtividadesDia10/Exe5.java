package AtividadesDia10;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {

        int num, contNum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros para adicionar na soma total dos positivos (digite 0 para sair): ");

        do{
            num = sc.nextInt();

            if(num > 0){
                contNum += num;
            }

        }while(num != 0);

        System.out.println("Soma total dos números positivos é: " + contNum);
    }
}
