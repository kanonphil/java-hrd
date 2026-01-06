package test;

public class MyArray implements ArrayUtil {
  @Override
  public int getArraySum(int[] arr1, int[] arr2) {
    int sum1 = 0;
    int sum2 = 0;
    for (int i : arr1) {
      sum1 += i;
    }
    for (int i : arr2) {
      sum2 += i;
    }
    return (sum1 + sum2) / arr1.length + arr2.length;
  }

  @Override
  public boolean isEvenArray(int[] arr) {
    boolean isAllEven = true;
    for (int i : arr) {
      if (i % 2 != 0) {
        isAllEven = false;
        break;
      }
    }
    return isAllEven;
  }

  @Override
  public int[] getStrLengthArray(String[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i].length();
    }
    return result;
  }
}
