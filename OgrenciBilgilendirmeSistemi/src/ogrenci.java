public class ogrenci {
    ders d1;
    ders d2;
    ders d3;
    String isim;
    String num;
    String sınıf;
    double ort;
    boolean isPass;

    ogrenci(String isim, String num, String sınıf, ders d1, ders d2, ders d3) {
        this.isim = isim;
        this.num = num;
        this.sınıf = sınıf;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        double ort;
        boolean isPass = false;
    }

    void notgir(int not1, int not2, int not3) {
        if(not1 <= 100 && not1 >= 0)
            d1.puan = not1;

        if(not2 <= 100 && not2 >= 0)
            d2.puan = not2;

        if(not3 <= 100 && not3 >= 0)
            d3.puan = not3;
    }

    void isPass() {
        System.out.println("========================");
        this.ort = (this.d1.puan + this.d2.puan + this.d3.puan) / 3.0;

        if(this.ort >= 55) {
            System.out.println("Sınıfı geçtiniz");
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
    }

    void yazdır() {
        System.out.println("İsim: " + this.isim);
        System.out.println("Numara: " + this.num);
        System.out.println("Sınıfı: " + this.sınıf);
        System.out.println(this.d1.isim + " Notu: " + this.d1.puan);
        System.out.println(this.d2.isim + " Notu: " + this.d2.puan);
        System.out.println(this.d3.isim + " Notu: " + this.d3.puan);
        System.out.println("Ortalamanız:" + this.ort);
    }

}
