package recursive;

public class Recursion {
	public static void main (String [] args) {
		System.out.println(fibonacci(5));
	}
	
	public static int fibonacci(int x) {
		if(x<1)
			return 1;
		else {
			return x + fibonacci(x-4) + fibonacci(x-1);
		}
	}
}
