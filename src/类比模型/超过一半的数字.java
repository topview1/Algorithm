package ���ģ��;

import java.util.Arrays;

/**
 * ��������һ�����ֳ��ֵĴ������������鳤�ȵ�һ�룬
 * �ҳ��������
 * @author chen
 *
 */
public class ����һ������� {
//	1.��һ�ַ���ʱ�临�Ӷ�O��nlogn��
	public static int getNumber1(int[] a) {
//		���ù��߿��еĿ�������
		Arrays.sort(a);
		return a[a.length/2];
	}
	
//	2. �ڶ��ַ��� ���������� ʱ�临�Ӷ�O(n)
	public static int getNumber2(int []a) {
		int key = a[0];
		int count = 1;
		for(int i = 1;i<a.length;i++) {
			if(count == 0) {
				key = a[i];
				count =1;
				//Ϊ��ʹkey������ֵ������a[i] == key�жϣ���ʹ��Ϊ�����Ӱ��count+1
				continue;
			}
			if(a[i] != key) {
//				��ͬ��ֵ���������
				count--;
			}else {
				count++;
			}
			
		}
		return key;
	}
	public static void main(String[] args) {
		int[] a = {1,1,1,1,0,7,8};
		int[] b = {10,1,2,9,9,9,9,9};
		int[] c = {100,1,100,3,6,100,21,100,0,100,100};
		System.out.println(getNumber2(a));
		System.out.println(getNumber2(c));
	}
}
