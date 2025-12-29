package Test4_2;

public class Seat {
  private String[] seats;
  private String grade;

  public Seat(String grade, int size) {
    this.grade = grade;
    this.seats = new String[size];
    for (int i = 0; i < size; i++) {
      seats[i] = "---";
    }
  }

  public void show() {
    System.out.print(grade + ">> ");
    for (String seat : seats) {
      System.out.print(seat + " ");
    }
    System.out.println();
  }

  public boolean reserve(String name, int seatNum) {
    if (seatNum < 1 || seatNum > seats.length) {
      System.out.println("좌석 번호가 잘못되었습니다.");
      return false;
    }

    if (!seats[seatNum - 1].equals("---")) {
      System.out.println("이미 예약된 좌석입니다.");
      return false;
    }

    seats[seatNum - 1] = name;
    return true;
  }

  public boolean cancel(String name) {
    for (int i = 0; i < seats.length; i++) {
      if (seats[i].equals(name)) {
        seats[i] = "---";
        return true;
      }
    }
    return false;
  }

  public boolean isNameReserved(String name) {
    for (String seat : seats) {
      if (seat.equals(name)) {
        return true;
      }
    }
    return false;
  }
}
