package easy;

import java.util.Scanner;

/**
 * �����������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)��
 * ����֮��Ĺ�ϵ������4�����֮һ��

1�������ַ������Ȳ��ȡ�����  Beijing  ��  Hebei

2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)��
����  Beijing  ��  Beijing

3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ��
��Ҳ����˵���������������2��������  beijing  ��  BEIjing

4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡�
����  Beijing  ��  Nanjing

����ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�
����
�������У�ÿ�ж���һ���ַ��� 
���
����һ�����֣������������ַ����Ĺ�ϵ��� 
��������
BEIjing
beiJing
�������
3
 * @author chen
 *
 */
public class Exam18 {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
		String a = in.next();
		String b = in.next();
		if(a.length() == b.length()) {
			if(a.compareTo(b) == 0  ) {
				System.out.println(2);
			}
			
			else if(a.compareToIgnoreCase(b) == 0) {
				System.out.println(3);
			}
			
			else if(a.compareToIgnoreCase(b) != 0) {
				System.out.println(4);
			}
		}else {
			System.out.println(1);
		}
		
	}
}
