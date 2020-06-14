package atividade;

public class Game {
  int id_game;
  String game_name;
  String genre;
  int year;
  int id_dev;
  int id_distributor;

  public Game() {
  }

  public Game(int id, String game_name, String genre, int year, int id_dev, int id_distributor) {
    setId(id);
    setGameName(game_name);
    setGenre(genre);
    setYear(year);
    setIdDev(id_dev);
    setIdDistributor(id_distributor);
  }

  public int getId() {
    return id_game;
  }

  public void setId(int id_game) {
    this.id_game = id_game;
  }

  public String getGameName() {
    return game_name;
  }

  public void setGameName(String game_name) {
    this.game_name = game_name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getIdDev() {
    return id_dev;
  }

  public void setIdDev(int id_dev) {
    this.id_dev = id_dev;
  }

  public int getIdDistributor() {
    return id_distributor;
  }

  public void setIdDistributor(int id_distributor) {
    this.id_distributor = id_distributor;
  }

  @Override
  public String toString() {
    return "Game [id_game = " + this.id_game + ", game_name = " + this.game_name + ", genre = " + this.genre
        + ", year = " + this.year + ", id_dev = " + this.id_distributor + "]";
  }
}
