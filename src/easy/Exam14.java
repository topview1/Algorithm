package easy;

import java.util.Scanner;

/**
 * 输入两个字符串，将其合并为一个字符串后输出。
输入格式
　　输入两个字符串
输出格式
　　输出合并后的字符串
样例输入
一个满足题目要求的输入范例。
Hello

World
样例输出
HelloWorld
 * @author chen
 *
 */
public class Exam14 {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		String str = str1+str2;
		System.out.println(str);
	}
}
