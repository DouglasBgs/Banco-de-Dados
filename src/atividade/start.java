package atividade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class start {
  public static void main(String[] args) {
    String connectionUrl = "jdbc:sqlserver://mssql914.umbler.com,5003;databaseName=testes;user=douglas;password=douglas123";
    try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
      String SQL = "SELECT * FROM game g INNER JOIN distributor d ON d.id_distributor = g.id_distributor INNER JOIN dev ON dev.id_dev = g.id_dev";
      ResultSet rs = stmt.executeQuery(SQL);

      while (rs.next()) {
        Game game = new Game();
        game.setId(rs.getInt("id_game"));
        game.setGameName(rs.getString("game_name"));
        game.setYear(rs.getInt("year"));
        game.setGenre(rs.getString("genre"));
        game.setIdDistributor(rs.getInt("id_distributor"));
        game.setIdDev(rs.getInt("id_dev"));

        System.out.println(game);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
