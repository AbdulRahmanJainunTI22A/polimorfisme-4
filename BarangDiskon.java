

/**
 *
 * @author Abdul Rahman Jainun
 */
public class BarangDiskon extends Barang  {
    
    public BarangDiskon(String nama, int harga) {
        super(nama, harga);
    }
    
    public int hitungTotalHarga(int jumlah, double diskon) {
        int totalSebelumDiskon = harga * jumlah;
        int diskonDiterapkan = (int) (totalSebelumDiskon * diskon);
        return totalSebelumDiskon - diskonDiterapkan;
    }

    public static void main(String[] args) {
        BarangDiskon barang2 = new BarangDiskon("Buku", 5000);
        System.out.println("Total Harga 2 (diskon 10%): " + barang2.hitungTotalHarga(3, 0.1));
    }
}
    
    

