import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     // ( 2 4 1 5)
     int boyut,temp=0;
     System.out.print("Dizi boyutunu giriniz: ");
     boyut=scan.nextInt();
     int [] dizi=new int[boyut];


        for (int i=0;i<dizi.length;i++){
            dizi[i]=scan.nextInt();

        }
        for (int i=0;i<dizi.length;i++){
            for (int j=i+1;j<dizi.length;j++){
                if (dizi[j]<dizi[i]){
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
    }
}