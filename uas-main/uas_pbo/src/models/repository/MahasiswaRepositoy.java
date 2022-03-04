package models.repository;

import models.entity.Mahasiswa;

import java.sql.SQLException;
import java.util.List;

public interface MahasiswaRepositoy {
  List<Mahasiswa> getAll() throws SQLException, ClassNotFoundException;

  Integer add(List<String> mahasiswas) throws SQLException, ClassNotFoundException;

  boolean update(List<String> dataMahasiswa) throws SQLException, ClassNotFoundException;

  boolean delete(String nim) throws SQLException, ClassNotFoundException;

  List<Mahasiswa> mahasiswaDetail(String nim) throws SQLException, ClassNotFoundException;
}
