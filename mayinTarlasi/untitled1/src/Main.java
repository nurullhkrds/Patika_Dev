import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın tarlasına hoş geldiniz!");

        System.out.print("Satır sayısı seçiniz: ");
        int rows= scan.nextInt();

        System.out.print("Sutün sayısı seçiniz: ");
        int columns= scan.nextInt();

        Mine mineSweeper = new Mine(rows,columns);

    }

}