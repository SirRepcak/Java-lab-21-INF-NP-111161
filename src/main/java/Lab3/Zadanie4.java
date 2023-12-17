package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie4 {

    public void countTillFive(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawaj liczby kazda akceptujac enterem: ");

        ArrayList<Double> values = new ArrayList<>();
        double input;
        int i=0;

        while(true){

            input= scanner.nextDouble();

            if(input == 5){
                break;
            }

            values.add(input);
        }

        double result = 1.0;

        for (Double value : values){
            result=result*value;
        }
        System.out.println("iloczyn wprowadzonych liczby: "+result);


    }

}
