package 多维数组基础题;
/**
 * 找出一个矩阵中的最大累加和，并返回
 * 比如
 * -1 -1 -1
 * -1  2   2
 * -1  -1  -1 
 * 其中最大累加和的子矩阵为2 2 ，所以返回4
 * @author chen
 *
 */
public class 子矩阵的最大累加和 {
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
//			一直从startRow到j行
			for(int j = i;j<n;j++) {
//				对每行进行累加
				for(int k = 0;k<m;k++) {
					sum[k] += a[j][k];
				}
//				对每次的sum进行查找
				int maxofj = findMax(sum);
				if(max<maxofj) {
					max = maxofj;
				}
			}
//			对sum数组进行清零
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
