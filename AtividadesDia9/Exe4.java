package AtividadesDia9;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        String entrada1, entrada2, entrada3;
        Scanner ler = new Scanner(System.in);



        System.out.println("Escreva a opção entre as categorias.\n"
                + "\nVertebrado ou Invertebrado"
        );
        entrada1 = ler.nextLine();




        if (entrada1.equalsIgnoreCase("Vertebrado")){
            System.out.println("\nEscreva a opção entre as categorias.\n"
                    + "\nAve ou Mamifero"
            );
            entrada2 = ler.nextLine();


            if (entrada2.equalsIgnoreCase("Ave")){
                System.out.println("\nEscreva a opção entre as categorias.\n"
                        + "\nCarnivoro ou Onivoro"
                );
                entrada3 = ler.nextLine();
                
                if (entrada3.equalsIgnoreCase("Carnivoro")){
                    System.out.println("\nVertebrado + Ave + Carnivoro"
                            + "\nResultado: Águia");

                } else if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("\nOnivoro + Ave + Onivoro"
                            + "\nResultado: Pomba");
                }
            }


            if (entrada2.equalsIgnoreCase("Mamifero")){
                System.out.println("\nEscreva a opção entre as categorias.\n"
                        + "\nOnivoro ou Herbivoro"
                );
                entrada3 = ler.nextLine();

                if (entrada3.equalsIgnoreCase("Onivoro")){
                    System.out.println("\nVertebrado + Mamifero + Onivoro"
                            + "\nResultado: Humano");

                } else if (entrada3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("\nVertebrado + Mamifero + Herbivoro"
                            + "\nResultado: Pomba");
                }
            }
        }




        if (entrada1.equalsIgnoreCase("Invertebrado")){
            System.out.println("\nEscreva a opção entre as categorias.\n"
                    + "\nInseto ou Anelideo"
            );
            entrada2 = ler.nextLine();


            if (entrada2.equalsIgnoreCase("Inseto")){
                System.out.println("\nEscreva a opção entre as categorias.\n"
                        + "\nHematofago ou Herbivoro"
                );
                entrada3 = ler.nextLine();

                if (entrada3.equalsIgnoreCase("Hematofago")){
                    System.out.println("\nInvertebrado + Inseto + Hematofago"
                            + "\nResultado: Pulga");

                } else if (entrada3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("\nInvertebrado + Inseto + Herbivoro"
                            + "\nResultado: Lagarta");
                }
            }


            if (entrada2.equalsIgnoreCase("Anelideo")){
                System.out.println("\nEscreva a opção entre as categorias.\n"
                        + "\nHematofago ou Onivoro"
                );
                entrada3 = ler.nextLine();

                if (entrada3.equalsIgnoreCase("Hematofago")){
                    System.out.println("\nInvertebrado + Anelideo + Hematofago"
                            + "\nResultado: Sanguessuga");

                } else if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("\nInvertebrado + Anelideo + Onivoro"
                            + "\nResultado: Minhoca");
                }
            }
        }
    }
}