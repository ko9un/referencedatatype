package sec01_array.EX10_ArgumentOfMainMethod;

/*main �޼������ �Ű����� ����*/

public class ArgumentOfMainMethod {
	public static void main(String[] args) {		
		//#1. args �迭�� ���� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//#2. �Ű����� ��� 1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//System.out.println(Integer.parseInt(args[1])+1); //4??? 31
		System.out.println();		
		
		//#3. �Ű����� ��� 2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();		
	}
}
