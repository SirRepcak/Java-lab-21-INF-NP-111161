package Lab2;

import java.util.Scanner;

public class Zadanie4 {

    static String comparision_site(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile liczb chcesz podać: ");

        int x_num = scanner.nextInt();

        System.out.println("Teraz podaj wartości liczb (potwierdzajac kazda enterem): ");

        int[] x = new int[x_num];

        for (int i=0; i < x_num ;i++){
            x[i]= scanner.nextInt();
        }

        int max_num = x[0];

        int min_num = x[0];

        double avg=0;

        for(int i=0; i < x_num; i++){
            if (max_num < x[i]){
                max_num = x[i];
            }
            if (min_num > x[i]){
                min_num = x[i];
            }
            avg += x[i];
        }
        avg=avg/x_num;

        return ("Liczb jest : "          +x_num  +"\n"+
                "Największa liczba to : "+max_num+"\n"+
                "Najmniesza liczba to : "+min_num+"\n"+
                "średnia liczb to : "    +avg);
    }
}
