package Test1_12;

import java.util.Scanner;

public class ProductInfo {
  private static Product[] products = new Product[10];
  private static int productCount = 0;
  private static Scanner sc = new Scanner(System.in);

  private static void addProductMenu() {
    if (productCount >= 10) {
      System.out.println("더이상 상품을 추가할 수 없습니다. (최대 10개)");
      return;
    }

    System.out.print("상품 종류 책<1>, 음악CD<2>, 회화책<3> >> ");
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
    }
  }

  private static void addBook() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String manu = sc.nextLine();
    System.out.print("가격 >> ");
    int price = sc.nextInt();
    sc.nextLine();
    System.out.print("책 제목 >> ");
    String title = sc.nextLine();
    System.out.print("저자 >> ");
    String author = sc.nextLine();
    System.out.print("ISBN >> ");
    String isbn = sc.nextLine();

    products[productCount] = new Book(productCount, desc, manu, price, isbn, author, title);
    productCount++;
    System.out.println("책이 추가되었습니다.");
  }

  private static void addCompactDisc() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String manu = sc.nextLine();
    System.out.print("가격 >> ");
    int price = sc.nextInt();
    sc.nextLine();
    System.out.print("앨범 제목 >> ");
    String album = sc.nextLine();
    System.out.print("가수 >> ");
    String singer = sc.nextLine();

    products[productCount] = new CompactDisc(productCount, desc, manu, price, album, singer);
    productCount++;
    System.out.println("음악CD가 추가되었습니다.");
  }

  private static void addConversationBook() {
    System.out.print("상품 설명 >> ");
    String desc = sc.nextLine();
    System.out.print("생산자 >> ");
    String manu = sc.nextLine();
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

    products[productCount] = new ConversationBook(productCount, desc, manu, price,
                                                  isbn, author, title, language);
    productCount++;
    System.out.println("회확책이 추가되었습니다.");
  }

  private static void printAllProducts() {
    if (productCount == 0) {
      System.out.println("등록된 상품이 없습니다.");
      return;
    }

    for (int i = 0; i < productCount; i++) {
      products[i].printInfo();
      System.out.println();
    }
  }

  public static void main(String[] args) {
    while (true) {
      System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >> ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          addProductMenu();
          break;
        case 2:
          printAllProducts();
          break;
        case 3:
          System.out.println("프로그램을 종료합니다.");
          sc.close();
          return;
        default:
          System.out.println("잘못된 선택입니다.");
      }

    }
  }
}
