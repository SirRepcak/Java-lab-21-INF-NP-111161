package Lab5;

import java.time.LocalDate;

public class Zadanie1Samochod {


    public String marka;
    public String model;
    public int pojemnosc;
    public String typNadwozia;
    public String typSilnika;
    public LocalDate pierwszaRejestracja;
    public int cena;

    public Zadanie1Samochod(String marka, String model, int pojemnosc, String typNadwozia, String typSilnika, LocalDate pierwszaRejestracja, int cena) {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.typNadwozia = typNadwozia;
        this.typSilnika = typSilnika;
        this.pierwszaRejestracja = pierwszaRejestracja;
        this.cena = cena;
    }
    public Zadanie1Samochod(String marka, String model, int pojemnosc, String typNadwozia,
                            String typSilnika, int year, int month, int day, int cena) {
        this(marka, model, pojemnosc, typNadwozia, typSilnika,
                LocalDate.of(year, month, day), cena);
    }
    public void gwarancja () {
        LocalDate now = LocalDate.now();

        now = now.minusYears(2);

        int compareValue = now.compareTo(pierwszaRejestracja);

        if (compareValue <= 0){

            System.out.println("Samochod posiada gawarancje");

        }
        else{
            System.out.println("Samochod nie posiada gwarancji");

        }
    }

    @Override
    public String toString() {
        return "Marka : '" + marka + '\''+'\n' +
                "Model : '" + model + '\''+'\n' +
                "Pojemnosc : " + pojemnosc + '\''+'\n'+
                "Typ nadwozia : '" + typNadwozia + '\''+'\n' +
                "Typ silnika : '" + typSilnika + '\''+'\n' +
                "Pierwsza rejestracja : " + pierwszaRejestracja + '\''+'\n' +
                "Cena : " + cena;
    }

    public void print(){
        System.out.println("-------------------------------------");
        System.out.println("Marka samochodu: "+marka);
        System.out.println("Model samochodu: "+model);
        System.out.println("Pojemnosc samochodu: "+pojemnosc);
        System.out.println("Typ nadwozia samochodu: "+typNadwozia);
        System.out.println("Typ silnika samochodu: "+typSilnika);
        System.out.println("Pierwsza rejestracja samochodu: "+pierwszaRejestracja);
        System.out.println("Cena samochodu: "+cena);
        this.gwarancja();
        System.out.println("-------------------------------------");
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public void setPierwszaRejestracja(LocalDate pierwszaRejestracja) {
        this.pierwszaRejestracja = pierwszaRejestracja;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public LocalDate getPierwszaRejestracja() {
        return pierwszaRejestracja;
    }

    public int getCena() {
        return cena;
    }
}
