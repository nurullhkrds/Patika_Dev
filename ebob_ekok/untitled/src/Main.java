import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n1,n2,ebob=0,i=1;


        System.out.print("Birinci sayıyı giriniz :");
        n1=scan.nextInt();
        System.out.println("İkinci Sayıyı giriniz: ");
        n2=scan.nextInt();

        if (n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }

        }
        else {
            while(i<=n2){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }
        }



        System.out.println(ebob);
    }
}