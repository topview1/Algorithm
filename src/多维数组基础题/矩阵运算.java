package 多维数组基础题;

import MyUtil.Utils;

public class 矩阵运算 {
	/**
	 * 两个矩阵相加  （注意，同类型的矩形才能相加）
	 * @param a
	 * @param b
	 * @return  返回相加的矩阵
	 */
	public static int[][] add(int[][] a,int[][] b){
		if(a == null || b == null) {
			return null;
		}
		int a_n = a.length,b_n = b.length,a_m=a[0].length,b_m = b[0].length;
		int [][] c = null;
		if(a_n != b_n || a_m !=b_m) {
			return null;
		}else {
			c = new int[a_n][a_m];
			for(int i = 0;i<a_n;i++) {
				for(int j = 0;j<a_m;j++) {
					c[i][j] =  a[i][j]+b[i][j];
				}
			}			
		}
		return c;
	}
	/**
	 * 减法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] minus(int[][] a,int[][] b){
		if(a == null || b == null) {
			return null;
		}
		int a_n = a.length,b_n = b.length,a_m=a[0].length,b_m = b[0].length;
		int [][] c = null;
		if(a_n != b_n || a_m !=b_m) {
			return null;
		}else {
			c = new int[a_n][a_m];
			for(int i = 0;i<a_n;i++) {
				for(int j = 0;j<a_m;j++) {
					c[i][j] =  a[i][j]-b[i][j];
				}
			}			
		}
		return c;
	}
	/**
	 * 乘法 (a的列数和b的行数相同才有意义)
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][]  multiply(int[][] a,int[][] b){
		if(a == null || b == null) {
			return null;
		}
		int a_n = a.length,b_n = b.length,a_m=a[0].length,b_m = b[0].length;
		int [][] c = null;
		if(a_m != b_n) {
			return null;
		}else {
			c = new int[a_n][b_m];
//  i表示行,j表示列  a_j == b_i
			for(int  a_i = 0;a_i<a_n;a_i++) {
				for(int b_j = 0;b_j<b_m;b_j++) {
					for(int a_j  = 0;a_j<a_m ;a_j ++) {
						c[a_i][b_j] += a[a_i][a_j] *b[a_j][b_j]; 
					}
				}
				
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[][] a = {{5,2,4},
				{3,8,2},
				{6,0,4},
				{0,1,6}
};
		int[][] b = {{2,4},
				{1,3},
				{3,2}
};
//		Utils.print(add(a, b));
//		Utils.print(minus(a, b));
		Utils.print(multiply(a, b));
	}
}
