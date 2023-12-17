package Lab7;

public class MainLab7 {

    public static String data = "Maria Nowak Kraków Rynek\n" +
            "Adam Wiśniewski Gdańsk Długa\n" +
            "Anna Lewandowska Poznań Mickiewicza\n" +
            "Piotr Szymański Wrocław Świdnicka\n" +
            "Katarzyna Kowalczyk Katowice Armii_Krajowej";
    public static String path = "D:\\Studia-java\\test.csv";
    public static void main(String[] args) {

        TextHandler test= new TextHandler(data,path);
        test.generate();
        //test.read();
    }
}
