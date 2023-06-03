public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("marc" , 500 , 500, 90, 100);
        Fighter alex = new Fighter("alex" , 90 , 500, 100, 30);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}