package AtividadesDia12.Parte1;

import java.util.*;

public class Exe3 {
    public static void main(String[] args) {

        int numInteiro = 0, num;

        Scanner sc = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<Integer>();


        while (numInteiro <= 0) {
            System.out.println("\nDigite a quantidade de números que deseja (maior que 0): ");

            if (sc.hasNextInt()) {
                numInteiro = sc.nextInt();
                if (numInteiro <= 0) {
                    System.out.println("\nDigite um número válido.");
                }
            }else {
                System.out.println("\nDigite um número válido.");
            }

        }

        for (int i = 0; i < numInteiro; i++) {
            System.out.println("\nDigite o número que deseja adicionar:");

            while (!sc.hasNextInt()) {
                System.out.println("Número inválido. Digite um número inteiro:");
                sc.next();
            }

            num = sc.nextInt();
            numeros.add(num);

        }

        Iterator<Integer> iterator = numeros.iterator();

        System.out.println("\nNúmeros da Collection Set: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
