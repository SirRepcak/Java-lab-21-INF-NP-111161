package Lab3;

import java.util.Scanner;

public class Zadanie1 {

    public void evenToOddComparison(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe całkowita: ");
        int value = scanner.nextInt();

        scanner.close();

        int[] even = new int[value+1];
        int[] odd  = new int[value+1];
        int eCount=0, oCount=0;

        for(int i=0;i<=value;i++){
            if (i % 2 == 0) {
                even[eCount]=i;
                eCount++;
                //System.out.println("przypisano "+i+" do parzystych, na pozycji "+(eCount-1));
            }
            else{
                odd[oCount] = i;
                oCount++;
                //System.out.println("przypisano "+i+" do nieparzystych, na pozycji "+(oCount-1));
            }
        }

        double evenAvg = 0;
        double oddAvg = 0;

        for(int i=0;i<=eCount;i++){
            evenAvg+=even[i];
        }
        evenAvg=evenAvg/eCount;

        for(int i=0;i<=oCount;i++){
            oddAvg+=even[i];
        }
        oddAvg=oddAvg/oCount;

        System.out.println("Stosunek średniej liczb parzystych do średniej liczb nieparzystych, które zawiera liczba "+value+" wynosi");
        System.out.println(evenAvg+":"+oddAvg);
    }
}
