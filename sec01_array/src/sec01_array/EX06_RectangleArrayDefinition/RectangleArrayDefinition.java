package sec01_array.EX06_RectangleArrayDefinition;

/*2���� �迭�� �� ���� �������� �پ��� �迭 ����*/

public class RectangleArrayDefinition {
	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		//#1. �迭�� ���� ��� 1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//#2. �迭�� ���� ��� 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		
		//#3. �迭�� ���� ��� 3
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6 = new int[3][4];
		
		//#4. �پ��� �迭 ���� (�⺻�ڷ��� �迭, �����ڷ��� �迭)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; //�����ڷ��� �迭		
	}
}



