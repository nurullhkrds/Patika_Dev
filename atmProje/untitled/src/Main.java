import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullanici, password;
        int select, hak = 3, balance = 500, miktar;

        while (hak != 0) {
            System.out.print("kullanıcı adınızı giriniz...");
            kullanici = scan.nextLine();
            System.out.print("parolanızı giriniz...");
            password = scan.nextLine();
            switch (kullanici) {
                case "patika":
                    switch (password) {
                        case "123":
                            System.out.println("Giriş Başarılı.");
                            do {
                                System.out.println("Yapmak istediğiniz işlemi seçiniz" +
                                        " \n 1.Para Yatırma " +
                                        "\n 2.Para çekme" +
                                        "\n 3.Bakiye sorgulama" +
                                        "\n 4.Çıkış Yap");
                                select = scan.nextInt();
                                switch (select) {
                                    case 1:
                                        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                                        miktar = scan.nextInt();
                                        balance += miktar;
                                        System.out.print(miktar + " TL Başarı ile yatırıldı. \n ");

                                        break;
                                    case 2:
                                        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                                        miktar = scan.nextInt();
                                        int control = (balance < miktar) ? 0 : 1;

                                        switch (control) {
                                            case 0:
                                                System.out.println("Bakiye Yetersiz");
                                                break;
                                            case 1:
                                                balance -= miktar;
                                                break;

                                        }
                                        break;
                                    case 3:
                                        System.out.println("Hesap bakiyeniz: " + balance);
                                        break;

                                }


                            }while (select != 4);
                            break;

                        default:
                            System.out.println("Hatalı giriş Kalan hakkınız: " + --hak);
                    }
                    break;
                default:
                    System.out.println("Hatalı giriş Kalan hakkınız: " + --hak);

            }


        }

    }

}
