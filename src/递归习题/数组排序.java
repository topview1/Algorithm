package �ݹ�ϰ��;

public class �������� {
	/**
	 * ���ֳ������� �Ӻ���ǰ˼��
	 * �������������ȼ���  ��[0,�����ڶ���Ԫ��]��������,�ٰ����һ��Ԫ�ز����ȥ
	 * @param a ����  k�������a�����һ�������±�
	 * @return
	 */
	public static void sort(int a[],int k) {
		if(k == 0) {
			return;
		}
//		��[0,k-1]��������
		 sort(a,k-1);
//  ��a[k]  ���뵽�Ѿ��ĺ���������� (�����Ǵ�С������)
		 int value = a[k];
		 int index = k-1;
//		 ʹ����value������ƶ�
		while(index >-1 && value < a[index]) {
			a[index+1] = a[index];
			index--;
		}
		a[index+1] = value;
	}
	public static void main(String []args) {
		int[] a = {1,2,3,4,5};
		sort(a,a.length-1);
		for(int b:a) {
			System.out.println(b);
		}
		
	}

}
