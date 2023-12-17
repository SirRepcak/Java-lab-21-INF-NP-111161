package Lab3;

import java.util.Scanner;

public class Zadanie1 {

    public void evenToOddComparison(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe całkowita: ");
        int value = scanner.nextInt();

        scanner.close();

        int[] cyfry = new int[String.valueOf(value).length()];

        for (int i = cyfry.length -1 ; i >=0; i--){

            cyfry[i] = value % 10;

            value/=10;
        }


        int[] even = new int[cyfry.length];
        int[] odd  = new int[cyfry.length];
        int eCount=0, oCount=0;

        for(int i= cyfry.length -1 ;i >= 0 ;i--){
            if (cyfry[i] % 2 == 0 && cyfry[i]!=0) {
                even[eCount]=cyfry[i];
                eCount++;
                //System.out.println("przypisano "+i+" do parzystych, na pozycji "+(eCount-1));
            }
            else if (cyfry[i] % 2 != 0){
                odd[oCount] = cyfry[i];
                oCount++;
                //System.out.println("przypisano "+i+" do nieparzystych, na pozycji "+(oCount-1));
            }
        }

        double evenSum = 0;
        double oddSum = 0;

        for (int i = 0; i < eCount; i++) {
            evenSum += even[i];
        }

        for (int i = 0; i < oCount; i++) {
            oddSum += odd[i];
        }

        double evenAvg = (eCount > 0) ? evenSum / eCount : 0;
        double oddAvg = (oCount > 0) ? oddSum / oCount : 0;

        System.out.println("Stosunek średniej liczb parzystych do średniej liczb nieparzystych, które zawiera liczba "+value+" wynosi");
        System.out.println(evenAvg+":"+oddAvg);
    }
}
