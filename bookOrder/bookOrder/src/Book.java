public class Book implements Comparable<Book>{

    private String kitapAdi;
    private int sayfa;
    private String yazarAdi;
    private int yayinTarihi;

    public Book(String kitapAdi, int sayfa, String yazarAdi, int yayinTarihi) {
        this.kitapAdi = kitapAdi;
        this.sayfa = sayfa;
        this.yazarAdi = yazarAdi;
        this.yayinTarihi = yayinTarihi;
    }

    public Book(){

    }


        @Override
    public int compareTo(Book o) {
        return this.getKitapAdi().compareTo(o.getKitapAdi());
    }
    /*
    @Override
    public int compareTo (Book o) {
        return this.getTotalPage() - o.getTotalPage();
    }

     */






    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}
