import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int sayiAdet,i=0,sayi,max=0,min=0;
        System.out.println("Kaç sayı gireceksiniz ? ");
        sayiAdet=scan.nextInt();

        while(!(i==sayiAdet)){
            System.out.println(i+1+". Sayıyı giriniz ");
            sayi=scan.nextInt();
            if(i==0){
                min=sayi;
            }
            else{
                if(sayi<min){
                    min=sayi;
                }
            }

            if (sayi>max){
                max=sayi;
            }


            //System.out.println(sayi+ " ,");
            i++;

        }


        System.out.println("En büyük sayı : "+max+" \n En küçük Sayi: "+ min);


    }
}