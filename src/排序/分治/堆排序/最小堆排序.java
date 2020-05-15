package ����.����.������;

import MyUtil.Utils;

/**
 * ������Ĺ���
 * 1.��a[0,n/2-1]���е�ÿһ��a[i]��Ϊ���ڵ㹹����С��ʱ�临�Ӷ�O��NlogN��
 * 	������С�ѣ��������������������е���С��һ������ڵ�a[i]���н��������еݹ������
 * 2.  ʱ�临�Ӷ�O��NlogN��
 * ���Ѷ�Ԫ����ĩβԪ�ؽ��н�����ʹĩβԪ����С��Ȼ����������ѣ�
 * �ٽ��Ѷ�Ԫ����ĩβԪ�ؽ������õ��ڶ���Ԫ�ء���˷������н������ؽ���������
 * @author chen
 *�ܵ�  ʱ�临�Ӷ�O��2NlogN��
 */
// ����Ľ���
public class ��С������ {
	/**
	 * 
	 * @param a
	 * @param i  ��ʼ�������ʼ����
	 * @param n   ����������С�ѵĸ���
	 */
	public static void	heapSort(int[] a,int i,int n) {
		int snode_index  = n/2-1;  //���һ����Ҷ�ӽڵ���±�
//		�ֱ�����еķ�Ҷ�ӽڵ���Ϊ���ڵ������С�ѻ�
		for(int j = snode_index;j>=i;j--) {
			minHeap(a,j,n);
		}
//		���Ѷ�Ԫ����ĩβԪ�ؽ��н�����ʹĩβԪ����С��
		while(n > 1) {
			int  temp = a[i];
			a[i] = a[n-1];
			a[n-1] = temp;
			n--;
			minHeap(a,0,n);
		}
		
		
		
	}
/**
 * ������С��
 * @param a
 * @param i   ��С�������ĸ��ڵ�
 * @param n
 */
	public static void  minHeap(int[] a,int i,int n) {
		if(n==1) {
			return;
		}
		int leftnode_index = 2*i+1;
		int rightnode_index = 2*i+2;
		int min_index = 0;
		if(rightnode_index >=n) {    //���û���Һ��ӽڵ㣬��ômin_index = �����±�
			min_index = leftnode_index;
		}else {   //��������Һ��ӣ��õ���������С���±��� min_index
			if(a[leftnode_index] > a[rightnode_index]) {
					min_index = rightnode_index;
			}else {
				min_index = leftnode_index;
			}
		} 
		
//	�����ڵ����Сֵ�ĺ��ӽڵ���н���
		if(a[i] >a[min_index]) {
			int temp  = a[i];
			a[i] = a[min_index] ;
			a[min_index] = temp;
		}
	
		
//  ���еݹ�
		if(i< n/2-1) {
//			�˴�ע�� ++i ��i++...  i++��ʹ��i�μӷ��������ڼ�1
			minHeap(a,++i,n);
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
