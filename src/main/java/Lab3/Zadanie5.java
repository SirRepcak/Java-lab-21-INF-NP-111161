package Lab3;

import java.util.Scanner;

public class Zadanie5 {

    public void powers() {

        final int POW_BASE = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość wykładnika: ");
        int number = scanner.nextInt();

        System.out.println("Watości potęg to: ");

        for(int i=0;i<number;i++){

            System.out.print("3^"+i+"="+Math.pow(POW_BASE,i)+",  ");
        }

    }
}
