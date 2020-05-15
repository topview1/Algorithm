package ����.��������;

import java.util.ArrayList;
import java.util.List;

import MyUtil.Utils;

/**
 * ʱ�临�Ӷȣ�O��N�� - O��N*��log��N��-log��M��)��  
 *    ���һ������վһ��Ͱ�����൱�ڼ������� O��n��
 * 1.��N�����ݷֵ�M��Ͱ�У�ÿ��Ͱ��N/M����������ÿ��Ͱ�������ʱ�临�Ӷ�ѡ�ÿ���ΪO��(N/M)*log(N/M)��
 * 2.һ����M��Ͱ��Ҫ����  ����ʱ�临�Ӷ�O��N*��log��N��-log��M������  
 * 3.�ټ���ѭ������ÿ���ؼ��ֵ�Ͱӳ��ͻ�д���ݵ����飬���ʱ�临�Ӷ�������O(2N) == O��N����
 * 4.�ܹ���O��N��+O��N*��log��N��-log��M��)��  
 * @author chen
 *
 */
public class Ͱ���� {
	
	public static void bucketSort(int[] a) {
//		1.����һ��װa.lengthͰ��Ͱ
		ArrayList buckets = new ArrayList();
//		2.����n��Ͱ�����ҳ����ֵ
		int max = a[0];
		for(int i = 0;i<a.length;i++) {
			buckets.add(new ArrayList());
			if(a[i] > max) {
				max = a[i];
			}
		}
		
//     3.�����������㷨�ֱ�װ�����Ͱ��
		for(int i= 0;i<a.length;i++) {
			int bucket_index = (a[i]*a.length)/(max+1);   //�������Ӧ��װ����Ϊbucket_index��Ͱ
			ArrayList bucket = (ArrayList) buckets.get(bucket_index);
			bucket.add(a[i]);
		}

//		4,װ����ڶ���������ݽ�������Ĭ��������������ÿ�������
		int i= 0;
		while(i<buckets.size()) {
			 ArrayList bucket = (ArrayList) buckets.get(i);
			 quickSort(bucket,0,bucket.size()-1);
			i++;
		}
		
//   5.��Ͱ�����������ȡ��,��д��a������
		int a_index = 0;
		for(int j = 0;j<buckets.size();j++) {
			ArrayList bucket = (ArrayList) buckets.get(j);
			for(int k = 0;k<bucket.size();k++) {
				a[a_index++]  = (int) bucket.get(k);
			}
		}
	}
	
	
	public static void quickSort(ArrayList list,int low,int hight) {
		if(low<hight) {
			int mid = partition(list,low,hight);
			quickSort(list,low,mid-1);
			quickSort(list,mid+1,hight);
		}
		
	}
	public static int partition(ArrayList list,int low,int hight) {
		 int key_index =  low;
		 int start = low+1;
		 int end = hight;
		 while(start <= end) {
			 while(start<=end &&(int)list.get(start) <=(int)list.get(key_index) ) {
				 start++;
			 }
			 while(start<=end  && (int)list.get(end)>(int)list.get(key_index)) {
				 end--;
			 }
			 if(start<end) {
				 swap(list,end,start);
			 }
			 
			
		 }
		 swap(list,key_index,end);
		 return end;	
	}
	/**
	 * ��list �е�i��j����λ��
	 * @param list  
	 * ����ֵ֮����������������Ԫ��
	 * @param i
	 * @param j
	 */
	public static void swap(ArrayList list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	public static void main(String[] args) {
		int[] a = {369,758,71,771,967,416,292,563,801,80,40,295,220,621,436,67,731,356,345,976,896,459,44,48,774,22,307,918,285,439};
//		int[] a = Utils.CreateRomArray(5, 20);
		Utils.printArray(a);
		bucketSort(a);
		Utils.printArray(a);
	
	}
}
