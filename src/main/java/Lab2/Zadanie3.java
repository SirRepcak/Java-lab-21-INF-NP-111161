package Lab2;

import java.util.Scanner;

public class Zadanie3 {

    public double converter(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość w mil/h: ");

        double mph  = scanner.nextDouble();

        scanner.close();

        return mph * 1.609344;
    }
}
