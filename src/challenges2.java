import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class challenges2 {
    public static void main(String[] args) {

//-------------------- 1. Système de Facturation Électrique ----------------

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Donnez le nombre d'unités consommées: ");
//        int nbrUniteConsomme = scanner.nextInt();
//        scanner.nextLine();
//
//        double facture = 0;
//
//        if (nbrUniteConsomme <= 100) {
//            facture = (nbrUniteConsomme * 0.8);
//        } else if (nbrUniteConsomme <= 300) {
//            facture = (100 * 0.8) + (nbrUniteConsomme - 100) * 1.2;
//        } else {
//            facture = (100 * 0.8) + (200 * 1.2) + (nbrUniteConsomme - 300) * 1.5;
//        }
//
//        double taxe = facture * 0.1;
//        double total = facture + taxe;
//        System.out.println("Facture avant taxe : " + facture);
//        System.out.println("Taxe (10%): " + taxe);
//        System.out.println("Facture totale: " + total);
//
//        scanner.close();

//-------------------- 2. Robot Navigateur (Robot Path Finder) ----------------

//        int x = 0;
//        int y = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Veuillez donner les commandes (UP) (LEFT) (RIGHT) (DOWN): ");
//        String commandes = scanner.nextLine().toUpperCase();
//
//        String[] listeCommandes = commandes.split(" ");
//
//        for (String commande : listeCommandes) {
//            switch (commande) {
//                case "UP":
//                    y += 1;
//                    break;
//
//                case "DOWN":
//                    y -= 1;
//                    break;
//
//                case "RIGHT":
//                    x += 1;
//                    break;
//
//                case "LEFT":
//                    x -= 1;
//                    break;
//
//                default:
//                    System.out.println("S'il vous plaît saisir une de ces choix (UP) (LEFT) (RIGHT) (DOWN)");
//            }
//        }
//
//        System.out.println("(" + x + " " + y + ")");
//
//        scanner.close();

//-------------------- 3. Plan de Répartition dans une Salle de Classe  ----------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez le nombre d'étudiants: ");
        int etudiants = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Donnez le nombre de bancs: ");
        int bancs = scanner.nextInt();
        scanner.nextLine();

        int max = 2;
        int compteur = 0;

        scanner.close();

    }
}