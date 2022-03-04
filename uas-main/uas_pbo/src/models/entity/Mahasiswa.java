package models.entity;

import java.util.List;

public class Mahasiswa {
  private String nama;
  private String nim;
  private String tempat_lahir;
  private String tanggal_lahir;
  private String email;
  private String telepon;
  private String prodi;
  private String kosentrasi;

  public Mahasiswa() {
  }
  public Mahasiswa(List<String> dataMahaiswa) {
    this.nama = dataMahaiswa.get(0);
    this.nim = dataMahaiswa.get(1);
    this.tempat_lahir = dataMahaiswa.get(2);
    this.tanggal_lahir = dataMahaiswa.get(3);
    this.email = dataMahaiswa.get(4);
    this.prodi = dataMahaiswa.get(5);
    this.telepon = dataMahaiswa.get(6);
    this.kosentrasi = dataMahaiswa.get(7);
  }
  public Mahasiswa(String nama, String nim, String tempat_lahir, String tanggal_lahir, String email, String telepon, String prodi, String kosentrasi) {
    this.nama = nama;
    this.nim = nim;
    this.tempat_lahir = tempat_lahir;
    this.tanggal_lahir = tanggal_lahir;
    this.email = email;
    this.telepon = telepon;
    this.prodi = prodi;
    this.kosentrasi = kosentrasi;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNim() {
    return nim;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public String getTempat_lahir() {
    return tempat_lahir;
  }

  public void setTempat_lahir(String tempat_lahir) {
    this.tempat_lahir = tempat_lahir;
  }

  public String getTanggal_lahir() {
    return tanggal_lahir;
  }

  public void setTanggal_lahir(String tanggal_lahir) {
    this.tanggal_lahir = tanggal_lahir;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelepon() {
    return telepon;
  }

  public void setTelepon(String telepon) {
    this.telepon = telepon;
  }

  public String getProdi() {
    return prodi;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public String getKosentrasi() {
    return kosentrasi;
  }

  public void setKosentrasi(String kosentrasi) {
    this.kosentrasi = kosentrasi;
  }
}
