package �ݹ�ϰ��;
/**
 * 쳲���������: 1   1  2 3  5  8 .....
 * ��һ�����ǰ����֮��
 * ��õ�n���ֵ
 * @author chen
 *
 */
public class 쳲��������� {
//	�ݹ� =  ֱ��ֵ+С��ģ����
//	�ݹ� =  ���С��ģ������
	//�ҹ��ɣ��оٷ�
	public static int fn(int n) {
		if(n==1 || n == 2) {
			return 1;
		}
		return fn(n-1)+fn(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fn(1));
		System.out.println(fn(2));
		System.out.println(fn(3));
		System.out.println(fn(4));
	}

}
