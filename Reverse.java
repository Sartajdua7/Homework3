package homework3;

public class Reverse {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 6, 5, 4, 7, 8};
		for(int r: reverseIndex(x, 3, 5)) {
			System.out.println(r);
		}
	}
	
	
	public static int[] reverseIndex(int[] x, int a, int b) {
		if(a >= b) {
			return x;
		}
		
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
		
		return reverseIndex(x, a + 1, b -1);
		
	}
}
