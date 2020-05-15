package easy;

import java.util.Scanner;

/**
 * 求出区间[a,b]中所有整数的质因数分解。

提示


先筛出所有素数，然后再分解。

数据规模和约定

2< =a< =b< =10000

输入
输入两个整数a，b。
输出
每行输出一个数的分解，形如k=a1*a2*a3...(a1< =a2< =a3...，k也是从小到大的)(具体可看样例) 
样例输入
3  10 
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
 * 
 *
 */
public class Exam17 {
	/**
	 * 把n分解为带有质数的公因式
	 * @param n
	 * @return
	 */
	public static String apartS(int n) {
		if(isShu(n)) {
			return n+"";
		}
		for(int i =2;i<=n;i++) {
			if(isShu(i) && n%i == 0 ) {
				String s = i+"*";
				return s+apartS(n/i);
			}
		}
		return "";
	}
	public static boolean isShu(int n) {
		if(n == 1) {
			return false;
		}
		else if(n == 2) {
			return true;
		}
		else {
			for(int i =2;i<n;i++) {
				if(n%i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		for(int i = a;i<=b;i++) {
			if(isShu(i)) {
				System.out.println(i +"="+i);
			}else {
				System.out.println(i+"="+apartS(i));
			}
		}
	
		
	}

}
