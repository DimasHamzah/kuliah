package models.core;

import config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database extends Config {

  public Connection connectionDatabase() throws SQLException, ClassNotFoundException {
    Class.forName(Config.getDriver());
    Connection connection = Connect(dataConnect());
    return connection;
  }

  private static Connection Connect(List<String> conn) throws SQLException {
    Connection connection = DriverManager.getConnection(conn.get(0), conn.get(1), conn.get(2));
    return connection;
  }

  private static List<String> dataConnect() {
    List<String> dataConnection = new ArrayList<>();
    dataConnection.addAll(Arrays.asList(Config.getJdbc(), Config.getUser(), Config.getPass()));
    return dataConnection;
  }

}
