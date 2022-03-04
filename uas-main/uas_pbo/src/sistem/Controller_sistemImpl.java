package sistem;

import models.entity.Mahasiswa;
import models.repository.MahasiswaRepositoy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Controller_sistemImpl implements Controller_sistem{

  private MahasiswaRepositoy mahasiswaRepositoy;
  private Mahasiswa mahasiswa;

  public Controller_sistemImpl(MahasiswaRepositoy mahasiswaRepositoy) {
    this.mahasiswaRepositoy = mahasiswaRepositoy;
  }

  public void createDataMahasiswa(List<String> listDataMahasiswa) throws SQLException, ClassNotFoundException {
    Mahasiswa mahasiswa = new Mahasiswa(listDataMahasiswa);
    Integer success = mahasiswaRepositoy.add(listDataMahasiswa);
    cekAddDataMahasiswa(success);
  }
  public void cekAddDataMahasiswa(Integer success) {
    if(success > 0) {
      System.out.println("sukses menambah data");
    }else{
      System.out.println("gagal menbamh data");
    }
  }

  public void readDataMahasiswa() throws SQLException, ClassNotFoundException {
    List<Mahasiswa> modelMahasiswa = mahasiswaRepositoy.getAll();

    for(Mahasiswa mhs : modelMahasiswa) {
      dataMahasiswa(mhs);
    }
  }
  public static void dataMahasiswa(Mahasiswa mhs) {
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

  @Override
  public void updateDataMahasiswa(List<String> dataMhs) throws SQLException, ClassNotFoundException {
    boolean success = mahasiswaRepositoy.update(dataMhs);
    if(success){
      System.out.println("SUKSES MENGUPDATE DATA ");
      detailMahasiswa(dataMhs.get(1));
    }else{
      System.out.println("GAGAL UPDATE DATA");
    }
  }

  @Override
  public void deleteDataMahasiswa(String nim) throws SQLException, ClassNotFoundException {
    detailMahasiswa(nim);
    boolean success = mahasiswaRepositoy.delete(nim);
    if(success){
      System.out.println("DATA MAHASISWA SUKSES DIHAPUS");
    }else{
      System.out.println("GAGAL MENGHAPUS DATA");
    }
  }

  @Override
  public void detailMahasiswa(String nim) throws SQLException, ClassNotFoundException {
    List<Mahasiswa> modelMahasiswa = mahasiswaRepositoy.mahasiswaDetail(nim);

    for(Mahasiswa mhs : modelMahasiswa) {
      dataMahasiswa(mhs);
    }
  }
}
