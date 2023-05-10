import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int number= random.nextInt(100);
        int hak=5, select,sayac=0;
        boolean isWrong=false;
        int wrongDizi []=new int[hak];
        boolean isWin=false;
        System.out.println(number);


        while(hak>0){
            System.out.print("Sayı tahmini yapınız: ");
            select=scan.nextInt();

            if (select<0 || select>100){
                System.out.println("Tahmnininiz 0-100 arasında olmalıdır !.");
                if (isWrong){
                    hak--;
                    System.out.println("birden fazla geçersiz giriş yaptınız! "+hak);
                }
                else {
                    isWrong=true;
                    System.out.println("Geçersiz giriş!");
                }

            }
            else {
                if (select==number){
                    isWin=true;
                    break;
                } else if (select<number) {
                    wrongDizi[sayac]=select;
                    hak--;
                    sayac++;
                    System.out.println("Yanlış tahmin ! Tahmnininiz: "+select+" sayıdan küçük !"+
                            "\n Kalan Hak: "+ hak);
                } else if (select>number) {
                    wrongDizi[sayac]=select;
                    hak--;
                    sayac++;
                    System.out.println("Yanlış Tahmin ! Tahhmininiz: "+select+" sayıdan büyük ! "+
                            "\n Kalan Hak: "+hak);
                }
            }


        }

        if (isWin){
            System.out.println("Tebrikler ! Doğru Tahmin" );

        }
        else {
            System.out.println("Kaybettiniz !");
            if (!isWrong){
                System.out.println("Hatalarınız: "+ Arrays.toString(wrongDizi));
            }
        }



    }
}