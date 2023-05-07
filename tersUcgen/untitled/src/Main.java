import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int basamak;
        basamak=scan.nextInt();
        for (int i=0;i<=basamak;i++){
            for (int j=0;j<i-j;j++){
                System.out.print(" ");
            }
            System.out.println( );
            for (int k=basamak;k>i;k--){
                System.out.print("*");
            }
        }
    }
}


