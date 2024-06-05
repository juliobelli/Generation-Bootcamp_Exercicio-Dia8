package AtividadesDia9;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        String nome;
        int idade;
        int primeiraDoacaoInput;
        boolean primeiraDoacao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Primeira doação de sangue? Digite 1 para sim e 2 para não: ");
        primeiraDoacaoInput = entrada.nextInt();
        primeiraDoacao = (primeiraDoacaoInput == 1);

        if (idade >= 18 && idade <= 69 && (idade <= 60 || !primeiraDoacao)) {
            System.out.printf("%s está apto(a) para doar sangue!\n", nome);
        } else {
            System.out.printf("%s não está apto(a) para doar sangue!\n", nome);
        }
    }
}
