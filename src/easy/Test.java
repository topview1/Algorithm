package easy;

import java.util.Scanner;



/**
��������
�������һ�����е��������ǰһ���ż�����ǰһ��С�����Ϊһ���ڶ����С�
	�� a[2i]<a[2i-1], a[2i+1]>a[2i]��
����С����֪��������Ϊ m��ÿ�������� 1 �� n ֮����������İڶ�����һ���ж��ٸ���
�����ʽ
��������һ�а����������� m��n��
�����ʽ
�������һ����������ʾ�𰸡��𰸿��ܴܺ�������𰸳���10000��������
��������
3 4
�������
14
����˵��
���������Ƿ���Ҫ��İڶ����У�
����2 1 2
����2 1 3
����2 1 4
����3 1 2
����3 1 3
����3 1 4
����3 2 3
����3 2 4
����4 1 2
����4 1 3
����4 1 4
����4 2 3
����4 2 4
����4 3 4
����������ģ��Լ��
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
