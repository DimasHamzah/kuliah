package sistem;

import java.sql.SQLException;
import java.util.List;

public interface Controller_sistem {

  void createDataMahasiswa(List<String> data) throws SQLException, ClassNotFoundException;

  void readDataMahasiswa() throws SQLException, ClassNotFoundException;

  void updateDataMahasiswa(List<String> dataMhs) throws SQLException, ClassNotFoundException;

  void deleteDataMahasiswa(String nim) throws SQLException, ClassNotFoundException;

  void detailMahasiswa(String nim) throws SQLException, ClassNotFoundException;
}
