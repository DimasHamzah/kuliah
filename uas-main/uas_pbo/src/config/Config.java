package config;

public class Config {
  private static String driver = "com.mysql.cj.jdbc.Driver";
  private static  String user = "root";
  private static String pass = "";
  private static String jdbc = "jdbc:mysql://localhost:3306/uas";

  public static String getDriver() {
    return driver;
  }

  public static String getUser() {
    return user;
  }

  public static String getPass() {
    return pass;
  }

  public static String getJdbc() {
    return jdbc;
  }
}
