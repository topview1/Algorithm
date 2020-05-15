package ����.��������;

import java.util.ArrayList;

import MyUtil.Utils;
/**
 * a�����ֵ��λ�� = count
 * ʱ�临�Ӷ� O��count*2N�� = O��count*N��
 * @author chen
 *
 */
public class �������� {

	public static void radixSort(int[] a) {
		ArrayList lists= new ArrayList();
		//����0-9��Ͱ
		for(int i = 0;i<10;i++) {
			lists.add(new ArrayList());
		}
		//�õ������е����λ��
		int maxDight = getMaxDight(a);
		for(int j = 1,p = j;j<=maxDight;j++,p=p*10) {
			for(int i= 0;i<a.length;i++) {
				int num = a[i];
				num = num/p;
				int input_index = num%10;  //���ݸ���λ��ֵ����Ͱ 
				ArrayList list=(ArrayList) lists.get(input_index);
				list.add(a[i]);
			}
			//��д
			int a_index = 0;
			for(int j1 = 0;	j1<lists.size();j1++) {
				ArrayList list = (ArrayList) lists.get(j1);
				for(int k = 0;k<list.size();k++) {
					a[a_index++]  = (int) list.get(k);
				}
//				��д���������list
				if(!list.isEmpty()) {
					list.clear();
				}
			}
			
		}
		
		
	}
	
	/**
	 * ���������е����λ
	 * @param a
	 * @return
	 */
	public static int getMaxDight(int[] a) {
		int maxDight = 0;
		int max = a[0];
		for(int i = 0;i<a.length;i++) {
			if(max <a[i]) {
				max =a[i];
			}		
		}
		
		while(max > 0) {
			max = max/10;
			maxDight++;
		}
		
	return maxDight;
	}
		
	public static void main(String[] args) {
//		int[] a = {55,41,32,20,11,110};
		int[] a= Utils.CreateRomArray(10, 100);
		Utils.printArray(a);
		radixSort(a);
		Utils.printArray(a);
	}
}
