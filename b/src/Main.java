// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String [][]dizi=new String[15][3];
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                if (i==0 || i==1 || i==8||i==13||i==14){
                    dizi[i][j]=" * ";
                } else if (i==2|| i==3 || i==4|| i==9|| i==10|| i==11|| i==12 || j==0|| i==2) {
                    dizi[i][j]=" * ";
                } else if ( j==0|| j==1) {
                    dizi[i][j]=" * ";
                }else{
                    dizi[i][j]="  ";

                }

            }
        }


        for (int i=0;i< dizi.length;i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]);
            }
            System.out.println();



        }
    }
}