package AtividadesDia10;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {

        float num, media, contNum = 0, contMul = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros para adicionar na média dos múltiplos de 3 (digite 0 para sair): ");

        do{
            num = sc.nextInt();

            if(num % 3 == 0 && num != 0){
                contNum += num;
                contMul++;
            }

        }while(num != 0);

        if(contMul > 0){
            media = (contNum / contMul);
            System.out.println("A média dos numeros multiplos de 3 é: " + media);

        }else {
            System.out.println("Nenhum múltiplo de 3 foi digitado");

        }
    }
}
