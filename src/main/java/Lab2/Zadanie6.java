package Lab2;

import java.util.Scanner;

public class Zadanie6 {

    static double installmentCalculator() {

        Scanner scanner = new Scanner(System.in);

        double value;
        double ownCapital;
        int installmentNumber;

        do {
            System.out.println("Podaj wartość samochodu: ");
            value = scanner.nextDouble();

            if (value > 300000) {
                System.out.println("Maksymalna wartość samochodu to 300 tyś.");
            }
        } while (value > 300000);

        do {
            System.out.println("Podaj ilość rat leasingu: ");
            installmentNumber = scanner.nextInt();

            if (installmentNumber > 96) {
                System.out.println("Maksymalna ilość rat to 96.");
            }
        } while (installmentNumber > 96);

        System.out.println("Podaj wysokość wkładu własnego");
        ownCapital = scanner.nextDouble();
        value -= ownCapital;

        if (installmentNumber <= 24) {
            value = value * 1.02;

        } else if (installmentNumber <= 48) {
            value = value * 1.03;

        } else if (installmentNumber <= 60) {
            value = value * 1.04;

        }else if  (installmentNumber <= 72) {
            value = value * 1.05;

        }else {
            value = value * 1.06;

        }

        value = value/installmentNumber;
        return value;
        }
    }
