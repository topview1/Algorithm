package λ����;
/**
 * 1-1000��1000��ֵ����10001������ռ���,���һ��ֵ�������(1-1000) ��
 * ���ø����洢�ռ�,���ظ����ε������ҳ���
 * @author chen
 *
 */
public class Ψһ�ɶԵ���_����� {
	
	public static void main(String []args) {
		int N = 11;
		int[]  arr = new int[N];
//		1.׼������
		for(int i = 0;i<N-1;i++) {
			arr[i] = i+1;
		}
//		2.׼�����һ��λ�ô������
		arr[arr.length-1] =(int) ((N-1)*Math.random()+1);
		
//  3.�����������:����������㽻���ɡ�����ɡ�
//		���ԣ�1^2^...^n^...^n^...^1000������������n������ʲôλ�ã�������ת����Ϊ1^2^...^1000^(n^n)����ʽ��
//		���Խ� (1^2^...^n^...^n^...^1000)^(1^2^...^n^...^...^1000)  ��˫�Ķ����Ϊ0,ֻʣ������n
		
		int  result = 0;
		for(int i = 0;i<arr.length;i++) {
			result = result^arr[i];
		}
		
		for(int i =1;i<N;i++) {
			result = result^i;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(result);
	}

}
