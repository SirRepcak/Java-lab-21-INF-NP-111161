package Lab3;

import java.util.Scanner;
import java.lang.Math;
public class Zadanie5 {

    public void powers() {

        final int POW_BASE = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj maksymalną wartość potegi: ");
        int number = scanner.nextInt();

        System.out.println("Watości potęg to: ");

        double i =0 ;
        int n = 0;
        while(i <= number){
            n++;
            i = i + Math.pow(POW_BASE,n);
            System.out.print("3^"+n+"="+Math.pow(POW_BASE,n)+",  ");
        }

    }
}
