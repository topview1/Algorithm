package �ݹ�ϰ��;

public class ������֮�� {
	/**
	 * ���ظ�:������ظ��� a[0]+(a[1]+....+a[n]) 
	 * �ұ仯:�仯������Ϊ����
	 * �ұ߽�:Ҳ�����ҳ���
	 * @param a
	 * ���ַ�
	 */
	public static int  arrAdd(int[] a,int begin) {
		if(begin == a.length-1) {
			return  a[begin];
		}
		return a[begin]+arrAdd(a, begin+1);
	}
	public static void main(String[] args) {
		int[]  a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrAdd(a, 0));
	}
}
