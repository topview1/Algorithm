package ��ά���������;
/**
 * ����һ��N*N�ľ���matrix������������У�ֻ��0��1����ֵ�����ر߿�ȫ��1����������εı߳�����
 * ����
 * 0 1 1 1 1
 * 0 1 0 0 1
 * 0 1 0 0 1
 * 0 1 1 1 1 
 * 0 1 0 1 1
 * ���б߿�ȫ��1����������εĴ�С��4*4������4
 * @author chen
 *
 */
public class �ҳ��߽�Ϊ1������ӷ��� {
//	����ö�ٵķ�ʽ
	public static int getMaxS(int[][] a) {
		int max = 0;
		int n = a.length;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				//���ھ����ÿһֵ���п�����ɱ߳�Ϊ2,3,..n��������
				out:
				for(int k = 1;k+i<n&&k+j<n;k++) {
					int leftCol= j;
					int rightCol = j+k;
					int upRow = i;
					int downRow = i+k;
//					�߽��ϵ�ֵ
					while(leftCol<=rightCol) {
						if(a[i][leftCol] != 1) {
							continue out;
						}
						leftCol++;
					}
					
//					�߽��ҵ�ֵ
					while(upRow<=downRow) {
						if(a[upRow][rightCol] != 1) {
							continue out;
						}
						upRow++;
					}
					leftCol= j;
					upRow = i;
//					�߽��µ�ֵ
					while(leftCol<=rightCol) {
						if(a[downRow][rightCol]  != 1) {
							continue out;
						}
						rightCol--;
					}
//					�߽���ߵ�ֵ
					while(upRow<=downRow) {
						if(a[downRow][leftCol] != 1) {
							continue out;
						}
						downRow--;
					}
					
//					������е��⣬֤���б߽�������
					if(k+1>max) {
						max = k+1;
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
//		int[][] a  = {{0,1,1,1,1},
//							{0,1,0,0,1},
//							{0,1,0,0,1},
//							{0,1,1,1,1},
//							{0,1,0,1,1}
//		};
		int[][] a = {{1,1,1,1},
							{1,0,0,0},
							{1,0,1,1},
							{0,1,0,1},
};
		System.out.println(getMaxS(a));
	}
}
