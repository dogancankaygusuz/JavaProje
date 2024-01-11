import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String isim,sifre;
        int a=3;
        int bakiye=1500;
        int sec;
        Scanner input = new Scanner(System.in);

        while(a>0){
            System.out.println("Kullanıcı adınız:");
            isim = input.nextLine();
            System.out.println("Şifreniz:");
            sifre = input.nextLine();

            if(isim.equals("java") && sifre.equals("2468")){
                System.out.println("Hosgeldiniz");
                do{
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap\n");
                    System.out.println("Yapmak istediğiniz işlemi seçin:");
                    sec = input.nextInt();
                    if(sec == 1) {
                        System.out.println("Yatırmak istediğiniz tutarı girin:");
                        int x = input.nextInt();
                        bakiye += x;
                        System.out.println("Bakiyeniz: " + bakiye);
                    }
                    else if(sec == 2) {
                        System.out.println("Çekmek istediğiniz tutarı girin:");
                        int x = input.nextInt();
                        if(x > bakiye)
                            System.out.println("Yetersiz bakiye");
                        else if(x <= bakiye) {
                            bakiye -= x;
                            System.out.println("Kalan bakiyeniz:" + bakiye);
                        }
                    }
                    else if(sec == 3) {
                        System.out.println("Bakiyeniz: " + bakiye);
                    }
                }while(sec !=4);
                System.out.println("Görüşmek üzere");
                break;
            }
            else{
                System.out.println("Hatalı isim veya şifre tekrar deneyiniz.");
                System.out.println("Kalan Hakkınız:" + --a);
                if(a==0)
                    System.out.println("Hesabınız bloke olmuştur.");
            }
        }
    }
    }