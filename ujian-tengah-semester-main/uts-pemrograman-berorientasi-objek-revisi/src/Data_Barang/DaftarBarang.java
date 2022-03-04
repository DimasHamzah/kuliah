package Data_Barang;

public class DaftarBarang {
    private static Laptop[] dataLaptop = new Laptop[20];

    //cek full
    public boolean isFull() {
        boolean isfull = false;
        if (dataLaptop[dataLaptop.length - 1] != null) {
            isfull = true;
        }
        return isfull;
    }
    //cek kosong
    public static boolean isEmpty() {
        boolean empty = false;
        if (dataLaptop[0] == null) {
            empty = true;
        }
        return empty;
    }
    //method memasukan data
    public void memasukanData(Laptop laptop) {
        for (int i = 0; i < dataLaptop.length; i++) {
            if (isFull()) {
                System.out.println("data penuh");
                break;
            } else {
                if (dataLaptop[i] == null) {
                    dataLaptop[i] = laptop;
                    break;
                }
            }
        }
    }

    //method untuk menampilkan data
    public void menampilkanData() {
        menampilkanDataHeader();
        cekDataIndex();
        menampilkanDataGaris();
    }
    public static void cekDataIndex(){
        for (int i = 0; i < dataLaptop.length - 1; i++) {
            if (dataLaptop[i] == null) {
                break;
            }
            System.out.printf("%-20d", i + 1);
            dataLaptop[i].tampilinfo();
        }
    }
    public static void menampilkanDataHeader() {
        System.out.println("|===========================================================================================================================================================================================|");
        System.out.println("+No\t\t\t\t\t+KODE BARANG\t\t\t\t +NAMA BARANG\t\t\t\t\t +MEREK\t\t\t\t\t\t\t+RAM\t\t\t\t\t\t\t +PROSESOR\t\t\t\t\t +SISTEM OPERASI|");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
    }
    public static void menampilkanDataGaris() {
        System.out.println("|===========================================================================================================================================================================================|");
    }

    //fungsi merubah data
    public void merubahData(Integer number, Laptop laptop) {
        cekIsEmpty();
        for (int i = 0; i < dataLaptop.length; i++) {
            if (number == i) {
                dataLaptop[i] = laptop;
            }
        }
    }
    public static void cekIsEmpty() {
        if (isEmpty()) {
            System.out.println("data kosong");
        }
    }


    //fungsi menhapus data
    public void menghapusData(Integer numberDataBarang) {
        if (isEmpty()) {
            System.out.println("data kosong");
        } else {
            kondisiMenghapusDataBarang(numberDataBarang);
        }
    }
    public static void kondisiMenghapusDataBarang (Integer numberdataBarang){
        if (numberdataBarang - 1 == dataLaptop.length - 1) {
            dataLaptop[numberdataBarang] = null;
        } else {
            menghapusDataBarangKondisi(numberdataBarang);
        }
    }
    public static void menghapusDataBarangKondisi (Integer numberDataBarang){
        for (int i = numberDataBarang - 1; i < dataLaptop.length - 1; i++) {
            if (i == dataLaptop.length - 1) {
                dataLaptop[i] = null;
            } else {
                dataLaptop[i] = dataLaptop[i + 1];
            }
        }
    }
}
