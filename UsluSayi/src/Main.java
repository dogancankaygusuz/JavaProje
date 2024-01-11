import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tabanı girin: ");
        int taban = input.nextInt();

        System.out.println("Üssü girin: ");
        int us = input.nextInt();

        int sonuc = 1;

        for(int i = 0; i < us ; i++) {
            sonuc *= taban;
        }

        System.out.println("Taban: " + taban + "\t" + "Üs: " + us);
        System.out.println("Sonuc: " + sonuc);
    }
}