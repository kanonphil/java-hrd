package Test1_12;

import java.util.Scanner;

public class ProductInfo {
  private static Product[] products = new Product[10];
  private static int productsCount = 0;
  private static Scanner sc = new Scanner(System.in);

  private static void addProductMenu() {
    if (productsCount >= 10) {
      System.out.println("더이상 상품을 추가할 수 없습니다. (최대 10개)");
      return;
    }

    System.out.println("\n상품 종류 책<1>, 음악CD<2>, 회화책<3> >> ");
    int productType = sc.nextInt();
    sc.nextLine();

    switch (productType) {
      case 1:
      case 2:
      case 3:
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
    System.out.print("ISBN");
  }

  public static void main(String[] args) {
    while (true) {
      System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >> ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
        case 2:
        case 3:
        default:
          System.out.println("잘못된 선택입니다.");
      }

    }
  }
}
