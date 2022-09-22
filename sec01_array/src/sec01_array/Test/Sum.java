package sec01_array.Test;

public class Sum {
	public static void main(String[] args) {

		String n = args[0];

		int num = Integer.parseInt(n);

		int sum = 0;

		for (int i = 0; i < num + 1; i++) {

			sum += i;

		}
		System.out.print(sum);

	}
}
