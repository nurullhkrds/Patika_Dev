import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner scan=new Scanner(System.in);
        heat=scan.nextInt();
        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
                
        } else if (heat<15) {
            System.out.println("Sinemaya gidebilirsiniz ");

        } else if (heat<25) {
            System.out.println("Piknik Yapabilirsiniz");

        }
        else
            System.out.println("yüzmeye gidebilirsiniz..");


    }
}