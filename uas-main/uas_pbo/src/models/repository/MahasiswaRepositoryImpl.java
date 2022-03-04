package models.repository;

import models.core.Database;
import models.entity.Mahasiswa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepositoryImpl implements MahasiswaRepositoy{
  private Database database;
  
  public MahasiswaRepositoryImpl(Database database) {
    this.database = database;
  }

  public List<Mahasiswa> getAll() throws SQLException, ClassNotFoundException {
    Connection connection = database.connectionDatabase();
    Statement statement = connection.createStatement();

    String sql = """
        SELECT * FROM mahasiswa;
      """;

    ResultSet resultSet = statement.executeQuery(sql);
    List<Mahasiswa> listMahasiswa = new ArrayList<>();
    while (resultSet.next()) {
      Mahasiswa mahasiswa = new Mahasiswa();
      data(resultSet, mahasiswa);
      listMahasiswa.add(mahasiswa);
    }

    statement.close();
    connection.close();
    return listMahasiswa;
  }
  public void data(ResultSet resultSet, Mahasiswa mahasiswa) throws SQLException {
    mahasiswa.setNama(resultSet.getString("nama"));
    mahasiswa.setNim(resultSet.getString("nim"));
    mahasiswa.setTempat_lahir(resultSet.getString("tempat_lahir"));
    mahasiswa.setTanggal_lahir(resultSet.getString("tanggal_lahir"));
    mahasiswa.setEmail(resultSet.getString("email"));
    mahasiswa.setTelepon(resultSet.getString("telepon"));
    mahasiswa.setProdi(resultSet.getString("prodi"));
    mahasiswa.setKosentrasi(resultSet.getString("kosentrasi"));
  }

  @Override
  public Integer add(List<String> dataMahasiswa) throws SQLException, ClassNotFoundException {
    String sql = """
      INSERT INTO mahasiswa (nama, nim, tempat_lahir, tanggal_lahir, email, telepon, prodi, kosentrasi)
      VALUES (?, ?, ?, ?, ?, ?, ?, ?)
      """;
    Connection connection = database.connectionDatabase();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedData(preparedStatement, dataMahasiswa);
    Integer cekSuccess = preparedStatement.executeUpdate();

    connection.close();
    preparedStatement.close();
    return cekSuccess;
  }
  public static PreparedStatement preparedData (PreparedStatement prepare,List<String> dataMahasiswa ) throws SQLException {
    int i = 0;
    for(var mhs : dataMahasiswa) {
      prepare.setString(i+1, dataMahasiswa.get(i));
      i++;
    }
    return prepare;
  }

  public boolean isExist(String nim) throws SQLException, ClassNotFoundException {
    String sql = "SELECT nim FROM mahasiswa WHERE nim = ?";
    Connection connection = database.connectionDatabase();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, nim);
    ResultSet resultSet = preparedStatement.executeQuery();
    if(resultSet.next()){
      return true;
    }else{
      return false;
    }
  }

  @Override
  public boolean update(List<String> dataMahasiswa) throws SQLException, ClassNotFoundException {
    if(isExist(dataMahasiswa.get(1))){
      String sql = """
              UPDATE mahasiswa SET nama = ?,
                                   tempat_lahir = ?,
                                   tanggal_lahir = ?,
                                   email = ? ,
                                   telepon = ?,
                                   prodi = ?,
                                   kosentrasi = ?
              WHERE nim = ?                     
        """;
      Connection connection = database.connectionDatabase();
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      DataMahasiswaUpdate(preparedStatement, dataMahasiswa);
      preparedStatement.executeUpdate();
      return true;
    }else {
      return false;
    }
  }
  public void DataMahasiswaUpdate(PreparedStatement preparedStatement, List<String> dataMahasiswa) throws SQLException {
    preparedStatement.setString(1, dataMahasiswa.get(0));
    preparedStatement.setString(2, dataMahasiswa.get(2));
    preparedStatement.setString(3, dataMahasiswa.get(3));
    preparedStatement.setString(4, dataMahasiswa.get(4));
    preparedStatement.setString(5, dataMahasiswa.get(5));
    preparedStatement.setString(6, dataMahasiswa.get(6));
    preparedStatement.setString(7, dataMahasiswa.get(7));
    preparedStatement.setString(8, dataMahasiswa.get(1));
  }


  public boolean delete(String nim) throws SQLException, ClassNotFoundException {
    if(isExist(nim)) {
      String sql = "DELETE FROM mahasiswa WHERE nim = ?";
      Connection connection = database.connectionDatabase();
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, nim);
      preparedStatement.executeUpdate();
      System.out.println("berhasil");
      return true;
    }else {
      System.out.println("gagal");
      return false;
    }
  }

  public List<Mahasiswa> mahasiswaDetail(String nim) throws SQLException, ClassNotFoundException {
    String sql = "SELECT * FROM mahasiswa WHERE nim = " + nim;
    Connection connection = database.connectionDatabase();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<Mahasiswa> listMahasiswa = new ArrayList<>();
    while (resultSet.next()) {
      Mahasiswa mahasiswa = new Mahasiswa();
      data(resultSet, mahasiswa);
      listMahasiswa.add(mahasiswa);
    }

    statement.close();
    resultSet.close();
    resultSet.close();
    return listMahasiswa;
  }
}