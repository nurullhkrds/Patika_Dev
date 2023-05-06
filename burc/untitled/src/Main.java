import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int month,day;

        Scanner scan=new Scanner(System.in);
        System.out.print("Ay giriniz: ");
        month= scan.nextInt();
        System.out.print("Gün giriniz: ");
        day=scan.nextInt();
        if (month==1){
            if (day>=1 && day<=31){
                if (day<21){
                    System.out.println("Oğlak");
                }
                else
                    System.out.println("Kova");

            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==2) {
            if (day >= 1 && day <= 28) {
                if (day < 19) {
                    System.out.println("Kova");
                } else
                    System.out.println("Balık");

            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==3) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    System.out.println("balık");
                } else
                    System.out.println("koç");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");

        } else if (month==4) {
            if (day >= 1 && day <= 30) {
                if (day < 20) {
                    System.out.println("koç");
                } else
                    System.out.println("boğa");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");

        } else if (month==5) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("boğa");
                } else
                    System.out.println("ikizler");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");

        } else if (month==6) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    System.out.println("ikizler");
                } else
                    System.out.println("yengeç");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");

        } else if (month==7) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("yengeç");
                } else
                    System.out.println("Aslan");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==8) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("aslan");
                } else
                    System.out.println("başak");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==9) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("başak");
                } else
                    System.out.println("Terazi");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==10) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Terazi");
                } else
                    System.out.println("Akrep");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==11) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Akrep");
                } else
                    System.out.println("Yay");
            }

            else
                System.out.println("Geçersiz Gün girdiniz!");
        } else if (month==12) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("yay");
                } else
                    System.out.println("oğlak");
            }
            else
                System.out.println("Geçersiz Gün girdiniz!");
        }
        else
            System.out.println("Geçersiz Bir Ay girdiniz");
    }
}