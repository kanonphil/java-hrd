package test1_13_14;

public class Song {
  String title;
  String artist;
  String album;
  int year;
  String[] composer;

  public Song() {
    composer = new String[3];
  }

  public void initData(String title, String artist, String album, int year, String composer1, String composer2, String composer3) {
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.year = year;
    this.composer[0] = composer1;
    this.composer[1] = composer2;
    this.composer[2] = composer3;
  }

  public void printAllData() {
    System.out.println("노래 제목: " + title);
    System.out.println("가수: " + artist);
    System.out.println("앨범 제목: " + album);
    System.out.println("발표 연도: " + year);
    System.out.print("작곡가: ");
    for (int i = 0; i < composer.length; i++) {
      System.out.print(composer[i]);
      if (i < composer.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
}
