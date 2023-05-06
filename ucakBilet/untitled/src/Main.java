import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double gidilecekYol,total = 0;
        int yas,yolculukTipi;

        System.out.println("Gidilecke Mesafe: ");
        gidilecekYol=scan.nextDouble();
        System.out.println("Yaş: ");
        yas=scan.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi=scan.nextInt();

        if(gidilecekYol>=0){
            switch (yolculukTipi){
                case 1:

                    if(yas<0){
                        System.out.println("HATALI VERİ GİRDİNİZ !");
                    }
                    else {
                        if (yas<12 ){
                            total=(gidilecekYol*0.10)-(gidilecekYol*0.10)*0.5;
                        } else if (yas<24) {
                            total=(gidilecekYol*0.10)-(gidilecekYol*0.10)*0.1;
                        } else if (yas>65) {
                            total=(gidilecekYol*0.10)-(gidilecekYol*0.10)*0.3;

                        }

                    }
                    break;

                case 2:
                    if (yas<0){
                        System.out.println("HATALI VERİ GİRDİNİZ !");
                    }
                    else {
                        if (yas<12){
                            total=2*((gidilecekYol*0.10)-(gidilecekYol*0.10)*0.5);
                        } else if (yas<24) {
                            total=2*((gidilecekYol*0.10)-(gidilecekYol*0.10)*0.1);
                        } else if (yas>65) {
                            total=2*((gidilecekYol*0.10)-(gidilecekYol*0.10)*0.3);

                        }

                    }

                    break;
                default:
                    System.out.println("HATALI VERİ GİRDİNİZ !");

            }
            System.out.println("Toplam Tutarınız: "+ total);

        }
        else
            System.out.println("HATALI VERİ GİRDİNİZ !");

    }
}