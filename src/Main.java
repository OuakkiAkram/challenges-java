import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        ------------------- CHALLENGE 1 --------------------------------------

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Entrez vote nom: ");
//        String nom = scanner.nextLine();
//
//        System.out.println("Bonjour, " + nom + "!");
//
//        scanner.close();

//        ------------------- CHALLENGE 2 --------------------------------------

//        Scanner scanner  = new Scanner(System.in);
//
//        System.out.println("Entrez un nombre: ");
//        int nombre = scanner.nextInt();
//        scanner.nextLine();
//
//        for(int i=1; i<=nombre; i++){
//            System.out.printf("%d ", i);
//        }
//
//        scanner.close();

//        ------------------- CHALLENGE 3 --------------------------------------

//        Random random = new Random();
//        int number = random.nextInt(1, 11); // generate number between 1, 10
//
//        for(int i=1; i<=number; i++){
//            System.out.printf("%d ", i);
//        }

        //        ------------------- CHALLENGE 3 --------------------------------------

//        Scanner scanner  = new Scanner(System.in);
//        Random random = new Random();
//
//        int randomNumber = random.nextInt(1, 11);
//        int nombre = 0;
//
//        while(nombre != randomNumber){
//            System.out.println("Entrez un nombre entre 1 et 10: ");
//            nombre = scanner.nextInt();
//
//             if(nombre<randomNumber){
//                 System.out.println("Trop petit ! Essayez encore. \n");
//             }else if(nombre>randomNumber){
//                 System.out.println("Trop grand! essayez encore. \n");
//             }else{
//                 System.out.println("Bravo ! Vous avez trouvé.");
//             }
//        }
//        scanner.close();

//        ------------------- CHALLENGE 4 --------------------------------------

//        int solde = 4000;
//        Scanner scanner  = new Scanner(System.in);
//
//        while(true){
//
//            System.out.println("1. Consulter le solde");
//            System.out.println("2. Dépôt");
//            System.out.println("3. Retrait");
//            System.out.println("4. Quitter");
//
//            System.out.print("Entrez votre choix: ");
//            int choix = scanner.nextInt();
//            scanner.nextLine();
//
//            int montant = 0;
//
//            switch(choix){
//                case 1:
//                    System.out.println("Solde: " + solde);
//                    break;
//
//                case 2:
//                    System.out.print("Entrez le montant: ");
//                    montant = scanner.nextInt();
//                    solde = solde + montant;
//                    break;
//
//                case 3:
//                    System.out.print("Entrez le montant: ");
//                    montant = scanner.nextInt();
//                    solde = solde - montant;
//                    break;
//
//                case 4:
//                    System.out.println("Vous avez Quitter le programme.");
//                    break;
//
//                default:
//                    System.out.println("Veuillez saisir un nombre entre 1-4 !");
//            }
//
//            if(choix == 4){
//                break;
//            }
//        }
//
//        scanner.close();

//        ------------------- CHALLENGE 5 --------------------------------------

//        int[] numbers = {4, 2, 8, 10, 24};
//        Arrays.sort(numbers);
//        int secondMax = numbers[numbers.length-2];
//
//        System.out.println(secondMax);

//        ------------------- CHALLENGE 6 --------------------------------------

//        int[] numbers = {1, 2, 3, 4, 5};
//        int lastElement = numbers[numbers.length - 1];
//
//        for(int i = numbers.length - 1; i>=0; i--){
//            if(i != 0){
//                numbers[i] = numbers[i-1];
//            }
//        }
//        numbers[0] = lastElement;
//
//        for(int i=0; i<numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }

//        ------------------- CHALLENGE 7 --------------------------------------

        int[] numbers = {2, 3, 2, 5, 3};
        HashMap<Integer, Integer> objectOfNumbers = new HashMap<>();

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (objectOfNumbers.containsKey(numbers[i])) {
                objectOfNumbers.put(numbers[i], counter++);
            }else{
                objectOfNumbers.put(numbers[i], 0);
            }
        }

        System.out.println(objectOfNumbers);
    }
}