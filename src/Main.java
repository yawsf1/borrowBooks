import java.util.HashMap;

import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    static void getMessage(HashMap<String, Double> namesPrices, double total){
        if(namesPrices.isEmpty()){
            System.out.println("You didn't buy any book !");
        }
        else {
            namesPrices.forEach((key, value)
                    -> System.out.printf("Vous etes achete %s     %.2f \n", key, value)
            );
            System.out.println("The total is: "+ total);

        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            HashMap<String, Double> PricesNames = new HashMap<>();
            double total = 0;

            while (true) {
                System.out.print("Entrez votre nom (q pour quitter) : ");
                String nom = scan.nextLine();

                if (nom.equalsIgnoreCase("q")) {
                    getMessage(PricesNames, total);
                    System.out.print("Au revoir !");
                    break;
                }

                System.out.print("Entrez votre âge (0 pour quitter) : ");
                int age = scan.nextInt();
                scan.nextLine();
                if (age == 0) {
                    getMessage(PricesNames, total);
                    System.out.print("Au revoir !");
                    break;
                }

                System.out.print("Entrez votre ville (q pour quitter) : ");
                String ville = scan.nextLine();
                if (ville.equalsIgnoreCase("q")) {
                    getMessage(PricesNames, total);
                    System.out.print("Au revoir !");
                    break;
                }
                int choix = 0;
                do{
                    System.out.println();
                    System.out.println("********* Liste des livres *********");
                    System.out.println("1. Les Misérables       52.00 MAD");
                    System.out.println("2. L’Étranger           76.00 MAD");
                    System.out.println("3. Le Petit Prince      53.00 MAD");
                    System.out.println("4. Madame Bovary        117.00 MAD");
                    System.out.println("5. Notre-Dame de Paris  63.00 MAD");
                    System.out.println("********* Liste des livres *********");

                    System.out.print("Choisissez un livre (0 pour quitter) : ");
                    choix =  scan.nextInt();
                    scan.nextLine();

                    String livre = "";
                    double prix = 0;
                    if(choix == 0){
                        getMessage(PricesNames, total);
                        System.out.print("Au revoir !");
                        break;
                    }
                    switch (choix) {
                        case 1 -> { prix = 52.00; livre = "Les Misérables";}
                        case 2 -> { prix = 76.00; livre = "L’Étranger"; }
                        case 3 -> { prix = 53.00; livre = "Le Petit Prince"; }
                        case 4 -> { prix = 117.00; livre = "Madame Bovary"; }
                        case 5 -> { prix = 63.00; livre = "Notre-Dame de Paris"; }
                        default -> { System.out.println("Choix invalide.");
                            continue;
                        }
                    }
                    PricesNames.put(livre, prix);
                    System.out.print("Entrez la quantité (0 pour quitter) : ");
                    int quantite = scan.nextInt();
                    scan.nextLine();
                    total = prix*quantite + total;


                    if (quantite == 0) {
                        getMessage(PricesNames, total);
                        System.out.print("Au revoir !");
                        break;
                    }

                    LocalDate aujourdHui = LocalDate.now();
                    LocalDate retour = aujourdHui.plusDays(30);

                    Book book = new Book(livre, aujourdHui, quantite, retour, prix);
                    Person person = new Person(nom, age, ville);

                    System.out.print("\n\n");
                    person.bonjour();
                    book.afficherLivreChoisi();
                }
                while (choix != 0);

            }
        } catch (Exception e) {
            System.out.println("Erreur !");
        }
        finally {
            scan.close();
        }
    }

}
