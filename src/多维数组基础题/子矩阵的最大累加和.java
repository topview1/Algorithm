package ��ά���������;
/**
 * �ҳ�һ�������е�����ۼӺͣ�������
 * ����
 * -1 -1 -1
 * -1  2   2
 * -1  -1  -1 
 * ��������ۼӺ͵��Ӿ���Ϊ2 2 �����Է���4
 * @author chen
 *
 */
public class �Ӿ��������ۼӺ� {
	public static int[]sum;
	
	public static int function(int[][] a) {
		
		if(a.length== 0 ) {
			return 0;
		}
		int n  =a.length;
		int m = a[0].length;
		int  startRow = 0;
		int max =Integer.MIN_VALUE;
		sum = new int[m];
		for(int i = startRow;i<n;i++) {
//			һֱ��startRow��j��
			for(int j = i;j<n;j++) {
//				��ÿ�н����ۼ�
				for(int k = 0;k<m;k++) {
					sum[k] += a[j][k];
				}
//				��ÿ�ε�sum���в���
				int maxofj = findMax(sum);
				if(max<maxofj) {
					max = maxofj;
				}
			}
//			��sum�����������
			for(int p = 0;p<sum.length;p++) {
				sum[p] = 0;
			}
		}
		return max;
	}
	
	public static int findMax(int[] a) {
		int max = a[0];
		int maxofj = a[0];
		for(int j = 1;j<a.length;j++) {
			if(maxofj > 0) {
				maxofj += a[j];
			}else {
				maxofj = a[j];
			}
			if(max<maxofj) {
				max = maxofj;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] a = {{-1,-1,-1},
							{-1,-1,-1},
							{-1,-1,-1},
		};
//		int[][] a = {};
		System.out.println(function(a));
	}
}
