package easy;

import java.util.Scanner;

/**
 * �������[a,b]�������������������ֽ⡣

��ʾ


��ɸ������������Ȼ���ٷֽ⡣

���ݹ�ģ��Լ��

2< =a< =b< =10000

����
������������a��b��
���
ÿ�����һ�����ķֽ⣬����k=a1*a2*a3...(a1< =a2< =a3...��kҲ�Ǵ�С�����)(����ɿ�����) 
��������
3  10 
�������
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
	 * ��n�ֽ�Ϊ���������Ĺ���ʽ
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
