package Lab3;

import java.util.Scanner;

public class Zadanie2 {

    public void divisors(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");

        int value = scanner.nextInt();

        System.out.println("Dzielniki podanej liczby to: ");

        for(int i=1;i<=value;i++){

            if (value % i == 0){

                    System.out.print(i + ", ");

            }
        }

    }
}
