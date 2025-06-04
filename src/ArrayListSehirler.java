import java.util.ArrayList;

public class ArrayListSehirler {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("Bursa");
        sehirler.add("Erzurum");
        sehirler.add("Antalya");

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
    }
}
