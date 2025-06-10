package wrapperornek;

public class WrapperSinifExample {
    public static void main(String[] args) {

        int sayi = 25;

        //autoboxing
        Integer wrapperSayi = sayi;

        //unboxing
        int tekrarSayi = wrapperSayi;

        System.out.println("int değeri: " + sayi);
        System.out.println("Integer (wrapper sınıf) değer: " + wrapperSayi);
        System.out.println("Tekrar int'e çevirilen değer: " + tekrarSayi);
    }
}
