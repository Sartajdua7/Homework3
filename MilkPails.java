package homework3;

import java.util.Scanner;

public class MilkPails {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int m = scan.nextInt();
		int max = 0;
		for(int i = 0; i * x < m; i++) {
			for(int r = 0; r * y < m; r++) {
				if((i * x) + (r * y) > max && (i * x) + (r * y) <= m) {
					max = (i * x) + (r * y);
				}
			}
		}
		System.out.println(max);
		
	}

}
