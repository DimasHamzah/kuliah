package testing;

import views.Input_User;

public class viewTest {
  public static void main(String[] args) {
    testViewInput();
  }
  public static void testViewInput() {
    Input_User.inputDataMahasiswa();
  }
  public static void testViewRead() {
    Input_User.readDataMahasiswa();
  }
  public static void testViewUpdate() {
    Input_User.updateDataMahasiswa();
  }
  public static void testViewDelte() {
    Input_User.deleteDataMahasiswa();
  }
}
