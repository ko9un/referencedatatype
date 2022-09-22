package sec02_string.EX05_MethodsOfString_1;

/*String Ŭ������ �ֿ� �޼���1*/

import java.util.Arrays;

public class MethodsOfString_1 {
	public static void main(String[] args) {		
		//#1. ���ڿ����� (length())
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		System.out.println(str1.length()); //11
		System.out.println(str2.length()); //13
		System.out.println();
		
		//#2. ���ڿ� �˻� (charAt(), indexOf(), lastIndexOf())
		//@charAt()
		System.out.println(str1.charAt(1)); //e
		System.out.println(str2.charAt(1)); //��
		System.out.println();
		
		//@indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a')); //9
		System.out.println(str1.indexOf('a', 8)); //9
		System.out.println(str1.lastIndexOf('a', 8)); //7
		System.out.println(str1.indexOf("Java")); //6
		System.out.println(str1.lastIndexOf("Java")); //6
		System.out.println(str2.indexOf("�ϼ���")); //2
		System.out.println(str2.lastIndexOf("�ϼ���")); //2
		System.out.println(str1.indexOf("Bye")); //-1
		System.out.println(str2.lastIndexOf("�����ϴ�.")); //-1
		System.out.println();
		
		//#3. ���ڿ� ��ȯ �� ���� (String.valueOf(), concat())
		//@String.valueOf(�⺻�ڷ���) �⺻�ڷ���->String
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//@concat()
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		//String.valueOf() + concat() => + 
		String str6 = "�ȳ�" + 3; //�ȳ�3
		String str7 = "�ȳ�".concat(String.valueOf(3)); //�ȳ�3
		
		
		//#4. ���ڿ� ->byte[] (getBytes()) , ���ڿ� -> char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "�ȳ��ϼ���";
		
		//@ getBytes() ���ڿ� ->byte[]
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//@ toCharArray() ���ڿ� -> char[]
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}	















