package 多维数组基础题;
/**
 * 给定一个N*N的矩阵matrix，在这个矩阵中，只有0和1两种值，返回边框全是1的最大正方形的边长长度
 * 比如
 * 0 1 1 1 1
 * 0 1 0 0 1
 * 0 1 0 0 1
 * 0 1 1 1 1 
 * 0 1 0 1 1
 * 其中边框全是1的最大正方形的大小是4*4，返回4
 * @author chen
 *
 */
public class 找出边界为1的最大子方阵 {
//	运用枚举的方式
	public static int getMaxS(int[][] a) {
		int max = 0;
		int n = a.length;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				//对于矩阵的每一值都有可能组成边长为2,3,..n的正方形
				out:
				for(int k = 1;k+i<n&&k+j<n;k++) {
					int leftCol= j;
					int rightCol = j+k;
					int upRow = i;
					int downRow = i+k;
//					边界上的值
					while(leftCol<=rightCol) {
						if(a[i][leftCol] != 1) {
							continue out;
						}
						leftCol++;
					}
					
//					边界右的值
					while(upRow<=downRow) {
						if(a[upRow][rightCol] != 1) {
							continue out;
						}
						upRow++;
					}
					leftCol= j;
					upRow = i;
//					边界下的值
					while(leftCol<=rightCol) {
						if(a[downRow][rightCol]  != 1) {
							continue out;
						}
						rightCol--;
					}
//					边界左边的值
					while(upRow<=downRow) {
						if(a[downRow][leftCol] != 1) {
							continue out;
						}
						downRow--;
					}
					
//					如果运行到这，证明有边界正方形
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
