package easy;

import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 输入
输入包括一行。 第一行输入的字符串。
输出
输出转换好的逆序字符串。
样例输入
I am a student
样例输出
tneduts a ma I
 * @author chen
 *
 */
public class Exam1 {
	public static  void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
	   char[]  strs = str.toCharArray();
	   for(int i = 0;i<strs.length/2;i++) {
		   char temp = strs[strs.length-1-i];
		   strs[strs.length-1-i] = strs[i];
		   strs[i]  = temp;
	   }
//	   输出
	   for(char a:strs) System.out.print(a);
	}
}
