public class Main {
    public static void main(String[] args) {
        boksör b1 = new boksör("X", 20, 100, 90, 70);
        boksör b2 = new boksör("Y", 15, 120, 100, 80);

        maç maç1 = new maç(b1, b2, 80, 120);
        maç1.başlat();
    }
}