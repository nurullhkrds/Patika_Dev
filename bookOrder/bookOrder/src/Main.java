import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books=new TreeSet<>();
        books.add(new Book("Arabam", 568, "Vegas black", 2008));
        books.add(new Book("Zafere doğru", 354, "Vegas black",1998));
        books.add(new Book("Abraham Lincoln", 11, "Vegas black",1995));
        books.add(new Book("Malatya kayısısı", 1345, "Vegas black",2001));
        books.add(new Book("Bolu sefaları", 200, "Vegas black", 2000));



        for (Book b:books){
            System.out.println(b.getKitapAdi());
        }







    }
}