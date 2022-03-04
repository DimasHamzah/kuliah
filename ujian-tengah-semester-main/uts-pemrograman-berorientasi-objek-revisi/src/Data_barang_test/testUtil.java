package Data_barang_test;

import Data_Barang.DaftarBarang;
import Data_Barang.DaftarBarangInputUser;
import Data_Barang.Laptop;

public class testUtil {
    public static void main(String[] args) {
        testUpdateData();
    }
    public static void testInputUserTambahData(){
        DaftarBarang daftarBarang = new DaftarBarang();
        DaftarBarangInputUser daftarBarangInputUser = new DaftarBarangInputUser();
        daftarBarangInputUser.inputDataBarang();
        daftarBarang.menampilkanData();
    }
    public static void testHapusInput(){
        DaftarBarang daftarBarang = new DaftarBarang();
        DaftarBarangInputUser daftarBarangInputUser = new DaftarBarangInputUser();
        daftarBarangInputUser.inputDataBarang();
        daftarBarangInputUser.inputDataBarang();
        daftarBarang.menampilkanData();
        daftarBarangInputUser.HapusDataBarang();
        daftarBarang.menampilkanData();
    }
    public static void testTampilData(){
        DaftarBarangInputUser daftarBarangInputUser = new DaftarBarangInputUser();
        daftarBarangInputUser.tampilDataBarang();
    }
    public static void testUpdateData(){
        DaftarBarangInputUser daftarBarangInputUser = new DaftarBarangInputUser();
        daftarBarangInputUser.inputDataBarang();
        daftarBarangInputUser.updateDataBarang();
        daftarBarangInputUser.tampilDataBarang();
    }
}
