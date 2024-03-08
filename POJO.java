public class POJO {
    private String buku;
    private String penulis;
    private int tahunTerbit;

    public POJO (String buku, String penulis, int tahunTerbit) {
        this.buku = buku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getBuku() {
        return buku;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku = " + buku + ", Penulis = " + penulis + ", Tahun terbit = " + tahunTerbit ;
    }

}
