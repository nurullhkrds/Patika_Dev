import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] dizi={-1,3,5,7,9};  //(2 8 -11 1 15)
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        int min,max;
        System.out.println("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        max=sayi;
        min=sayi;

        for(int i=0;i<dizi.length;i++){
            if (dizi[i]>sayi){
                max=dizi[i];
                break;
            }
        }
        for (int i=dizi.length-1;i>=0;i--){
            if (dizi[i]<sayi){
                min=dizi[i];
                break;
            }
        }
        System.out.println("En Yakın büyük sayı: "+max+
                "\n En yakın Küçük sayı: "+min);















    }
}