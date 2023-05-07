import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean isPalindrom(int sayi){
        int temp=sayi,sonRakam,yeniDeger=0;

        while(temp!=0){
            sonRakam=temp%10;
            yeniDeger=(yeniDeger*10)+sonRakam;
            temp=temp/10;

        }
        if (sayi==yeniDeger){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(95));





    }
}