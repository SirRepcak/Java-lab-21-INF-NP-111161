package Lab2;

import java.util.Scanner;

public class Zadanie5 {

    public double calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj znak operacji (+, -, /, *, %): ");
        char symbol = scanner.next().charAt(0);

        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        scanner.close();

        double result = 0.0;
        switch (symbol){
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '/':
                if(b!=0)
                {result=a/b;}
                else
                {System.out.println("Nie można dzielić przez 0");}
                break;
            case '*':
                result=a*b;
                break;
            case '%':
                if(b!=0) {
                    result = a % b;
                }else {
                    System.out.println("Nie można dzielić przez 0");}
                break;
        }

        return result;
        }
    }

