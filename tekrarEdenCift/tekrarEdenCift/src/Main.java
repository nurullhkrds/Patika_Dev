import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    static boolean isFind(int arr[],int value){
        for(int i:arr){
            if (i==value){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] dizi={1,1,3,5,4,8,123,8,156,9,9,9,9,15,18,18,16,22,16};
        int [] tekrar=new int[dizi.length];
        int index=0;
        for (int i=0;i<dizi.length;i++){
            for (int j=i+1;j<dizi.length;j++){
                if (dizi[i]==dizi[j]){
                    if (!isFind(tekrar,dizi[i])){
                        tekrar[index++]=dizi[i];
                }


                }
            }

        }

        for (int value:tekrar){
            if (!(value==0)){
                if (value%2==0){
                    System.out.print(value+",");


                }

            }
        }



    }
}