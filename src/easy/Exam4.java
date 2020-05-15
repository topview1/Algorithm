package easy;

import java.util.Scanner;

/**
 * 使用Switch语句编写一个模拟简单计算器的程序。
 * 依次输入两个整数和一个字符，并用空格隔开。
 * 如果该字  符是一个“+”，则打印和；如果该字符是一个“-”，
 * 则打印差；如果该字符是一个“*”,则打印积；如果该字符是“/”，
 * 则打印商；如果该字符是一个  “%”，则打印余数。
 * 打印结果后输出一个空行。

输入
无
输出
无
样例输入
3 4 +
样例输出
7
 * @author chen
 *
 */
public class Exam4 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String c = in.next();
		char[]  arr = c.toCharArray();
		char d = arr[0];
		switch(d) {
		case '+': System.out.println(a+b); break;
		case '-': System.out.println(a-b); break;
		case '/': System.out.println(a/b); break;
		case '%':System.out.println(a%b); break;
		case '*': System.out.println(a*b); break;
		}
		System.out.println();
	}

}
