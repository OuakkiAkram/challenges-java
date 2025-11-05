import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

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

//        int[] numbers = {2, 3, 2, 5, 3};
//        HashMap<Integer, Integer> objectOfNumbers = new HashMap<>();
//
//        int counter = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            int key = numbers[i];
//            if (objectOfNumbers.containsKey(key)) {
//                objectOfNumbers.put(key, objectOfNumbers.get(key)+1);
//            }else{
//                objectOfNumbers.put(key, 1);
//            }
//        }
//
//        System.out.println(objectOfNumbers);

//        ------------------- CHALLENGE 8 --------------------------------------

//        int[] numbers= {2, 6, 1, 4, 5};
//        int cible = 6;
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers.length; j++){
//                int result = numbers[i] + numbers[j];
//                if(result == cible){
//                    System.out.printf("%d + %d = %d\n",  numbers[i], numbers[j], result);
//                }
//            }
//        }

//        ------------------- CHALLENGE 9 --------------------------------------

//        int[] numbers1 = {1, 2, 3, 4};
//        int[] numbers2 = {3, 4, 5, 6};
//        List<Integer> commonElements = new ArrayList<>();
//
//        HashSet<Integer> setNumbers1 = new HashSet<>();
//        HashSet<Integer> setNumbers2 = new HashSet<>();
//
//        for (int i = 0; i < numbers1.length; i++) {
//            setNumbers1.add(numbers1[i]);
//        }
//
//        for (int i = 0; i < numbers2.length; i++) {
//            setNumbers2.add(numbers2[i]);
//        }
//
//        for (int number1 : setNumbers1) {
//            for (int number2 : setNumbers2) {
//                if (number1 == number2) {
//                    commonElements.add(number1);
//                }
//            }
//        }
//
//        System.out.println(setNumbers1);
//        System.out.println(setNumbers2);
//        System.out.println(commonElements);

//        ------------------- CHALLENGE 10 --------------------------------------

//        String phrase = "Le chat et le chien et le chat";
//        phrase = phrase.toLowerCase();
//
//        HashMap<String, Integer> object = new HashMap<>();
//
//        String[] words = phrase.split(" ");
//
//        for (String word : words) {
//            if (object.containsKey(word)) {
//                object.put(word, object.get(word) + 1);
//            } else {
//                object.put(word, 1);
//            }
//        }
//
//        int max = 0;
//        String wordFrequent = "";
//        for (String word : object.keySet()) {
//            if (object.get(word) > max) {
//                max = object.get(word);
//                wordFrequent = word;
//            }
//        }
//        System.out.println("Mot le plus frequent: " + wordFrequent);

//        ------------------- CHALLENGE 11 --------------------------------------

//        int[] numbers = {1, 3, 5, 2, 2};
//
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println(sum);

    }
}