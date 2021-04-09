package verify.exam00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList();
	}

	// �� �Է� ó�� �޼ҵ�
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ���:");
		String register = sc.next();
		System.out.print("�̸���:");
		String email = sc.next();
		System.out.print("��й�ȣ:");
		String passwd = sc.next();
		System.out.print("����:");
		String subject = sc.next();
		System.out.print("�۳���:");
		String content = sc.next();
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	// �� �ۼ�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۸�� ���
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
		}

	}

	// ������ ���� �ۼ��� �� ��й�ȣ �Է��ϴ� �޼ҵ�
	public void removeArticle(Scanner sc) {
		// �ڵ� �ۼ�
		if (boardList.size() > 0) {
			System.out.println(" ������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���");
			System.out.print("�ۼ���:");
			String register = sc.next();
			System.out.print("��й�ȣ:");
			String passwd = sc.next();
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register) && boardList.get(i).getPasswd().equals(passwd)) {
					boardList.remove(i);
					System.out.println("���������� ���� �����Ǿ����ϴ�");
				} else {
					System.out.println("�ۼ��� Ȥ�� ��й�ȣ�� Ȯ���ϼ���");
				}

			}

		}else {
			System.out.println("��ϵ� ���� �����ϴ�");
		
		}
	}
}
