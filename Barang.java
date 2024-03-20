

/**
 *
 * @author Abdul Rahman Jainun
 */
public class Barang {
    protected String nama;
    protected int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    public static void main(String[] args) {
        Barang barang1 = new Barang("Buku", 5000);
        System.out.println("Total Harga 1: " + barang1.hitungTotalHarga(3));
    }

    void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

