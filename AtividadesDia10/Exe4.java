package AtividadesDia10;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        float idadeMedia, idade, id, area, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contadorPes = 0, contadorIdade = 0;
        String res;

        Scanner sc = new Scanner(System.in);

        while(true){

            //Questionário de pesquisa
            System.out.println("\nDigite a idade: ");
            idade = sc.nextInt();

            contadorIdade += idade;

            System.out.println("\nDigite a identidade de gênero: "
                    + "\n 1. Mulher Cis"
                    + "\n 2. Homem Cis"
                    + "\n 3. Não Binário"
                    + "\n 4. Mulher Trans"
                    + "\n 5. Homem Trans"
                    + "\n 6. Outro"
            );
            id = sc.nextInt();

            System.out.println("\nDigite a área de atuação: "
                    + "\n 1. Backend"
                    + "\n 2. Frontend"
                    + "\n 3. Mobile"
                    + "\n 4. FullStack"
            );
            area = sc.nextInt();

            System.out.println("\n\nDeseja continuar? (S/N) ");
            res = sc.next();


            //Contadores de numero de pessoas, separadas por critérios
            if(area == 1){
                contador1++;
            }else if(area == 2 && id == 1 || id == 4){
                contador2++;
            }else if(area == 3 && id == 2 || id ==5 && idade>40){
                contador3++;
            }else if(area == 4 && id == 3 && idade>30){
                contador4++;
            }


            //Contador de numero de respostas à pesquisa
            contadorPes++;
            if(res.equalsIgnoreCase("N")) {
                break;
            }
        }

        idadeMedia = (float)(contadorIdade/contadorPes);

        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + contador1
                + "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + contador2
                + "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contador3
                + "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contador4
                + "\nNúmero total de pessoas que responderam à pesquisa: " + contadorPes
                + "\nMédia de idade das pessoas que responderam à pesquisa: " + (idadeMedia));
    }
}
