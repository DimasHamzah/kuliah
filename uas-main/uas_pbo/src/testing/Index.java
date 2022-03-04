package testing;

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

public class Index {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    testControllerDeleteMahasiswa();
  }
  public static void testControllerListMahasiswa() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Mahasiswa mahasiswa;
    Controller_sistem controller_sistem = new Controller_sistemImpl(mahasiswaRepositoy);
    Connection connection = database.connectionDatabase();
    controller_sistem.readDataMahasiswa();
  }
  public static void testControllerAddMahasiswa() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Controller_sistem controller_sistem = new Controller_sistemImpl(mahasiswaRepositoy);
    Connection connection = database.connectionDatabase();

    String nama = "ryanrahayu";
    String nim = "1900101011";
    String tempat = "badung";
    String tanggal ="2000-01-05";
    String email = "ryanrahayu@gmail.com";
    String telepon = "088";
    String prodi = "sistem informasi";
    String kosentrasi = "arthificial inteligenci";

    List<String> dataMhs = new ArrayList<>();
    dataMhs.addAll(Arrays.asList(nama, nim, tempat, tanggal, email, telepon, prodi, kosentrasi));
    controller_sistem.createDataMahasiswa(dataMhs);
    controller_sistem.readDataMahasiswa();
  }
  public static void testControllerUpdateMahasiswa() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Controller_sistem controller_sistem = new Controller_sistemImpl(mahasiswaRepositoy);
    Connection connection = database.connectionDatabase();

    String nama = "i wayan sarianto";
    String nim = "1900101011";
    String tempat = "badung";
    String tanggal ="2000-01-06";
    String email = "wayansayrianto@gmail.com";
    String telepon = "088";
    String prodi = "sistem informasi";
    String kosentrasi = "arthificial inteligenci";

    List<String> dataMhs = new ArrayList<>();
    dataMhs.addAll(Arrays.asList(nama, nim, tempat, tanggal, email, telepon, prodi, kosentrasi));
    controller_sistem.updateDataMahasiswa(dataMhs);
  }
  public static void testControllerDeleteMahasiswa() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Controller_sistem controller_sistem = new Controller_sistemImpl(mahasiswaRepositoy);
    Connection connection = database.connectionDatabase();
    controller_sistem.deleteDataMahasiswa("1900101011");
  }

}

