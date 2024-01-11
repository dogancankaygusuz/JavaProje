import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rndm = new Random();
        int sayi = rndm.nextInt(100);

        Scanner input = new Scanner(System.in);

        int hak = 0;
        int x;
        int hata[] = new int[5];

        while(hak < 5) {
            System.out.println("Tahmininizi girin: ");
            x = input.nextInt();

            if(x < 0 || x > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz.");
                continue;
            }

            if(x == sayi) {
                System.out.println("Tebrikler!!! Doğru tahmin.");
                break;
            }
            else {
                System.out.println("Yanlış tahmin ettiniz.");
                if(x > sayi) {
                    System.out.println("Tahmininiz,tahmin edeceğiniz sayıdan büyük.");
                }
                else {
                    System.out.println("Tahmnininiz,tahmin edeceğiniz sayıdan küçük.");
                }
                hata[hak] = x;
                hak++;
                System.out.println("Kalan Hakkınız: " + (5-hak));
            }
        }
        if(hak==5) {
            System.out.println("Doğru tahmin edemediğiniz sayı --> " + sayi);
        }
    }
}