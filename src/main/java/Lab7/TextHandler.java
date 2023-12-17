package Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextHandler {

    private String text;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextHandler(String text, String path) {
        this.path = path;
        this.text = text;
    }

    public String extension() {
        String type = "";
        int dotIndex = this.path.lastIndexOf('.');
        if (dotIndex > 0) {
            type = path.substring(dotIndex + 1);
        }
        return type;
    }

    public void convert() {
        this.text = text.replace(",", "\",\"");
        this.text = text.replace(" ", ",");
    }

    public void generate() {


        File file = new File(this.path);
        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(this.path);
                if ("csv".equals(extension())) {
                    convert();
                    writer.write(text);
                    writer.close();
                } else {
                    writer.write(text);
                    writer.close();
                }
                System.out.println("Stworzono plik " + file.getName());
            } else {
                System.out.println("Plik juz istnieje");
            }
        } catch (IOException e) {
            System.out.println("Wystapil blad");
            e.printStackTrace();
        }
    }

    public void read() {
        File file = new File(this.path);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Wystapil blad");
            e.printStackTrace();
        }
    }
}