/**
 * 
 */
package sec06.exam01_array_by_list;

/**
 * @author user
 *
 */
public class ArrayCreatedByValueListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87,51,231,541,22,33,445,884};
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		
		int sum = 0;
		//sum = scores[0] + scores[1] + scores [2];
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("รัวี:"+sum);
	}

}
