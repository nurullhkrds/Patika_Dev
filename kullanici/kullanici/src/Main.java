import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String userName,password;
        int select=0,newPassword ;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanıcı Adı Giriniz: ");
        userName=scan.nextLine();
        System.out.print("şifreyi giriniz : ");
        password=scan.nextLine();
        int password2=Integer.parseInt(password);

        if(userName.equals("patika") && password.equals("123")){
            System.out.println("Giriş Başarılı !");
        }
        else {
            System.out.println("Hatalı Şifre ! Şifrenizi Sıfırlamak İster misiniz?");
            System.out.println("1. Evet \n 2.Hayır");
            select=scan.nextInt();

        }

        switch (select){
            case 1:
                System.out.println("Yeni Şifrenizi Giriniz:");
                newPassword= scan.nextInt();
                if (newPassword==123||newPassword==password2){
                    System.out.println("Şifre oluşturalamadı Tekrar Deneyiniz!");
                }
                else
                    System.out.println("Şifre oluşturuldu..");

        }







    }
}