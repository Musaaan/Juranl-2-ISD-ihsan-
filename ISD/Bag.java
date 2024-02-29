public class Bag  {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stock;

public Bag (String kodeBarang, String jenisBarang, String namaBarang, int stock) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stock = stock;
        }

    public String getKodebarang() {
        return kodeBarang;
    }

    public String getJenisbarang() {
        return jenisBarang;
    }

    public String getNamabarang() {
        return namaBarang;
    }
    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Kode Barang = " + kodeBarang + ", Jenis Barang = " + jenisBarang + ", Nama Barang = " + namaBarang
                + ", stock = " + stock;
    }
}