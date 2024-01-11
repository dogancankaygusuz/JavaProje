import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Faktöriyeli hesaplanacak sayiyi girin:");
        n = input.nextInt();

        int cevap = 1;
        for(int i=1; i<=n; i++) {
            cevap = cevap * i;
        }
        System.out.println(cevap);
    }
}