package easy;

import java.util.Scanner;



/**
问题描述
　　如果一个序列的奇数项都比前一项大，偶数项都比前一项小，则称为一个摆动序列。
	即 a[2i]<a[2i-1], a[2i+1]>a[2i]。
　　小明想知道，长度为 m，每个数都是 1 到 n 之间的正整数的摆动序列一共有多少个。
输入格式
　　输入一行包含两个整数 m，n。
输出格式
　　输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。
样例输入
3 4
样例输出
14
样例说明
　　以下是符合要求的摆动序列：
　　2 1 2
　　2 1 3
　　2 1 4
　　3 1 2
　　3 1 3
　　3 1 4
　　3 2 3
　　3 2 4
　　4 1 2
　　4 1 3
　　4 1 4
　　4 2 3
　　4 2 4
　　4 3 4
评测用例规模与约定
 *
 */
public class Test {
	
	static int   count = 0;
	static StringBuilder s = new StringBuilder();
	public static void function(int flag,int n,int m) {
		if(m == s.length()) {
			count++;
			return;
		}
		
		if(flag== 1 &&s.length()==0) {
			for(int i = 2;i<=n;i++) {
				s.append(i);
				function(0,n,m);
				s.deleteCharAt(s.length()-1);
			}
			
			}
		
		if(flag== 0) {
			for(int i = 1;i<=n;i++) {
				if(s.length()!= 0&&Character.getNumericValue((s.charAt(s.length()-1)) ) >i) {
					s.append(i);
					function(1,n,m);
					s.deleteCharAt(s.length()-1);
				}
			}
		}
			
			if(flag== 1) {
				for(int i = 1;i<=n;i++) {
					if(s.length()!= 0 && i>Character.getNumericValue((s.charAt(s.length()-1)) )) {
						s.append(i);
						function(1,n,m);
						s.deleteCharAt(s.length()-1);
					}
				}
			}
			
			
	} 
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int m = in.nextInt();
	int n = in.nextInt();
	function(1, n,  m);
	System.out.println(count%10000);
}
}
