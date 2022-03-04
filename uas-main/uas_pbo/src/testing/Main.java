package testing;

import models.core.Database;
import models.entity.Mahasiswa;
import models.repository.MahasiswaRepositoryImpl;
import models.repository.MahasiswaRepositoy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  private static Database database;
  public static void main(String[] args)throws SQLException, ClassNotFoundException {
    testList();
  }
  public static void testDelete() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Connection connection = database.connectionDatabase();
    Mahasiswa mahasiswa = new Mahasiswa();

    mahasiswaRepositoy.delete("190010198");
  }
  public static void testRandom(List<String>testAddRandom) {
    int i = 0;
    for(var nama : testAddRandom) {
      System.out.println(testAddRandom.get(i));
      i++;
    }
  }
  public static List<String> testAddRandom() {
    List<String> data = new ArrayList<>();
    data.add("dimas");
    data.add("nur");
    data.add("hamzah");

    return data;
  }
  public static void testConnection()throws SQLException, ClassNotFoundException  {
    Connection connection = database.connectionDatabase();
    Statement statement = connection.createStatement();
    String sql = """
       SELECT * FROM mahasiswa
      """;

    ResultSet resultSet = statement.executeQuery(sql);

//    while (resultSet.next()) {
//      String todo = resultSet.getString("todo");
//      String tanggal = resultSet.getString("tanggal");
//
//      System.out.println(String.join(" ", todo, " ", tanggal));
//    }
    resultSet.close();
    statement.close();
    connection.close();
  }
  public static void testList() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Connection connection = database.connectionDatabase();

    List<Mahasiswa> mahasiswas = mahasiswaRepositoy.getAll();
    for (var mhs : mahasiswas) {
      System.out.printf("%-30s",mhs.getNama());
      System.out.printf("%-30s",mhs.getNim());
      System.out.printf("%-30s",mhs.getEmail());
      System.out.printf("%-30s",mhs.getTelepon());
      System.out.printf("%-30s",mhs.getTempat_lahir());
      System.out.printf("%-30s",mhs.getTanggal_lahir());
      System.out.printf("%-30s",mhs.getProdi());
      System.out.printf("%-30s",mhs.getKosentrasi());
      System.out.println("\n");
    }
  }
  public static void testAdd() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Connection connection = database.connectionDatabase();
    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.setNama("nur");
    mahasiswa.setProdi("sistem kompuer");
    mahasiswa.setNim("190010198");
    mahasiswa.setEmail("nur@gmail.com");
    mahasiswa.setTelepon("088441222335");
    mahasiswa.setTanggal_lahir("1999-08-06");
    mahasiswa.setTempat_lahir("surabaya");
    mahasiswa.setKosentrasi("networking cyber security");

    List<String> mahasiswas = new ArrayList<>();
    mahasiswas.addAll(Arrays.asList(mahasiswa.getNama(), mahasiswa.getNim(), mahasiswa.getTempat_lahir(),
      mahasiswa.getTanggal_lahir(), mahasiswa.getEmail(),mahasiswa.getTelepon(), mahasiswa.getProdi(), mahasiswa.getKosentrasi()));

    Integer cek = mahasiswaRepositoy.add(mahasiswas);
    if(cek > 0) {
      System.out.println("berhasil");
    }else {
      System.out.println("gagal");
    }
  }
  public static void testUpdate() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Connection connection = database.connectionDatabase();
    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.setNama("hamzah");
    mahasiswa.setProdi("sistem informasi");
    mahasiswa.setNim("190010197");
    mahasiswa.setEmail("hamzah@gmail.com");
    mahasiswa.setTelepon("088441222335");
    mahasiswa.setTanggal_lahir("1999-08-06");
    mahasiswa.setTempat_lahir("semarang");
    mahasiswa.setKosentrasi("artificial inteligince");

    List<String> mahasiswas = new ArrayList<>();
    mahasiswas.addAll(Arrays.asList(mahasiswa.getNama(), mahasiswa.getNim(), mahasiswa.getTempat_lahir(),
      mahasiswa.getTanggal_lahir(), mahasiswa.getEmail(),mahasiswa.getTelepon(), mahasiswa.getProdi(), mahasiswa.getKosentrasi()));
    boolean sukses = mahasiswaRepositoy.update(mahasiswas);
    if(sukses){
      System.out.println("nice");
    }else{
      System.out.println("huuhuuuh gagal");
    }
  }
  public static void testExist() throws SQLException, ClassNotFoundException {
    Database database = new Database();
    MahasiswaRepositoy mahasiswaRepositoy = new MahasiswaRepositoryImpl(database);
    Connection connection = database.connectionDatabase();
    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.setNama("nur");
    mahasiswa.setProdi("sistem informasi");
    mahasiswa.setNim("190010197");
    mahasiswa.setEmail("nur@gmail.com");
    mahasiswa.setTelepon("088441222335");
    mahasiswa.setTanggal_lahir("1999-08-06");
    mahasiswa.setTempat_lahir("semarang");
    mahasiswa.setKosentrasi("artificial inteligince");

    List<String> mahasiswas = new ArrayList<>();
    mahasiswas.addAll(Arrays.asList(mahasiswa.getNama(), mahasiswa.getNim(), mahasiswa.getTempat_lahir(),
      mahasiswa.getTanggal_lahir(), mahasiswa.getEmail(),mahasiswa.getTelepon(), mahasiswa.getProdi(), mahasiswa.getKosentrasi()));
    boolean sukses = mahasiswaRepositoy.update(mahasiswas);
    if(sukses){
      System.out.println("nice");
    }else{
      System.out.println("huuhuuuh gagal");
    }
  }
}






























