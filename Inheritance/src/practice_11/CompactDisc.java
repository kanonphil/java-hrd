package practice_11;

public class CompactDisc extends Product {
  private String albumTitle;
  private String singer;

  public CompactDisc(int productId, String description, String producer, int price, String albumTitle, String singer) {
    super(productId, description, producer, price);
    this.albumTitle = albumTitle;
    this.singer = singer;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("앨범 제목: " + albumTitle);
    System.out.println("가수: " + singer);
  }
}