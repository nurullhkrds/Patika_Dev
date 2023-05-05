import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double kmPrice=2.20,total;
        int starPrice=10, km;
        km=scan.nextInt();
        total=km*kmPrice+starPrice;

        double paymendAmmount=  (total<20) ? 20:  total;


        System.out.printf("Ödenecek Tutar: "+ paymendAmmount);

    }
}