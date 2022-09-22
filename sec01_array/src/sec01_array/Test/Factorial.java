package sec01_array.Test;

public class Factorial {

	public static void main(String[] args) {

		final int N = Integer.parseInt(args[0]);
		
		int temp = 1;
		int sum = 1;

		for (int i = 1 ; i <= N; i++) {
			temp = temp * i;
			sum = sum + temp;

		}
		System.out.println(sum);
	}

}
