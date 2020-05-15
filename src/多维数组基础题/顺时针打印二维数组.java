package ��ά���������;
/**
 * ˳ʱ���ӡ��ά����
 * ����
 *  1 2 3 4
 *  5 6 7 8
 *  9 10 11 12
 *  13 14 15 16
 *  
 *  ��� 1 2 3 4 8  12 16 15 14 13 9 5 6 7 11 10
 * @author chen
 *
 */
public class ˳ʱ���ӡ��ά���� {
	public static void print(int[][] a) {
//		 �������Ͻǵ��У��� ���� ���½ǵ�����
		int leftUpRow = 0,leftUpCol = 0,rightDownRow = a.length-1,rightDownCol = a[0].length-1;
		
//		��ӡ��Ȧ
		while(leftUpRow<=rightDownRow && leftUpCol<= rightDownCol) {
		for(int i = leftUpCol;i<=rightDownCol;i++) {
			System.out.print(a[leftUpRow][i]+" ");
		}
		
		for(int i = leftUpCol+1;i<=rightDownRow;i++) {
			System.out.print(a[i][rightDownCol]+" ");
		}
		
		for(int i = rightDownCol-1;i>=leftUpCol;i--) {
			System.out.print(a[rightDownRow][i]+" ");
		}
		
		for(int i = rightDownRow-1;i>leftUpRow;i--) {
			System.out.print(a[i][leftUpCol]+" ");
		}
		leftUpCol++;
		leftUpRow++;
		rightDownCol--;
		rightDownRow--;
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,0},{5,6,7,8,0},{9,10,11,12,0},{13,14,15,16,0},{17,18,19,20,0}};
		print(a);
	}
}
