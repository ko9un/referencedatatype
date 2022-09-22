package sec01_array.Test;

public class Fibonacci {

	public static void main(String[] args) {

		final int N = Integer.parseInt(args[0]);

		int a1 = 0;
		int a2 = 1;
		int sum = 1;


		for (int i = 1; i <= N; i++) {
		
			System.out.println(sum + " ");
			sum=a1+a2;
			a1=a2;
			a2=sum;

		}

	}

}
