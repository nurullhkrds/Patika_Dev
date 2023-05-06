import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select,sayi1,sayi2;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1=scan.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2=scan.nextInt();
        System.out.print("1.Topla \n 2.Çıkar \n 3.Çarp \n 4.Böl  yapılacak işlemi seçiniz : ");
        select=scan.nextInt();

        switch (select){
            case 1:
                System.out.println("işlem sonucunuz: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("işlem sonucunuz: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("işlem sonucunuz: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Sıfıra bölünme hatası !");

                }
                else
                    System.out.println("işlem sonucunuz: "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Geçersiz İşlem !");









        }


    }
}