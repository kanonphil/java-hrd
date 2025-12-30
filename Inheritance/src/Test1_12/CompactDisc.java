package Test1_12;

public class CompactDisc extends Product {
  private String albumTitle;
  private String singerName;

  public CompactDisc(int productId, String description, String manufacturer, int price,
                     String albumTitle, String singerName) {
    super(productId, description, manufacturer, price);
    this.albumTitle = albumTitle;
    this.singerName = singerName;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("앨범 제목 >> " + albumTitle);
    System.out.println("가수 이름 >> " + singerName);
  }

  public String getAlbumTitle() {
    return albumTitle;
  }

  public String getSingerName() {
    return singerName;
  }
}
