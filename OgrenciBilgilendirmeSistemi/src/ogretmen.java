public class ogretmen {
    String isim;
    String bolum;

    ogretmen(String isim, String bolum) {
        this.isim = isim;
        this.bolum = bolum;
    }
    void yazdır(){
        System.out.println("İsim: " + this.isim);
        System.out.println("Bölüm: " + this.bolum);
    }
}
