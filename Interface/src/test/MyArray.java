package test;

public class MyArray implements ArrayUtil {
  @Override
  public int getArraySum(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i : arr1) {
      sum += i;
    }
    for (int i : arr2) {
      sum += i;
    }
    return sum / arr1.length + arr2.length;
  }

  @Override
  public boolean isEvenArray(int[] arr) {
    for (int i : arr) {
      if (i % 2 != 0) {
        return false;
      }
    }
    return true;
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
