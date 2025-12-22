public class Array_2 {
  public static void main(String[] args) {
    //배열 값 읽고 쓰기

    //실수를 3개 저장할 수 있는 배열 arr1을 선언 및 생성
    double[] arr1 = new double[3];

    //arr1 배열에 저장된 데이터를 출력
    //배열 변수를 출력하면 이상한 데이터가 나온다.
    System.out.println(arr1);

    //배열을 출력할 때는 명확히 몇 번째 요소를 출력할지 코드로 작성해야 함.
    System.out.println(arr1[0]);

    //정수를 10개 저장할 수 있는 배열 arr2를 선언 및 생성
    int[] arr2 = new int[10];

    //arr2 배열의 모든 요소의 값을 출력하세요.
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    System.out.println();

    //arr2 배열의 0번째 요소에 5를 저장
    arr2[0] = 5;

    //arr2 배열의 모든 요소에 3을 저장
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = 3;
      System.out.println("arr2[" + i + "] = " + arr2[i]);
    }
  }
}
