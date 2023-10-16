package Lab2;

import java.util.Scanner;

public class Zadanie2 {

    public String quadratic_equation(){

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Podaj wartosci a,b,c");

        double a = scanner.nextDouble();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

      double delta= Math.pow(b,2) - 4 * a * c;
      if (delta<0){
          return "Rownanie nie ma rozwiazan";
      }
      if (delta==0){
          double x = -(b/ 2*a) ;
          return "x=" + x;
      }
      else{
          double x1=(-b - Math.sqrt(delta)) / 2 * a ;
          double x2=(-b + Math.sqrt(delta)) / 2 * a;
          return "x1=" + x1 + " , x2=" + x2;
      }
    }
}