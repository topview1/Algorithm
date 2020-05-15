package 多维数组基础题;

import MyUtil.Utils;

/**
 * 比如
 *  1 2 3 4
 *  5 6 0 8
 *  9 0 11 12
 *  13 14 15 16
 *  输出得：
 *  1 0 0 4
 *  0 0 0 0
 *  0 0 0 0 
 *  13 0 0 16
 * @author chen
 *
 */
public class 所在0的行清0 {
	public static void function(int[][] a) {
		int[] row = new int[a.length];
		int[] col = new int[a[0].length];
		
		for(int i = 0;i<a.length;i++ ) {
			for(int j = 0;j<a[0].length;j++) {
				if(a[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for(int i = 0;i<row.length;i++) {
			if(row[i] == 1) {
				for(int j = 0;j<a[0].length;j++) {
					a[i][j] = 0;
				}
			}
		}
		
		for(int i = 0;i<col.length;i++) {
			if(col[i] == 1) {
				for(int j = 0;j<a.length;j++) {
					a[j][i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,0,8},{9,0,11,12},{13,14,15,16}};
		Utils.print(a);
		function(a);
		Utils.print(a);
	}
}
