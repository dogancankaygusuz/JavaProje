public class Main {
    public static void main(String[] args) {

        String str = "dogancan";
        String str1 = "doGAnCan";

        System.out.println(str.charAt(6));                                // indexteki değeri yazar
        System.out.println(str.codePointAt(3));                     // indexteki değerin ascii tablodaki değerini verir
        System.out.println(str.compareTo(str1));                          // 2 stringi karşılaştırır büyük küçük harfe bakar
        System.out.println(str.compareToIgnoreCase(str1));                // 2 stringi karşılaştırır büyük küçük harfe bkmz
        System.out.println(str.concat("123"));                        // stringin sonuna 123 ekler
        System.out.println(str.contains("anc"));                          // stringte girilen değer var mı yok mu
        System.out.println(str.endsWith("an"));                           // string girilen değerle bitmiş mi
        System.out.println(str.equals(str1));                             // eşit mi değil mi
        System.out.println(str.equalsIgnoreCase(str1));                   // eşit mi değil mi büyük küçük harfe bakmaz
        System.out.println(str.indexOf("g"));                             // girilen harfin indexini verir
        System.out.println(str.isEmpty());                                // string boş mu değil mi
        System.out.println(str.lastIndexOf("n"));                     // girilem harfin en son hangi indexte
        System.out.println(str.replace("a", "k"));        // a ları k yapar
        System.out.println(str.replaceFirst("g", "f"));   // ilk g yi f yapar
        System.out.println(str.startsWith("do"));                         // do ile başladıgını kontrol eder
        System.out.println(str.substring(4));                    // 4 dahil o indexten sonrasını yazar
        System.out.println(str1.toLowerCase());                           // stringteki harfleri küçük yazar
        System.out.println(str.toUpperCase());                            // stringteki harfleri büyük yazar
        System.out.println(str.trim());                                   // stringteki boşluk varsa boşluksuz yapar

    }
}