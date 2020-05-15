package ��ά���������;
/**
 * z�ʹ�ӡ
 * ����һ������
 *  1 2 3 4
 *  5 6 7 8
 *  9 10 11 12
 *  ��ӡ
 *  1 2 5 9 6 3 4 7 10 11 8 12 
 * @author chen
 *
 */
public class z�ʹ�ӡ {
	public static void zPrint(int[][] a) {
		int r = 0,c = 0,n = a.length,m = a[0].length;
		boolean isRight = true;  //�����ߴ����������
		while(r<n && c<m) {
			if(isRight) {
				System.out.print(a[r][c]+" ");
				if(r==0 && c<m-1) {
					c++;
					isRight = !isRight;
					continue;
				}
				else if(r> 0 && c == m-1) {
					r++;
					isRight = !isRight;
					continue;
				}else {
					c++;
					r--;
					continue;
				}
			}else {
				System.out.print(a[r][c]+" ");
				if(r>0 && c==0) {
					r++;
					isRight = !isRight;
					continue;
				}
				else if(r== n-1 && c <m-1) {
					c++;
					isRight = !isRight;
					continue;
				}else {
					c--;
					r++;
					continue;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		zPrint(a);
		
	}
}
