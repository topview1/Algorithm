package �ݹ�ϰ��;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ·���и�����ͬ��ֻ����һ����ͨ��������ʱ�ļ��վ��
 * ��ͼ��p1.png����ʾ��

X����̫���壬Ҫ��ÿ��·���ĳ����������վ��
Ҳ���ܲ����ͷ��У�Ҳ������ϸ��顣

�������������վ���뿪�Ĵ���������⽻��
��ô���ó����ٴ���·�󣬿��ܵĴ����ж����֣�

Ϊ�˷��������������վ��������������������
���������ǳ�ջ��������
���� 3���� ����5�ֿ�����
 * @author chen
 *
 */
public class ��ջ���� {
	// a:�ȴ���վ�ĳ�����
		// b:վ�еĳ�����
		static int f(int a, int b) {
			if (a == 0)
				return 1; //���ȫ����վ�ˣ���ֻ��һ�ֳ�վ��ʽ
			if (b == 0)
				return f(a - 1, 1);// ���վ��û�г�������һ������ջ
			return f(a - 1, b + 1) + f(a, b-1 );
			// �����һ����ջ����� + ջ�еĿ����˵����
		}
	 
		public static void main(String[] args) {
			System.out.println(f(3, 0));
		}
}
