package easy;

import java.util.Scanner;

/**
 * ����һ���ַ���������д�ַ����Сд��Сд��ɴ�д��Ȼ�����
�����ʽ
����acbAB
�����ʽ
����ACBab
��������
һ��������ĿҪ������뷶����
����
acbAB
�������
����������������Ӧ�������
����
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
