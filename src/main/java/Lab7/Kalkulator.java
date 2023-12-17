package Lab7;

import java.util.Scanner;

public class Kalkulator {

    private double liczba1;
    private double liczba2;
    private double liczba3;
    private double liczba4;
    private double liczba5;
    private double liczba6;
    private double liczba7;

    public Kalkulator (double liczba1){
        this.liczba1 = liczba1;
    }
    public Kalkulator (double liczba1, double liczba2,
                       double liczba3, double liczba4){
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
        this.liczba4 = liczba4;
    }

    public Kalkulator (double liczba1, double liczba2,
                       double liczba3, double liczba4,
                       double liczba5, double liczba6,
                       double liczba7){
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
        this.liczba4 = liczba4;
        this.liczba5 = liczba5;
        this.liczba6 = liczba6;
        this.liczba7 = liczba7;
    }

    public Kalkulator (Kalkulator kalkulator){

        this.liczba1=kalkulator.liczba1;
        this.liczba2=kalkulator.liczba2;
        this.liczba3=kalkulator.liczba3;
        this.liczba4=kalkulator.liczba4;
        this.liczba5=kalkulator.liczba5;
        this.liczba6=kalkulator.liczba6;
        this.liczba7=kalkulator.liczba7;
    }
}

