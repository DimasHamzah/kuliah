package Data_Barang;

import java.util.Scanner;

public class DaftarBarangMenu {
   private static  DaftarBarangInputUser daftarBarangInputUser = new DaftarBarangInputUser();
    public static void main(String[] args) {
        menuDataLaptop();
    }
    //menu
    public static Integer daftarMenu(){
        System.out.println("SOAL UJIAN TENGAH SEMESTER");
        System.out.println("1. Memasukan Data ");
        System.out.println("2. Menghapus Data ");
        System.out.println("3. Menampilkan Data");
        System.out.println("4. Update Data");

        Integer pilihDaftarMenu = inputDaftarMenu();
        return pilihDaftarMenu;
    }
    //input daftar menu
    public static Integer inputDaftarMenu(){
        Scanner inputData = new Scanner(System.in);
        System.out.print("pilih : ");
        Integer numberPilih = inputData.nextInt();
        return numberPilih;
    }

    //list menu
    public static void listDaftarMenu(Integer inputUserDaftarMenu){
        System.out.println("**********************************");
        pengulanganDaftarMenu(inputUserDaftarMenu);
        System.out.println("**********************************");
    }
    public static boolean pengulanganDaftarMenu(Integer inputUserDaftarMenu){
        boolean ulangMenu = true;
        int i = 1;
        while (ulangMenu){
            if(inputUserDaftarMenu == i){
                pemilihanMenu(inputUserDaftarMenu);
                break;
            }
            i++;
        }
      return ulangMenu;
    }
    public static void pemilihanMenu(Integer inputUserDaftarMenu){
        switch (inputUserDaftarMenu){
            case 1:
                System.out.println("TAMBAH DATA LAPTOP");
                DaftarBarangInputUser.inputDataBarang();
                break;
            case 2:
                System.out.println("MENGHAPUS DATA LAPTOP");
                DaftarBarangInputUser.HapusDataBarang();
                break;
            case 3:
                System.out.println("MENAMPILKAN SELURUH DATA LAPTOP");
                DaftarBarangInputUser.tampilDataBarang();
                break;
            case 4:
                System.out.println("UPDATE DATA LAPTOP");
                DaftarBarangInputUser.updateDataBarang();
                break;
            default:
                System.out.println("input salah");
                break;
        }
    }
    public static void menuDataLaptop(){
        boolean ulangMenu = true;
        while (ulangMenu){
            Integer pilihDaftarMenu = daftarMenu();
            listDaftarMenu(pilihDaftarMenu);
            ulangMenu = mengulangiDaftarMenu();
        }
    }

    //mengulang daftar menu
    public static  boolean mengulangiDaftarMenu(){
        boolean ulangiMenu = false;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("apakah ingin mengulang (y/n) : ");
        String pilihUlangiMenu = inputUser.next();

        ulangiMenu = kondisiMengulangDaftarMenu(pilihUlangiMenu,  inputUser);
        return  ulangiMenu;
    }
    public static boolean kondisiMengulangDaftarMenu(String pilihUlangiMenu,  Scanner inputUser){
        boolean ulangiMenu = pecahKondisiMengulangDaftarMenu(pilihUlangiMenu, inputUser);
        return ulangiMenu;
    }
    public static boolean pecahKondisiMengulangDaftarMenu(String pilihUlangiMenu, Scanner inputUser){
        boolean ulangiMenu = false;
        if(pilihUlangiMenu.equalsIgnoreCase("y")){
            ulangiMenu = true;
        }else if(pilihUlangiMenu.equalsIgnoreCase("n")){
            ulangiMenu = false;
        }else{
            ulangiMenu = kondisiUlangWhileDaftarMenu(pilihUlangiMenu, inputUser);
        }
        return ulangiMenu;
    }
    public static boolean kondisiUlangWhileDaftarMenu(String pilihUlangiMenu,  Scanner inputUser){
        boolean ulangiMenu = false;
        while (!pilihUlangiMenu.equalsIgnoreCase("y") && !pilihUlangiMenu.equalsIgnoreCase("n")){
            System.out.print("pilihan tidak ditemukan, mohon input (y/n) : ");
            pilihUlangiMenu = inputUser.next();
            ulangiMenu =  pengulanganWhilePilih(pilihUlangiMenu);
        }
        return ulangiMenu;
    }
    public static boolean pengulanganWhilePilih(String pilihUlangiMenu){
        boolean ulangiMenu = false;
        if(pilihUlangiMenu.equalsIgnoreCase("y")){
            ulangiMenu = true;
        }else if(pilihUlangiMenu.equalsIgnoreCase("n")){
            ulangiMenu = false;
        }
        return ulangiMenu;
    }
}
