public class Main {
    public static void main(String[] args) {

        int dizi[] = {23, -2, 22, 12, 78, -32, 97, -139, 0, 59};

        int max = dizi[0];
        int min = dizi[0];

        for(int i : dizi) {
            if(i < min)
                min = i;

            if(i > max)
                max = i;
        }

        System.out.println("Dizideki max değer: " + max);
        System.out.println("Dizideki min değer: " + min);
    }
}