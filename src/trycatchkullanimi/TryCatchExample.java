package trycatchkullanimi;

import java.util.Scanner;

public class TryCatchExample {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Birinci sayıyı girin: ");
            int sayi1 = input.nextInt();

            System.out.print("İkinci sayıyı girin: ");
            int sayi2 = input.nextInt();

            int sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);

        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayı sıfıra bölünemez!");
        }
        input.close();
    }
}

