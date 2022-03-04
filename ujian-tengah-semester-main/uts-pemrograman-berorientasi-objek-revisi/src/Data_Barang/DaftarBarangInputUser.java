package Data_Barang;

import java.io.IOException;
import java.util.Scanner;

public class DaftarBarangInputUser {
    private static Laptop dataLaptop;
    private static DaftarBarang daftarBarang;
    private static Scanner inputdataUser = new Scanner(System.in);

    //input data
    public static void inputDataBarang(){
        System.out.print("kode barang\t\t\t: ");
        String kodeBarang = inputdataUser.nextLine();
        System.out.print("nama barang\t\t\t: ");
        String namaBarang = inputdataUser.nextLine();
        System.out.print("merek\t\t\t\t: ");
        String merek = inputdataUser.nextLine();
        System.out.print("ram\t\t\t\t\t: ");
        String ram = inputdataUser.nextLine();
        System.out.print("prosessor\t\t\t: ");
        String prosessor = inputdataUser.nextLine();
        System.out.print("sistem operasi\t\t: ");
        String sistemOperasi = inputdataUser.nextLine();
        System.out.println("berhasil menambah data");

        simpanDataBarang(kodeBarang, namaBarang, merek, ram, prosessor, sistemOperasi);
    }
    public static void simpanDataBarang(String kodeBarang, String namaBarang, String merek, String ram, String prosessor, String sistemOperasi){
        dataLaptop = new Laptop(kodeBarang, namaBarang, merek, ram, prosessor, sistemOperasi);
        daftarBarang = new DaftarBarang();
        daftarBarang.memasukanData(dataLaptop);
        System.out.println("berhasil menambah data");
    }


    //hapus data
    public static void HapusDataBarang(){
        System.out.print("masukan nomer yang akan dihapus : ");
        Integer numberDataBarang = inputdataUser.nextInt();
        daftarBarang.menghapusData(numberDataBarang);
    }

    //tampil data
    public static void tampilDataBarang(){
        daftarBarang = new DaftarBarang();
        daftarBarang.menampilkanData();
    }

    //update data
    public static void updateDataBarang(){
        daftarBarang = new DaftarBarang();
        dataLaptop = new Laptop();
        System.out.print("masukan nomer yang akan di update : ");
        Integer number = inputdataUser.nextInt();

        kondisiUpdateData(number);
    }
    public static void kondisiUpdateData(Integer number){
        kondisiIFUpdateData(number);
        kondisiElseIfUpateData(number);
    }
    public static void kondisiIFUpdateData(Integer number){
        if(number-1 > 20){
            System.out.println("data tidak ditemukan");
        }
    }
    public static void kondisiElseIfUpateData(Integer number){
        if(number-1 < -1){
            System.out.println("data tidak ditemukan");
        }else{
            inputUpdateData(number);
        }
    }
    public static void inputUpdateData(Integer number){
        System.out.print("kode barang\t\t\t: ");
        String kodeBarang = inputdataUser.next();
        dataLaptop.setKodeBarang(kodeBarang);
        System.out.print("nama barang\t\t\t: ");
        inputdataUser.nextLine();
        String namaBarang = inputdataUser.nextLine();
        dataLaptop.setNamaBarang(namaBarang);
        System.out.print("merek\t\t\t\t: ");
        String merek = inputdataUser.nextLine();
        dataLaptop.setMerek(merek);
        System.out.print("ram\t\t\t\t\t: ");
        String ram = inputdataUser.nextLine();
        dataLaptop.setRam(ram);
        System.out.print("prosessor\t\t\t: ");
        String prosessor = inputdataUser.nextLine();
        dataLaptop.setProcesor(prosessor);
        System.out.print("sistem operasi\t\t: ");
        String sistemOperasi = inputdataUser.nextLine();
        dataLaptop.setSistemOperasi(sistemOperasi);
        System.out.println("berhasil merubah data");

        daftarBarang.merubahData(number-1, dataLaptop);
    }
}


