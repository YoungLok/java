package verify.exam00;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Set s = new HashSet();
		
		Random r = new Random();
		
		int i=0;
		while ( i !=6) {
			s.add(r.nextInt(45)+1);
			i= ++i;
		}
		
		ArrayList list = new ArrayList(s);
		Collections.sort(list);
		System.out.println(s);
	
	}

}
