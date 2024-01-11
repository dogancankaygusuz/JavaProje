public class ders {
    ogretmen ogretmen1;
    String isim;
    String kod;
    String önek;
    int puan;

    ders(String isim, String kod, ogretmen ogretmen1){
        this.isim = isim;
        this.kod = kod;
        this.ogretmen1 = ogretmen1;
        int puan = 0;
    }
    void yaz() {
        this.ogretmen1.yazdır();
    }
}
