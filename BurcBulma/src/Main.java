import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün: ");
        day = input.nextInt();

        switch(month) {
            case 1:
                if(day >=1 && day <=21)
                    System.out.println("Oğlak");
                else if (day >= 22 && day <= 31)
                    System.out.println("Kova");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 2:
                if(day >=1 && day <=19)
                    System.out.println("Kova");
                else if (day >= 20 && day <= 29)
                    System.out.println("Balık");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 3:
                if(day >=1 && day <=20)
                    System.out.println("Balık");
                else if (day >= 21 && day <= 31)
                    System.out.println("Koç");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 4:
                if(day >=1 && day <=20)
                    System.out.println("Koç");
                else if (day >= 21 && day <= 30)
                    System.out.println("Boğa");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 5:
                if(day >=1 && day <=21)
                    System.out.println("Boğa");
                else if (day >= 22 && day <= 31)
                    System.out.println("İkizler");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 6:
                if(day >=1 && day <=22)
                    System.out.println("İkizler");
                else if (day >= 23 && day <= 30)
                    System.out.println("Yengeç");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;


            case 7:
                if(day >=1 && day <=22)
                    System.out.println("Yengeç");
                else if (day >= 23 && day <= 31)
                    System.out.println("Aslan");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 8:
                if(day >=1 && day <=22)
                    System.out.println("Aslan");
                else if (day >= 23 && day <= 31)
                    System.out.println("Başak");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 9:
                if(day >=1 && day <=22)
                    System.out.println("Başak");
                else if (day >= 23 && day <= 30)
                    System.out.println("Terazi");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 10:
                if(day >=1 && day <=22)
                    System.out.println("Terazi");
                else if (day >= 23 && day <= 31)
                    System.out.println("Akrep");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 11:
                if(day >=1 && day <=21)
                    System.out.println("Akrep");
                else if (day >= 22 && day <= 30)
                    System.out.println("Yay");
                else {
                    System.out.println("Günü yanlış girdiniz");
                }
                break;

            case 12:
                if(day >=1 && day <=21)
                    System.out.println("Yay");
                else if (day >= 22 && day <= 31)
                    System.out.println("Oğlak");
                else {
                    System.out.println("Günü yanlış girdiniz12");
                }
                break;

            default:
                System.out.println("Hatali giris");
        }
    }
}