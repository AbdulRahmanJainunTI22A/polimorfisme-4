

/**
 *
 * @author Abdul Rahman Jainun
 */
public class BarangElektronik extends Barang {
     private String jenis;

    public BarangElektronik(String nama, int harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }
    
     @Override
    public void info() {
        super.info();
        System.out.println("Jenis: " + jenis);
    }
}
    

