package exercise3;

public class Program1 {

	public static void main(String[] args) {
		int[] numArray = new int[15];
		
		int[] alpha = numArray;
		
		System.out.println(alpha[10]);
		
		alpha[4] = 35;
		
		alpha[8] = alpha[5] + alpha[12];
	}
}
