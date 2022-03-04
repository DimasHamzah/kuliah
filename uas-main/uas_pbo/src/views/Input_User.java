package views;

import models.core.Database;
import models.entity.Mahasiswa;
import models.repository.MahasiswaRepositoryImpl;
import models.repository.MahasiswaRepositoy;
import sistem.Controller_sistem;
import sistem.Controller_sistemImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input_User {
  private static Scanner inputUser = new Scanner(System.in);
  private static Database database = new Database();
  private static Mahasiswa mahasiswa;
  private static MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
  private static Controller_sistem controller_sistem = new Controller_sistemImpl(mahasiswaRepositoy);

  //input data
  public static void inputDataMahasiswa() {
    System.out.print("nama \t\t\t\t\t\t: ");
    String nama = inputUser.nextLine();
    System.out.print("nim \t\t\t\t\t\t: ");
    String nim = inputUser.nextLine();
    System.out.print("tempat lahir \t\t\t\t: ");
    String tempat_lahir = inputUser.nextLine();
    System.out.print("tanggal lahir (yyyy-mm-dd) \t: ");
    String tanggal_lahir = inputUser.nextLine();
    System.out.print("email \t\t\t\t\t\t: ");
    String email = inputUser.nextLine();
    System.out.print("telepon \t\t\t\t\t: ");
    String telepon = inputUser.nextLine();
    System.out.print("prodi \t\t\t\t\t\t: ");
    String prodi = inputUser.nextLine();
    System.out.print("kosentrasi \t\t\t\t\t: ");
    String kosentrasi = inputUser.nextLine();

    List<String> data = new ArrayList<>();
    data.addAll(Arrays.asList(nama, nim, tempat_lahir, tanggal_lahir, email, telepon, prodi, kosentrasi));
    try {
      controller_sistem.createDataMahasiswa(data);
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  public static void readDataMahasiswa() {
    try (Connection connection = database.connectionDatabase()) {
      controller_sistem.readDataMahasiswa();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  public static void updateDataMahasiswa() {
    try (Connection connection = database.connectionDatabase()) {
      System.out.print("masukan nim yang di update \t\t\t: ");
      String nim = inputUser.nextLine();
      System.out.print("nama \t\t\t\t\t\t: ");
      String nama = inputUser.nextLine();
      System.out.print("tempat lahir \t\t\t\t: ");
      String tempat_lahir = inputUser.nextLine();
      System.out.print("tanggal lahir (yyyy-mm-dd) \t: ");
      String tanggal_lahir = inputUser.nextLine();
      System.out.print("email \t\t\t\t\t\t: ");
      String email = inputUser.nextLine();
      System.out.print("telepon \t\t\t\t\t: ");
      String telepon = inputUser.nextLine();
      System.out.print("prodi \t\t\t\t\t\t: ");
      String prodi = inputUser.nextLine();
      System.out.print("kosentrasi \t\t\t\t\t: ");
      String kosentrasi = inputUser.nextLine();

      List<String> data = new ArrayList<>();
      data.addAll(Arrays.asList(nama, nim, tempat_lahir, tanggal_lahir, email, telepon, prodi, kosentrasi));
      controller_sistem.updateDataMahasiswa(data);
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  public static void deleteDataMahasiswa() {
    try (Connection connection = database.connectionDatabase()){
      System.out.print("masukan nim yang dihapus : ");
      String nim = inputUser.nextLine();
      System.out.print("yakin di hapus ? (y/n) : ");
      String input = inputUser.nextLine();
      if(input.equalsIgnoreCase("y")){
        controller_sistem.deleteDataMahasiswa(nim);
      }else{
        System.exit(0);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
