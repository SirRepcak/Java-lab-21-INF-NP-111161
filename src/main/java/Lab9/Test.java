package Lab9;

import java.util.Scanner;

public class Test {

     static StudentInstytut s1 = new StudentInstytut();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Imie");
        s1.ustawImie(scanner.nextLine());

        System.out.println("Podaj Nazwisko");
        s1.ustawNazwisko(scanner.nextLine());

        System.out.println("Podaj Indeks");
        s1.ustawIndeks(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Podaj Wydzial");
        s1.ustawWydzial(scanner.nextLine());

        System.out.println("Podaj Instytut");
        s1.ustawInstytut(scanner.nextLine());

        System.out.println(s1.imie);
        System.out.println(s1.nazwisko);
        System.out.println(s1.indeks);
        System.out.println(s1.wydzial);
        System.out.println(s1.instytut);
    }
}
