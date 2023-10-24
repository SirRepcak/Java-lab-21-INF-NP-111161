package Lab3;

import java.util.Random;
import java.util.Scanner;


public class Zadanie3 {

    public void guessGame(){

    Random random  =new Random();
    Scanner scanner = new Scanner(System.in);

    int randomValue = random.nextInt(201);

    System.out.println("Zgadnij Liczbe z zakresu 1-200 :");

        //System.out.println(randomValue);

    while (true){

        int givenValue = scanner.nextInt();

            if(randomValue == givenValue){
            System.out.println("Gratulacje odgadles liczbe!!");
            break;
            }

            else if (givenValue < 1 || givenValue > 200) {
                System.out.println("Podano za duza liczbe.");
            }

            else if(givenValue < randomValue){
                System.out.println("Odgadywana liczba jest większa.");
            }
            else {
                System.out.println("Odgadywana liczba jest mniejsza");
            }
        }
}}
