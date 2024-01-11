public class Main {
    public static int fibo(int i) {

        if(i==1 || i==2) {
            return 1;
        }

        return fibo(i - 1) + fibo( i - 2);
    }
    public static void main(String[] args) {

        System.out.println(fibo(3));
        System.out.println(fibo(5));
        System.out.println(fibo(7));
    }
}