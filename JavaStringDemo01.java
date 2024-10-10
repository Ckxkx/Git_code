package JavaStringDemo;

import java.util.Scanner;

public class JavaStringDemo01 {
	public static void main(String[] args) {
		
//		String message = "Welcome to Java";
//		System.out.println("The length of " + message + " is " + message.length());
//
//
//		String s1 = "I like ";
//		String s2 = "Zhu";
//
//		String s3 = s1.concat(s2);
//		System.out.println(s3);
//
//		System.out.println("-----------------");
//		String s4 = s1 + s2;
//		System.out.println(s4);
		
		
		Scanner input = new Scanner(System.in);
		
//		遇到空格，换行符等等转义字符即停止读入
//		String str1 = input.next();
//		System.out.println(str1);

//		读取完整字符串
//		String str2 = input.nextLine();
//		System.out.println(str2);
//
		
//		String s5 = "welcome to java";
//		String s6 = "welcome to C++";
//		System.out.println(s5.equals(s6));
//
//		int i = s5.compareTo(s6);//返回Unicode的差值
//		System.out.println(i);
		
		
		String s1 = input.toString();
		System.out.println(s1);
	}
}
