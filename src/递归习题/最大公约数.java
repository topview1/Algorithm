package �ݹ�ϰ��;

public class ���Լ�� {
	/**
	 * �е���˼ά,���ǰѹ�ģ�������תΪ��ģС������
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gongyue(int m,int n) {
		if(m%n == 0) {
			return n;
		}
		return gongyue(n,m%n);
	}
	
	public static void main(String[] args) {
		System.out.println(gongyue(28,12));
	}

}
