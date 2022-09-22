package sec01_array.EX02_ValuAssignment;

public class ValuAssignment {

	public static void main(String[] args) {
		// 배열의 값 대입 방법1
		int[] ary1 = new int[3];
		ary1[0] = 3;
		ary1[1] = 4;
		ary1[2] = 5;
		System.out.println(ary1[0] + " " + ary1[1] + " " + ary1[2]);

		int[] ary2;
		ary2 = new int[3];
		ary2[0] = 3;
		ary2[1] = 4;
		ary2[2] = 5;
		System.out.println(ary2[0] + " " + ary2[1] + " " + ary2[2]);

		// 배열의 값 대입 방법2
		int[] ary3 = new int[] { 3, 4, 5 };
		System.out.println(ary3[0] + " " + ary3[1] + " " + ary3[2]);

		int[] ary4;
		ary4 = new int[] { 3, 4, 5 };
		System.out.println(ary4[0] + " " + ary4[1] + " " + ary4[2]);

		// 배열의 값 대입 방법3
		int[] ary5 = { 3, 4, 5 };
		System.out.println(ary5[0] + " " + ary5[1] + " " + ary5[2]);

		// int[] ary6;
		// ary6 = {3,4,5}; 불가능
		//
	}

}
