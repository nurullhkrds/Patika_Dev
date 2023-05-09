import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Dizi Boyutunu giriniz: \n");
        int diziBoyutu=scan.nextInt();
        double [] dizi=new double[diziBoyutu];
        double sum=1;
        for (int i=0;i<diziBoyutu;i++){
            System.out.print((i+1)+". Elemanı Giriniz:");
            dizi[i]=scan.nextDouble();
            sum=sum+(1/dizi[i]);

        }
        double harmonikAvarage=sum/diziBoyutu;

        System.out.println("Harmonik Seri Ortalaması: "+ harmonikAvarage);






    }
}