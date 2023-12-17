package Lab5;

import java.util.ArrayList;

public class AutoKomis {

    ArrayList<Zadanie1Samochod> listaSamochodow = new ArrayList<Zadanie1Samochod>();

    public AutoKomis() {
        listaSamochodow.add(new Zadanie1Samochod("Toyota", "Camry", 2000, "Sedan", "Diesel", 2021, 11, 18, 25000));
        listaSamochodow.add(new Zadanie1Samochod("Alfa Romeo", "147", 1900, "Coupe", "Spalinowy", 2006, 2, 1, 10000));
        listaSamochodow.add(new Zadanie1Samochod("Ford", "Focus", 1600, "Hatchback", "Benzyna", 2019, 5, 10, 20000));
        listaSamochodow.add(new Zadanie1Samochod("Volkswagen", "Golf", 1800, "Hatchback", "Diesel", 2018, 8, 22, 18000));
        listaSamochodow.add(new Zadanie1Samochod("Honda", "Civic", 2000, "Sedan", "Benzyna", 2020, 3, 15, 22000));
        listaSamochodow.add(new Zadanie1Samochod("BMW", "3 Series", 2500, "Sedan", "Benzyna", 2017, 11, 5, 30000));
        listaSamochodow.add(new Zadanie1Samochod("Mercedes-Benz", "CLA", 2200, "Coupe", "Diesel", 2015, 7, 12, 28000));
        listaSamochodow.add(new Zadanie1Samochod("Audi", "A4", 2000, "Sedan", "Hybryda", 2022, 4, 30, 35000));
        listaSamochodow.add(new Zadanie1Samochod("Nissan", "Altima", 1800, "Sedan", "Benzyna", 2016, 9, 8, 15000));
        listaSamochodow.add(new Zadanie1Samochod("Kia", "Seltos", 1600, "SUV", "Benzyna", 2023, 2, 10, 28000));
    }
    public static void main(String[] args){

        AutoKomis autoKomis = new AutoKomis();

        autoKomis.listaSamochodow.forEach(samochod -> {System.out.println(samochod.toString() + "\n"); samochod.gwarancja();
            System.out.println("-------------------------------------------");});

    }
}
