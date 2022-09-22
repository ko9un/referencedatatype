package sec01_array.EX04_PrimaryAndReferenceType;

/*�⺻�ڷ��� vs. �����ڷ����� Ư¡ ��*/

public class PrimaryAndReferenceType {
	public static void main(String[] args) {		
		//#1. �⺻�ڷ����� ���Կ��� (stack �� ����)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1); //3
		System.out.println(value2); //7
		System.out.println();
		
		//#2. �����ڷ����� ���Կ��� (stack �� ����)
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		array2[0]=7;
		System.out.println(array1[0]); //7
		System.out.println(array2[0]); //7		
	}
}