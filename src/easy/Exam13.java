package easy;

import java.util.Scanner;

/**
 * 输入一个字符串，将大写字符变成小写、小写变成大写，然后输出
输入格式
　　acbAB
输出格式
　　ACBab
样例输入
一个满足题目要求的输入范例。
例：
acbAB
样例输出
与上面的样例输入对应的输出。
例：
ACBab
 * @author chef
 *
 */
public class Exam13 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		String str = in.next();
		char[] strs = str.toCharArray();
		for(int i = 0;i<strs.length;i++) {
			if('A'<=strs[i] && strs[i] <='Z') {
				strs[i]   += 32;
			}else  if('a'<=strs[i] && strs[i] <='z'){
				strs[i] -= 32;
			}
		}
		System.out.println(strs);
	}
}
