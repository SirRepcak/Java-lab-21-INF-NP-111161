package Lab2;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki: ");
        int h = scanner.nextInt();
        int s;

        for(int i=1,k=0;i<=h;i++,k=0){
            for(s=1;s<=h-i;s++){
                System.out.print(" ");
        }
            while(k!=2*i-1) {
                System.out.print("*");
                k++;
            }
            System.out.println("");

    }
}}
