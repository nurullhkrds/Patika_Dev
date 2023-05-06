import javax.naming.NameNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik;
        int total = 0,sayac=0;
        double avarage;

        System.out.println("Matematik Notunuzu girininiz: ");
        mat=scan.nextInt();
        System.out.println("Fizik Notunuzu girininiz: ");
        fizik=scan.nextInt();
        System.out.println("Kimya Notunuzu girininiz: ");
        kimya=scan.nextInt();
        System.out.println("Türkçe Notunuzu girininiz: ");
        turkce=scan.nextInt();
        System.out.println("Müzik Notunuzu girininiz: ");
        muzik=scan.nextInt();

        if(!(mat<0 || mat>100)){
            total=total+mat;
            sayac=sayac+1;

        }
        else{
            mat=0;

        }
        if(!(kimya<0 || kimya>100)){
            total=total+kimya;
            sayac=sayac+1;

        }
        else{
            kimya=0;

        }
        if(!(fizik<0 || fizik>100)){
            total=total+fizik;
            sayac=sayac+1;

        }
        else{
            fizik=0;

        }
        if(!(turkce<0 || turkce>100)){
            total=total+turkce;
            sayac=sayac+1;

        }
        else{
            turkce=0;

        }
        if(!(muzik<0 || muzik>100)){
            total=total+muzik;
            sayac=sayac+1;

        }
        else{
            muzik=0;

        }

        avarage=total/sayac;

        if (avarage>=55){

            System.out.println("Tebrikler Sınıfı Geçtiniz ! \n Ortalamanız: "+ avarage);


        }
        else
            System.out.println("Sınıfta Kaldınız seneye tekrar Görüşmek üzere !..");

        System.out.println(sayac+" "+total);




    }
}