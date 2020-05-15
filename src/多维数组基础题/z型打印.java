package 多维数组基础题;
/**
 * z型打印
 * 比如一个数组
 *  1 2 3 4
 *  5 6 7 8
 *  9 10 11 12
 *  打印
 *  1 2 5 9 6 3 4 7 10 11 8 12 
 * @author chen
 *
 */
public class z型打印 {
	public static void zPrint(int[][] a) {
		int r = 0,c = 0,n = a.length,m = a[0].length;
		boolean isRight = true;  //往右走代表从下至上
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
