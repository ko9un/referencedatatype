package sec02_string.EX03_SharingStringObject;

/*���ڿ� ���ͷ��� ���� ���� ���ڿ� ��ü�� ����*/

public class SharingStringObject {
	public static void main(String[] args) {		
		//#1. ���ڿ� ��ü ���� (���ͷ��� ��ü�� ������ ���) new Ű����� ��ü ������ ��� (������ ��ü ����) ����X		
		String str1 = new String("�ȳ�");
		String str2 = "�ȳ�";
		String str3 = "�ȳ�";
		String str4 = new String("�ȳ�");
		
		//@stack �޸� �� ��� (==)
		System.out.println(str1==str2); //false
		System.out.println(str2==str3); //true
		System.out.println(str3==str4); //false
		System.out.println(str4==str1); //false
	}
}
