package �ݹ�ϰ��;
/**
 * ��1-N��С���̴�A�ƶ���B,C������(Ҫ����̱�����С������),
 * һ��ֻ��Ų��һ����
 * 
 * �����ݹ����⣺
 * 1.�� 1-N-1 �����ƶ���C ��N��С���̻�����A��
 * 2.��N��A�ƶ���B
 * 3. ��1-N-1 ���̴�C�ƶ���B
 * @author chen
 *
 */
public class ������_��ŵ������ {
	//�û��ַ�
	/**
	 * ��ӡ����·��
	 * @param n  ��ʼn����С���������
	 * @param from  	ԭʼ����
	 * @param to		Ŀ������
	 * @param help	��������
	 */
	public static void printSrc(int n,String from,String to,String help) {
		if(n == 1) {
			System.out.println("move"+n+"from"+from+"to"+to);
			return;
		}
		printSrc(n-1,from,help,to);  // ��n-1�������ƶ������ŵĸ���λ������
		System.out.println("move"+n+"from"+from+"to"+to); //��n������ֱ�Ӵ�from�ƶ���Ŀ����
//		�ٰ�n-1���̴ӿ��ŵĸ���λ���ƶ���Ŀ����
		printSrc(n-1,help,to,from); 
	}
	public static void main(String[] args) {
		printSrc(3,"A","B","C");
	}

}
