package Data_Barang;

public class Laptop extends DataBarang{
   private String merek;
   private String ram;
   private String processor;
   private String sistemOperasi;

    public Laptop(){}

    public Laptop(String kodeBarang, String namabarang, String merek, String ram, String procesor, String sistemOperasi) {
        super(kodeBarang, namabarang);
        this.merek = merek;
        this.ram = ram;
        this.processor= procesor;
        this.sistemOperasi = sistemOperasi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesor() {
        return processor;
    }

    public void setProcesor(String procesor) {
        this.processor = procesor;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public void tampilinfo(){
        System.out.printf("*%-28s *%-29s *%-29s *%-31s *%-27s *%-20s", this.getKodeBarang(), this.getNamaBarang(), this.merek, this.ram, this.processor, this.sistemOperasi);
        System.out.println("\n");
    }

}
