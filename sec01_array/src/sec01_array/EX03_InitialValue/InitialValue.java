package sec01_array.EX03_InitialValue;

/*���ø޸��� �ʱⰪ�� �����ڷ����� �����ʱⰪ*/

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {		
		//#1. stack �޸𸮰� (�����ʱ�ȭ ���� ����)
		int value1;
//		System.out.println(value1);//����
		int[] value2;
//		System.out.println(value2);//����
		
		int value3 = 0;
		System.out.println(value3); //0
		int[] value4 = null;
		System.out.println(value4); //null
		System.out.println();
		
		//#2. heap �޸��� �ʱⰪ (�����ʱ�ȭ)
		//@�⺻�ڷ��� �迭
		boolean[] array1 = new boolean[3]; //false�� �ʱ�ȭ
		for(int i=0; i<3; i++) {
			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; //0���� �ʱ�ȭ
		for(int i=0; i<3; i++) {
			System.out.print(array2[i]+ " ");
		}
		System.out.println();
		
		double[] array3 = new double[3]; //0.0���� �ʱ�ȭ
		for(int i=0; i<3; i++) {
			System.out.print(array3[i]+ " ");
		}
		System.out.println();
		
		//@�����ڷ��� �迭
		String[] array4 = new String[3]; //null���� �ʱ�ȭ
		for(int i=0; i<3; i++) {
			System.out.print(array4[i]+ " ");
		}
		System.out.println();
		System.out.println();
		
		//Tip. �迭�� ���� ����� �� �ִ� ���
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));		
	}
}