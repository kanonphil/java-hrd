package practice_11;

import java.util.Scanner;

public class ProductInfo {
  private Product[] products;
  private int productCount;
  private Scanner sc;

  public ProductInfo() {
    this.products = new Product[10];
    this.productCount = 0;
    this.sc = new Scanner(System.in);
  }

  //상품 추가
  public void addProduct() {
    if (productCount >= 10) {
      System.out.println("더 이상 상품을 추가할 수 없습니다.");
      System.out.println();
      return;
    }
    //상품종류
    System.out.print("상품 종류: 책(1), 음악CD(2), 회화책(3) >> ");
    int productType = sc.nextInt();
    sc.nextLine();

    switch (productType) {
      case 1:
        addBook();
        break;
      case 2:
        addCompactDisc();
        break;
      case 3:
        addConversationBook();
        break;
      default:
        System.out.println("잘못된 입력입니다.");
        System.out.println();
    }
  }

  //책 추가
  public void addBook() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String producer = sc.nextLine();
    System.out.print("가격 >> ");
    int price = sc.nextInt();
    sc.nextLine();
    System.out.print("책 제목 >> ");
    String title = sc.nextLine();
    System.out.print("저자 >> ");
    String author = sc.nextLine();
    System.out.print("ISBN >> ");
    String isbn = sc.nextLine();

    products[productCount] = new Book(productCount, desc, producer, price, isbn, author, title);
    productCount++;
    System.out.println("책이 추가되었습니다.");
    System.out.println();
  }

  //CD 추가
  public void addCompactDisc() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String producer = sc.nextLine();
    System.out.print("가격 >> ");
    int price = sc.nextInt();
    sc.nextLine();
    System.out.print("앨범 제목 >> ");
    String title = sc.nextLine();
    System.out.print("가수 >> ");
    String singer = sc.nextLine();

    products[productCount] = new CompactDisc(productCount, desc, producer, price, title, singer);
    productCount++;
    System.out.println("CD가 추가되었습니다.");
    System.out.println();
  }

  //회화책 추가
  public void addConversationBook() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String producer = sc.nextLine();
    System.out.print("가격 >> ");
    int price = sc.nextInt();
    sc.nextLine();
    System.out.print("책 제목 >> ");
    String title = sc.nextLine();
    System.out.print("저자 >> ");
    String author = sc.nextLine();
    System.out.print("언어 >> ");
    String language = sc.nextLine();
    System.out.print("ISBN >> ");
    String isbn = sc.nextLine();

    products[productCount] = new ConversationBook(productCount, desc, producer, price, isbn, author, title, language);
    productCount++;
    System.out.println("회화책이 추가되었습니다.");
    System.out.println();
  }

  //모든 상품 조회
  public void printAll() {
    if (productCount == 0) {
      System.out.println("등록된 상품이 없습니다.");
      System.out.println();
      return;
    }

    for (int i = 0; i < productCount; i++) {
      products[i].printInfo();
      System.out.println();
    }
  }

  //실행
  public void run() {
    while (true) {
      System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          addProduct();
          break;
        case 2:
          printAll();
          break;
        case 3:
          System.out.println("프로그램을 종료합니다.");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }

  public static void main(String[] args) {
    ProductInfo productInfo = new ProductInfo();
    productInfo.run();
  }
}
