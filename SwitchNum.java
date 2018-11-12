package homework3;

public class SwitchNum {
public static void main(String[] args) {
	System.out.println("IMPORTANT" + (34 * Math.pow(10,  2)));
	System.out.println(swapNum(123456));
	
}

public static int swapNum(int x) {
	int counter = 0;
	int finalAnswer = 0;
	while(x > 0) {
		int sub = x % 100;
		System.out.println(sub);
		x /= 100;
		System.out.println(x);

		int r = sub % 10 * 10;
		int y = sub/10;
		int answer = r + y;
		System.out.println("Answer: " + answer);

		finalAnswer += (int) (answer * (Math.pow(10, counter)));
		System.out.println("final answer: " + finalAnswer);
		counter += 2;
	}
	return finalAnswer;
}
}
