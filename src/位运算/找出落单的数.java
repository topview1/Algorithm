package λ����;
/**
 * һ�����鶼�ǳ��ֹ����ε���,�ҳ��Ǹ�Ψһ���ֹ�һ�ε���
 * @author chen
 * 
 *
 */


public class �ҳ��䵥���� {
 
	public static void main(String[] args) {
		int [] arr = {1,1,2,2,3,3,4,4,5};
		int result  = 0;
//	 ֱ�Ӷ������ڲ�����λ����,�ɶԵĻᱻ����,�ɵ��Ļᱣ��
		for(int i = 0;i<arr.length;i++) {
			result = result^arr[i];
		}
		
		for(int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
		System.out.println();
		System.out.println(result);
	}
}
