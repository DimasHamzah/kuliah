package views;

import java.util.Scanner;

public class View_User {
  public View_User() {
    kelompok1();
    menuDataCrud();
  }
  public static void kelompok1(){
    System.out.println("--------------------------------------------------------");
  }

  public static Integer crudMahasiswa() {
    System.out.println("CRUD MAHASISWA");
    System.out.println("1. CREATE DATA MAHASISWA");
    System.out.println("2. READ DATA MAHASISWA");
    System.out.println("3. UPDATE DATA MAHASISWA");
    System.out.println("4. DELETE DATA MAHASISWA");
    System.out.println("0. EXIT");

    Integer inputCrud = inputSelectCrud();
    return inputCrud;
  }
  //select number menu
  public static Integer inputSelectCrud() {
    Scanner inputNumber = new Scanner(System.in);
    System.out.print("pilih : ");
    Integer selectNumber =  inputNumber.nextInt();
    return selectNumber;
  }
  //list menu
  public static void listMenuCrud(Integer inputUserCrudMenu) {
    System.out.println("**********************************");
    loopListMenu(inputUserCrudMenu);
    System.out.println("**********************************");
  }

  public static boolean loopListMenu(Integer inputUserCrudMenu) {
    boolean loopMenu = true;
    int i = 1;
    while (loopMenu){
      if(inputUserCrudMenu == i){
        selectMenu(inputUserCrudMenu);
        break;
      }
      i++;
    }
   return loopMenu;
  }
  public static void selectMenu(Integer inputUserDaftarMenu){
    switch (inputUserDaftarMenu){
      case 1:
        System.out.println("CREATE DATA MAHASISWA");
        Input_User.inputDataMahasiswa();
        break;
      case 2:
        System.out.println("READ DATA MAHASISWA");
        Input_User.readDataMahasiswa();
        break;
      case 3:
        System.out.println("UPDATE DATA MAHASISWA BERDASARKAN NIM");
        Input_User.updateDataMahasiswa();
        break;
      case 4:
        System.out.println("DELETE DATA MAHASISWA BERDASARKAN NIM");
        Input_User.deleteDataMahasiswa();
        break;
      case 0:
        System.exit(0);
        break;
      default:
        System.out.println("input salah");
        break;
    }
  }
  public static void menuDataCrud(){
    boolean loopMenu = true;
    while (loopMenu){
     Integer selectMenu = crudMahasiswa();
     listMenuCrud(selectMenu);
     loopMenu = loopListMenuCrud();
    }
  }
  //mengulang daftar menu
  public static  boolean loopListMenuCrud(){
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




























































































