public class Main {
    public static void main(String[] args) {
        int dizi[][] = new int[3][4];
        int sayi = 1;

        for(int i = 0; i < dizi.length; i++) {
            for(int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = sayi++;
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}