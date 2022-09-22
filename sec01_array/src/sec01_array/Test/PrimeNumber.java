package sec01_array.Test;

public class PrimeNumber {
	public static void main(String[] args) {

		final int N = Integer.parseInt(args[0]);

		for (int i = 2; i < N; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					c = c + 1;
			}
			if (c==2)
				System.out.print(i+" ");
		}

	}
}
