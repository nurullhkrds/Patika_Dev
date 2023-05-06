import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");

            }

        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("b<a<c");

            }
            else
                System.out.println("b<c<a");


        }
        else {
            if (a<b){
                System.out.println("c<a<b");

            }
            else
                System.out.println("c<b<a");


        }


    }
}