package verify.exam01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		for(int i=1;i<=3;i++) {
			list.add(new Board("����"+i,"����"+i));
			
		}
		return list;
		
		
	}
}
