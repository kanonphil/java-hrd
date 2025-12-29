package Test4_2;

import java.util.Scanner;

public class ConcertReservation {
  private Seat sSeats;
  private Seat aSeats;
  private Seat bSeats;
  private Scanner sc;

  public ConcertReservation() {
    sSeats = new Seat("S", 10);
    aSeats = new Seat("A", 10);
    bSeats = new Seat("B", 10);
    sc = new Scanner(System.in);
  }

  public void reserve() {
    System.out.print("좌석구분 S<1>, A<2>, B<3> >> ");
    int grade = sc.nextInt();
    sc.nextLine();

    Seat selectedSeat = null;

    switch (grade) {
      case 1:
        selectedSeat = sSeats;
        break;
      case 2:
        selectedSeat = aSeats;
        break;
      case 3:
        selectedSeat = bSeats;
        break;
      default:
        System.out.println("잘못된 입력입니다.");
        return;
    }

    selectedSeat.show();

    System.out.print("이름>> ");
    String name = sc.nextLine();

    if (sSeats.isNameReserved(name) || aSeats.isNameReserved(name) || bSeats.isNameReserved(name)) {
      System.out.println(name + "님은 이미 에약하셨습니다.");
      return;
    }

    System.out.print("번호>> ");
    int seatNum = sc.nextInt();
    sc.nextLine();

    if (selectedSeat.reserve(name, seatNum)) {
      System.out.println("예약되었습니다.");
    }
  }

  public void inquiry() {
    sSeats.show();
    aSeats.show();
    bSeats.show();
    System.out.println("<<<조회를 완료하였습니다.>>>");
  }

  public void cancel() {
    System.out.print("좌석구분 S<1>, A<2>, B<3> >> ");
    int grade = sc.nextInt();
    sc.nextLine();

    Seat selectedSeat = null;

    switch (grade) {
      case 1:
        selectedSeat = sSeats;
        break;
      case 2:
        selectedSeat = aSeats;
        break;
      case 3:
        selectedSeat = bSeats;
        break;
      default:
        System.out.println("잘못된 입력입니다.");
        return;
    }

    selectedSeat.show();

    System.out.print("이름>> ");
    String name = sc.nextLine();

    if (selectedSeat.cancel(name)) {
      System.out.println("취소되었습니다.");
    }
    else {
      System.out.println(name + "님의 예약을 찾을 수 없습니다.");
    }
  }

  public void run() {
    while (true) {
      System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> >> ");
      int menu = sc.nextInt();
      sc.nextLine();

      switch (menu) {
        case 1:
          reserve();
          break;
        case 2:
          inquiry();
          break;
        case 3:
          cancel();
          break;
        case 4:
          System.out.println("프로그램을 종료합니다.");
          sc.close();
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
