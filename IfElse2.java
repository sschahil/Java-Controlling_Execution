//Exercise 3-6

public class IfElse2 {
	
	static int test(int testval, int target, int begin, int end) {
		if(testval > target && (testval <= end && testval >= begin))
			return +1;
		else if(testval < target && (testval <= end && testval >= begin))
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(test(10,5,0,9));
		System.out.println(test(5,10,0,10));
		System.out.println(test(5,5,0,20));
	}
}
