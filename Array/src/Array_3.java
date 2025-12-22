public class Array_3 {
  public static void main(String[] args) {
    //배열의 또다른 생성 방법(실무에서는 잘 안 씀)

    int[] arr1 = new int[5];

    //0이 아닌 다른 정수로 초기화된 배열을 생성할 수 없을까?
    // -> 배열 생성과 동시에 원하는 값으로 초기화하기
    // 1,3,5로 초기화 된 정수형 배열을 선언 및 생성
    int[] arr2 = {1, 3, 5};

    // 5.5, 6.6, 7.7로 초기화 된 실수형 배열을 선언 및 생성
    double[] arr3 = {5.5, 6.6, 7.7};

    //java, python, c++ 세 문자열로 초기화 된 배열을 선언 및 생성
    String[] arr4 = {"java", "python", "c++"};

    //특정 값으로 초기화 된 배열을 생성할 때는 반드시 선언 및 생성을 동시에 진행해야 한다.
    int[] arr5;
    //arr5 = {1,2,3}; -> 오류

    //배열의 크기(배열에 저장된 데이터의 수)를 확인할 수 있는 명령어
    //배열.length 명령어로 배열의 크기를 확인할 수 있음
    int[] arr6 = new int[8];
    System.out.println(arr6.length);
  }
}
