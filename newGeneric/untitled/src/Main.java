import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<Integer>();
        System.out.println("Dizideki eleman sayısı: "+list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("Dizinin kapasitesi: "+list.getCapacity());
        System.out.println("Dizideki eleman sayısı: "+list.size());
        System.out.println("2.indisteki değer: "+list.get(2));
        System.out.println("4.indeksteki silinen sayi : "+ list.remove(4));
        System.out.println("4.indisteki değer: "+list.get(4));
        System.out.println("2.indisteki değeri 88 ile değiştir: "+list.set(2,88));
        System.out.println("2.indisteki yeni değer: "+list.get(2));
        list.print();
        System.out.println("60 değerinin indeksi: "+list.indexOf(50));

        MyList<Integer> altListem = list.subList(3, 6);
        altListem.print();
        System.out.println("Listemde 20 değeri : " + list.contains(-10));
        list.clear();
        list.print();

























    }
}