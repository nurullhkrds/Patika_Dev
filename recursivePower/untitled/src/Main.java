
public class Main {
    static int power(int taban,int us){
        if (us==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban * power(taban, us-1);

    }


    public static void main(String[] args) {


       System.out.println(power(5,3));



    }
}