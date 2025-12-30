package array;

public class AccTest1 {
  public static void main(String[] args) {
    Acc[] arr = new Acc[3];
    arr[0] = new Acc("Hong", "1111", 10000);
    arr[1] = new Acc("Kim", "2222", 20000);
    arr[2] = new Acc("Lee", "3333", 15000);

    System.out.println(arr[0]);

    //문제1. 배열의 0번째 요소에 저장한 계좌의 예금액을 출금
    System.out.println(arr[0].getBalance());

    //문제2. 배열의 0번째 요소에 예금액 넣기
    arr[0].setBalance(15000);

    //문제3. 배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum = 0;
    for (Acc acc : arr) {
      sum += acc.getBalance();
    }
    System.out.println(sum);

    //문제4. 배열에 저장된 계좌정보 중 계좌번호가 "2222"인 계좌를 찾고,
    //      해당 계좌의 계좌주를 출력
    for (Acc acc : arr) {
      if (acc.getAccNumber().equals("2222")) {
        System.out.println(acc.getOwner());
      }
    }
  }
}
