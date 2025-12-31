package board;

import java.util.Arrays;

public class BoardService {
  //매개변수로 전달된 두 게시글 객체 중에서
  //글 번호가 큰 게시글의 제목을 리턴하는 메서드
  public String test1(Board b1, Board b2) {
    return b1.getBoardNum() > b2.getBoardNum() ? b1.getTitle() : b2.getTitle();
  }

  //매개변수로 게시글 객체 두 개가 전달되면
  //두 게시글의 조회수의 합을 리턴
  public int test2(Board b1, Board b2) {
    return b1.getReadCnt() + b2.getReadCnt();
  }

  //매개변수로 글 번호, 제목이 전달되면
  //해당 데이터를 갖는 게시글 객체를 리턴하는 메서드
  public Board test3(int boardNum, String title) {
    return new Board(boardNum, title, "bb", 10);
  }

  //매개변수로 두 개의 게시글 객체가 전달되면
  //두 객체 중 글 번호가 큰 게시글을 리턴하는 메서드
  public Board test4(Board b1, Board b2) {
    return b1.getBoardNum() > b2.getBoardNum() ? b1 : b2;
  }

  //매개변수로 게시글 객체가 여러 개 전달되면
  //매개변수로 전달된 게시글 중 글 번호가 짝수인 게시글만 리턴하는 메서드
  public Board[] test5(Board[] boards) {
    /*return Arrays.stream(boards)
            .filter(board -> board.getBoardNum() % 2 == 0)
            .toArray(Board[]::new);*/
    int cnt = 0;
    for (Board e : boards) {
      if (e.getBoardNum() % 2 == 0) {
        cnt++;
      }
    }

    Board[] result = new Board[cnt];

    int index = 0;
    for (Board e : boards) {
      if (e.getBoardNum() % 2 == 0) {
        result[index] = e;
        index++;
      }
    }

    return result;
  }
}
