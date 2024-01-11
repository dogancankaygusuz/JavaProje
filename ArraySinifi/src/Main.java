import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int dizi[] = {1, 2, 3, 4, 5, 6, 7};
        String dizi1[] = {"java", "array", "class"};
        int arr[] = {6, 54, 32, -265, 221, 39, -1};

        System.out.println(Arrays.toString(dizi)); // diziyi ekrana yazar
        System.out.println(Arrays.toString(dizi1));

        Arrays.fill(dizi, 8); //dizideki tüm değerleri 8 yapar
        System.out.println(Arrays.toString(dizi));

        Arrays.fill(dizi, 2, 5, 9); // 2den 5. indekse kadar degerleri 9 yapar
        System.out.println(Arrays.toString(dizi));

        Arrays.sort(arr); // kucukten buyuge sıralar
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 39)); // aradıgımız degerin indexini buluyor

        int kopya[] = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(kopya));

        int kopya1[] = Arrays.copyOf(dizi, dizi.length);
        System.out.println(Arrays.toString(kopya1));

        int kopya2[] = Arrays.copyOfRange(kopya1, 2, 5);
        System.out.println(Arrays.toString(kopya2));

        System.out.println(Arrays.equals(kopya1, kopya)); // 2 dizinin eşitliğini kontrol eder

        int kopya3[] = {9, 9, 9};
        System.out.println(Arrays.equals(kopya2, kopya3));
    }
}