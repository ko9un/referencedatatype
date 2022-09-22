package sec01_array.Test;

public class MultipleOf3 {
	
	public static void main(String[] args) {
		
		String n = args[0];
		
	 

		int num = Integer.parseInt(n);

		 

		for (int i = 1 ; i <= num  ; i++) {

			if (i%3 != 0)
			continue;
			System.out.print(i+" ");

		}
	

	
	}

}
