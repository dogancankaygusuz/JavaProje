public class Main {
    public static void main(String[] args) {
        ogretmen o1 = new ogretmen("Ali", "Matematik");
        ogretmen o2 = new ogretmen("Murat", "Kimya");
        ogretmen o3 = new ogretmen("Nazlı","Fizik");

        ders matematik = new ders("Matematik", "MAT", o1);
        ders kimya = new ders("Kimya", "KMY", o2);
        ders fizik = new ders("Fizik", "FZK",o3);

        ogrenci ogrenci1 = new ogrenci("Buse", "123", "3", matematik, kimya, fizik);
        ogrenci1.notgir(60, 54, 80);
        ogrenci1.isPass();
        ogrenci1.yazdır();

        ogrenci ogrenci2 = new ogrenci("Kaan", "343", "2", matematik, kimya, fizik);
        ogrenci2.notgir(60, 40, 52);
        ogrenci2.isPass();
        ogrenci2.yazdır();

        System.out.println("\t");
        System.out.println("Öğretmen Listesi:");
        o1.yazdır();
        System.out.println("\t");
        o2.yazdır();
        System.out.println("\t");
        o3.yazdır();
    }
}