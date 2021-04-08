package verify.exam00;

import java.util.ArrayList;

import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList();
	}

	// 글 입력 처리 메소드
	public void writeArticle(Scanner sc) {
		System.out.println("게시판에 글을 작성 하세요.");
		System.out.print("작성자:");
		String register = sc.next();
		System.out.print("이메일:");
		String email = sc.next();
		System.out.print("비밀번호:");
		String passwd = sc.next();
		System.out.print("제목:");
		String subject = sc.next();
		System.out.print("글내용:");
		String content = sc.next();
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	// 글 작성
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 글목록 출력
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
		}

	}

	// 삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc) {
		// 코드 작성
		if (boardList.size() > 0) {
			System.out.println(" 삭제할 글의 작성자와 비밀번호를 입력하세요");
			System.out.print("작성자:");
			String register = sc.next();
			System.out.print("비밀번호:");
			String passwd = sc.next();
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register) && boardList.get(i).getPasswd().equals(passwd)) {
					boardList.remove(i);
					System.out.println("성공적으로 글이 삭제되었습니다");
				} else {
					System.out.println("작성자 혹은 비밀번호를 확인하세요");
				}

			}

		}else {
			System.out.println("등록된 글이 없습니다");
		}
	}
}
