package AtividadesDia9;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {

        float id1 = 10, id2 = 15, id3 = 18, id4 = 12, id5 = 8, id6 = 13;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero do produto de 1 a 6: "
                +"\n1. Cachorro Quente |Valor: " + id1
                +"\n2. X-Salada |Valor: " + id2
                +"\n3. X-Bacon |Valor: " + id3
                +"\n4. Bauru |Valor: " + id4
                +"\n5. Refigerante |Valor: " + id5
                +"\n6. Suco de laranja |Valor: " + id6
        );
        int idProduto = ler.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = ler.nextInt();


        System.out.println("===PEDIDO===");
        switch(idProduto){
            case 1:
                System.out.printf("\nProduto: Cachorro quente\nValor total: R$%s", (id1*quantidade));
                break;

            case 2:
                System.out.printf("\nProduto: X-Salada\nValor total: R$%s", (id2*quantidade));
                break;

            case 3:
                System.out.printf("\nProduto: X-Bacon\nValor total: R$%s", (id3*quantidade));
                break;

            case 4:
                System.out.printf("\nProduto: Bauru\nValor total: R$%s", (id4*quantidade));
                break;

            case 5:
                System.out.printf("\nProduto: Refrigerante\nValor total: R$%s", (id5*quantidade));
                break;

            case 6:
                System.out.printf("\nProduto: Suco de laranja\nValor total: R$%s", (id6*quantidade));
                break;
        };
    };
}
