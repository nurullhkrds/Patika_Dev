import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int us;
        us=scan.nextInt();
        for (int i=1;i<=us;i*=4){
            System.out.println("4'ün katları :"+i);
        }
        for (int i=1;i<=us;i*=5){
            System.out.println("5'in katları :"+i);
        }


    }
}