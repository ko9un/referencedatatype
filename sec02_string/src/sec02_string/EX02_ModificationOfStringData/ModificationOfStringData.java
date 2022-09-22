package sec02_string.EX02_ModificationOfStringData;

/*String ��ü�� ���ڿ� ���� �� �ٸ� �����ڷ������� ��*/

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {		
		//#1. ���ڿ� ���� (��ü���� ���뺯�� �Ұ� --> ���ο� ��ü ����)
		String str1 = new String("�ȳ�");
		String str2 = str1;
		
		str1="�ȳ��ϼ���";
		
		System.out.println(str1); //�ȳ��ϼ���
		System.out.println(str2); //�ȳ�
		
		//@�迭 �����ڷ���
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1)); //[6, 7, 8]
		System.out.println(Arrays.toString(array2)); //[6, 7, 8]
	}
}
