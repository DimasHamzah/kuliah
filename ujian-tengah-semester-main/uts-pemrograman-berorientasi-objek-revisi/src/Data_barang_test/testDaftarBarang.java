package Data_barang_test;

import Data_Barang.DaftarBarang;
import Data_Barang.Laptop;

public class testDaftarBarang {
    public static void main(String[] args) {
        teshHapusData();
    }
    public static void testDaftarbarang(){
        Laptop laptop = new Laptop("asus", "asdas", "dasda", "dasda", "dsada", "dasad");
        Laptop laptops = new Laptop("lenovo", "asdas", "dasda", "dasda", "dsada", "dasad");
        DaftarBarang daftarBarang = new DaftarBarang();
        daftarBarang.memasukanData(laptop);
        daftarBarang.memasukanData(laptops);
    }
    public static void testUpdateData(){
        Laptop laptop = new Laptop("asus", "asdas", "dasda", "dasda", "dsada", "dasad");
        Laptop laptops = new Laptop("lenovo", "asdas", "dasda", "dasda", "dsada", "dasad");
        DaftarBarang daftarBarang = new DaftarBarang();

        daftarBarang.memasukanData(laptop);
        daftarBarang.memasukanData(laptops);
        daftarBarang.merubahData(1, laptop);
        daftarBarang.merubahData(0, laptops);
        daftarBarang.menampilkanData();

    }
    public static void teshHapusData(){
        Laptop laptop = new Laptop("asus", "asdas", "dasda", "dasda", "dsada", "dasad");
        Laptop laptops = new Laptop("lenovo", "asdas", "dasda", "dasda", "dsada", "dasad");
        Laptop laptis = new Laptop("mack", "asdas", "dasda", "dasda", "dsada", "dasad");
        DaftarBarang daftarBarang = new DaftarBarang();
        daftarBarang.memasukanData(laptop);
        daftarBarang.memasukanData(laptops);
        daftarBarang.memasukanData(laptis);
        daftarBarang.menampilkanData();
        daftarBarang.menghapusData(2);
        System.out.println("\n");
        daftarBarang.menampilkanData();
    }

}
