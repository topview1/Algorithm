package ����.����.������;

import MyUtil.Utils;
/**
 * ���Ѻ���С������
 * @author chen
 *
 */
public class �������� {
	/**
	 * 
	 * @param a
	 * @param i  ��ʼ�������ʼ����
	 * @param n   ����������С�ѵĸ���
	 */
	public static void	heapSort(int[] a,int i,int n) {
		int snode_index  = n/2-1;  //���һ����Ҷ�ӽڵ���±�
//		�ֱ�����еķ�Ҷ�ӽڵ���Ϊ���ڵ�������ѻ�
		for(int j = snode_index;j>=i;j--) {
			maxHeap(a,j,n);
		}
//		���Ѷ�Ԫ����ĩβԪ�ؽ��н�����ʹĩβԪ�����
		while(n > 1) {
			int  temp = a[i];
			a[i] = a[n-1];
			a[n-1] = temp;
			n--;
			maxHeap(a,0,n);
		}
		
		
		
	}
/**
 * ��������
 * @param a
 * @param i   ���������ĸ��ڵ�
 * @param n
 */
	public static void  maxHeap(int[] a,int i,int n) {
		if(n==1) {
			return;
		}
		int leftnode_index = 2*i+1;
		int rightnode_index = 2*i+2;
		int max_index = 0;
		if(rightnode_index >=n) {    //���û���Һ��ӽڵ㣬��ômax_index = �����±�
			max_index = leftnode_index;
		}else {   //��������Һ��ӣ��õ������������±��� max_index
			if(a[leftnode_index] < a[rightnode_index]) {
					max_index = rightnode_index;
			}else {
				max_index = leftnode_index;
			}
		} 
		
//	�����ڵ�����ֵ�ĺ��ӽڵ���н���
		if(a[i] <a[max_index]) {
			int temp  = a[i];
			a[i] = a[max_index] ;
			a[max_index] = temp;
		}
	
		
//  ���еݹ�
		if(i< n/2-1) {
//			�˴�ע�� ++i ��i++...  i++��ʹ��i�μӷ��������ڼ�1
			maxHeap(a,++i,n);
		}else {
			return;
		}
	}
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5};
		int[]  a= Utils.CreateRomArray(10, 30);
		Utils.printArray(a);
		heapSort(a,0,a.length);
		Utils.printArray(a);
	}
}
