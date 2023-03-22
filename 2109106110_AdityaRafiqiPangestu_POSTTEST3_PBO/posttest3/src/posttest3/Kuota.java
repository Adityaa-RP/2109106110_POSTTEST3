
package posttest3;

public class Kuota extends Voucher{
    protected String provider;
    protected String wilayah;

    public String getProvider() {
        return provider;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public Kuota(String provider, String wilayah, String voucher, String paket, String masa, int kode, int harga) {
        super(voucher, paket, masa, kode, harga);
        this.provider = provider;
        this.wilayah = wilayah;
    }
    
    
}
