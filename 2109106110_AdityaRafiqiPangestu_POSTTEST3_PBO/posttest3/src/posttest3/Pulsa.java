
package posttest3;

public class Pulsa extends Voucher{
    protected String provider;
    protected int notujuan;

    public String getProvider() {
        return provider;
    }

    public int getNotujuan() {
        return notujuan;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setNotujuan(int notujuan) {
        this.notujuan = notujuan;
    }

    public Pulsa(String provider, int notujuan, String voucher, String paket, String masa, int kode, int harga) {
        super(voucher, paket, masa, kode, harga);
        this.provider = provider;
        this.notujuan = notujuan;
    }
    
    
}
