package ����;
/**
 * �и��������ַ������飬����ɢ����һЩ���ַ�������дһ���������ҳ������ַ����������϶����ǿ��ַ�����������
 * ����  a ���� ac "" ad b "" ba  
 * �ҳ�b���ַ���������
 * @author chen
 *
 */
public class ���пյ��ַ����в��� {
//	���ֲ���
	public static int f(String[] a,int start,int end,String p) {
		while(start <= end) {
			int midIndex = start +((end- start)>>1);
			while(a[midIndex].equals("")) {
				midIndex++;
				//ǧ��Ҫע��,��ʱ������û�����ֵ
				if(midIndex>end) {
					return  -1;
				}
			}
			if(a[midIndex].compareTo(p) >0) {
				end = midIndex-1;
			}else if(a[midIndex].compareTo(p) <0) {
				start = midIndex+1;
			}else {
				return midIndex;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String[] a = {"a","","ac","","ad","b","","ba"};
		System.out.println(f(a,0,a.length-1,"ab"));
		
	}

}
