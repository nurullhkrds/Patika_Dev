import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n,r,nFactoriyel = 1,rFactoriyel=1,farkFaktoriyel=1,kombinasyon=0;
        System.out.print("Toplam Eleman sayısını seçiniz: ");
        n=scan.nextInt();
        System.out.print("Seçilecek eleman sayısını seçiniz: ");
        r=scan.nextInt();

        for(int i=1;i<=n;i++){
            nFactoriyel=nFactoriyel*i;
        }

        for(int i=1;i<=r;i++){
            rFactoriyel=rFactoriyel*i;
        }

        for(int i=1;i<=n-r;i++){
            farkFaktoriyel=farkFaktoriyel*i;
        }
        kombinasyon= nFactoriyel / (rFactoriyel*farkFaktoriyel);
        System.out.print("Kombinasyon Sonucu: "+ kombinasyon);


    }
}