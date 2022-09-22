package sec01_array.EX09_ReadArrayData_2D;

/*2���� �迭�� ���Ұ� ���*/

public class ReadArrayData_2D {
	public static void main(String[] args) {		
		//#1. 2���� �������� �迭�� ����
		int[][] array1 = new int[2][3];
		System.out.println(array1.length); //2
		System.out.println(array1[0].length); //3 ù��° ���� ����Ű�� 1���� �迭�� ����
		System.out.println(array1[1].length); //3 �ι�° ���� ����Ű�� 1���� �迭�� ����
		System.out.println();
		
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); //2
		System.out.println(array2[0].length); //2 ù��° ���� ����Ű�� 1���� �迭�� ����
		System.out.println(array2[1].length); //3 �ι�° ���� ����Ű�� 1���� �迭�� ����
		System.out.println();
		
		//#2. 2���� �迭�� ��� ���
		System.out.print(array2[0][0]+" ");
		System.out.print(array2[0][1]+" ");
		System.out.println();
		System.out.print(array2[1][0]+" ");
		System.out.print(array2[1][1]+" ");
		System.out.println(array2[1][2]);
		System.out.println();
				
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]+" "); //1,2,3,4,5
			}
			System.out.println();
		}
		System.out.println();
				
		//for(�ϳ��� ���Ҹ� �������� ������ ����:���հ�ü)
		for(int[] array: array2) {
			for(int k:array) {
				System.out.print(k+" ");				
			}
			System.out.println();
		}				
	}
}















