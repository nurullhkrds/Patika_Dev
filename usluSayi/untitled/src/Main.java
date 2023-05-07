import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int taban,us,sonuc=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Taban Giriniz: ");
        taban= scan.nextInt();
        System.out.println("Üs giriniz: ");
        us=scan.nextInt();

        for(int i=1;i<=us;i++){
            sonuc=taban*sonuc;
        }
        System.out.println(sonuc);

    }
}