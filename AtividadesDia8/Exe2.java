package AtividadesDia8;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        float n1, n2, n3, n4, media;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        n1 = leia.nextFloat();
        System.out.println("Digite a 2º nota: ");
        n2 = leia.nextFloat();
        System.out.println("Digite a 3º nota: ");
        n3 = leia.nextFloat();
        System.out.println("Digite a 4º nota: ");
        n4 = leia.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A média das notas é: %.2f", media);
    }
}
