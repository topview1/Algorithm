package ���ģ��;

import java.util.Arrays;

import MyUtil.Utils;

/**

 * һ�����У������ߵ������ұߵ���С�����������λ��һ������ԣ�
 * ���һ���������ж��ٸ������
 * @author chen
 *
 */
public class ����Ը��� {
	static int count = 0;
//	���ù鲢�����˼��
	public static int f(int[] a,int low,int hight) {
		if(low<hight) {
			// >>�����ȼ���+ - Ҫ��
			int mid = low+((hight-low)>>1);
		//�ֱ�Ի��ֵ����߽��еݹ�����
		f(a,low,mid);
		f(a,mid+1,hight);
		//�����߽��й鲢
		Merge(a,mid,low,hight);
		}
		return count;
	}
	
	/**
	 * 
	 * @param a
	 * @param p_index  ���ֵ��±�
	 * @param low
	 * @param hight
	 */
	public static void Merge(int[] a,int p_index,int low,int hight) {
		int []b = new int[a.length];
		int first_p = low;
		int second_p =  p_index+1;
		int   i = low;   //b������ƶ�ָ��
		while(first_p<= p_index && second_p <=hight) {
////			������
//			if(a[first_p] <= a[second_p]) {
//				b[i] = a[first_p];
//				first_p++;	
//			}else {
//				b[i] = a[second_p];
//				for(int k = first_p;k<=p_index;k++)
////					��������
//				System.out.println(a[k]+" "+a[second_p]);
//				second_p++;
//				count+= p_index-first_p+1;
//			
//			}
//			i++;
//			
//			˳����
			if(a[first_p] < a[second_p]) {
				b[i] = a[first_p];
				for(int k = second_p;k<=hight;k++)
//					���˳���
				System.out.println(a[first_p]+" "+a[k]);
				first_p++;	
				count+= hight-second_p+1;
			}else {
				b[i] = a[second_p];
				second_p++;			
			}
			i++;
			
		}
		//�����ʱ�ڶ��������û�л��꣬�˿̵ڶ���ʣ�µ����ݿ϶��Ǵ����Ѿ����ֺõ�
		while(second_p <=hight && i<b.length) {
			b[i++] = a[second_p++];
		}
		//�����ʱ��һ������û�л��꣬�˿̵�һ��ʣ�µ����ݿ϶��Ǵ����Ѿ����ֺõ�
		while(first_p<= p_index&& i<b.length) {
			b[i++] = a[first_p++];
		}
		//������õ����п�����Ԫ����
		for(int j= low;j<=hight;j++) {
			a[j] = b[j];
		}
		
	}

	
	public static void main(String []args) {
		int[] a = {1,7,4,7,7,7,4};
		System.out.println(f(a,0,a.length-1));
//		int[] b = Utils.CreateRomArray(5, 20);
//		Utils.printArray(b);
//		System.out.println(f(b,0,b.length-1));
	}
}
