package ����;

import java.util.Scanner;

import MyUtil.Utils;


/**
 * ð�����򷨣�
 * ���ʱ�临�Ӷ� O��N��  ���O��N^2��
 * ��Ϊ���ѭ��Ҫѭ��n-1�� ���ڲ�ѭ����õ���ִ��һ��,�����ִ��n-1��
 * 
 * @author chen
 *
 */
public class ð������ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a= new int [n];
		Utils.CreateArray(a, in);
		
//		ð�������㷨 (Ĭ�ϴ�С����)
		for(int i = 0;i<a.length-1;i++) {
			for(int j= 0;j<a.length-i-1;j++) {
				if(a[j] >a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
			
	}
}
