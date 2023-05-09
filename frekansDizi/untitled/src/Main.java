import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean isFind(int arr [],int value){

        for(int i:arr){
            if (i==value){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
       int [] dizi={1,2,3,5,3,3,2,1,5,6,6,7,8,5,3,1};
       int [] duplicate=new int[dizi.length];
       int sayac;
       for (int i=0;i<dizi.length;i++){
           sayac=1;
           for (int j=i+1;j<dizi.length;j++){
               if (dizi[i]==dizi[j]){
                   sayac++;
               }
           }
           if (!(isFind(duplicate,dizi[i]))){
               duplicate[i]=dizi[i];
           }

           if (!(duplicate[i]==0)){
               System.out.println(duplicate[i]+": "+sayac+" kez tekrarladı");

           }
       }

    }
}