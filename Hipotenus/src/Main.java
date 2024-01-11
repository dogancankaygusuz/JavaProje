import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("2 kenar uzunlugunu girin: ");
        a = input.nextDouble();
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " + c);
    }
}