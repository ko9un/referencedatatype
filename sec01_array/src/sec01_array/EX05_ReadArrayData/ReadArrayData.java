package sec01_array.EX05_ReadArrayData;

/*1���� �迭�� ���Ұ� ���*/

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {		
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//#1. �迭�� ���� ���ϱ�
		System.out.println(array.length); //5		
		
		//#2. ����ϱ� 1:
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		System.out.println();
		
		//#3. ����ϱ� 2:
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		//#4. ����ϱ� 3:
		//for(���� �ϳ��� ���Ҹ� ������ �� �ִ� ����:���հ�ü) {} for each ����
		for(int k : array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//#5. ����ϱ� 4 :
		System.out.println(Arrays.toString(array));
	}
}