package Data_Barang;

public class DataBarang {

    private String kodeBarang;
    private String namaBarang;

    public DataBarang() {
    }

    public DataBarang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

}
