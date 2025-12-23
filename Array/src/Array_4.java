public class Array_4 {
  public static void main(String[] args) {
    //배열이 자료형이라는 의미
    int[] a1 = {1,2,3};
    //String[] a2 = a1; a1과 a2는 자료형이 다르다!!
    int[] a = new int [1]; // a에는 값이 아니라 주소값이 저장되어 있음 (기본자료형 빼고 전부 이럼)
    int[] b = a; // b는 a의 값(주소값)을 가짐
    a[0] = 3;
    System.out.println(a[0]);
    System.out.println(b[0]); // 값을 바꿔도 b가 가진 주소값은 같기에 똑같이 나옴


    // int[] a3 = a1;

    //int a = 5;
    //int b = a;
  }
}
