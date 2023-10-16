package Lab2;

import java.util.Scanner;

public class Zadanie3 {

    public double converter(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość w km/h: ");

        double mph  = scanner.nextDouble();

        double kph = mph * 1.609344;
        return kph;
    }
}
