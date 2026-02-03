import java.time.OffsetDateTime;
import java.util.stream.IntStream;

public class Solution {
  public static void main(String[] args) {
  }

  public int solution(int n) {
    int answer = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        answer += i;
      }
    }
    return answer;
  }
}
