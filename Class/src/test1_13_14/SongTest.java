package test1_13_14;

public class SongTest {
  public static void main(String[] args) {
    Song song = new Song();

    song.initData("title1", "artist1", "album1", 2022,
            "composer1", "composer2", "composer3");
    song.printAllData();
  }
}
