package 多维数组基础题;
/**
 * 给定一个数组arr，返回子数组的最大累加和，列如arr={1,-2,3,5,-2,6,-1}的所有子数组中
 * {3,5,-2,6}可以累加出最大的和为12,所以返回12
 * 所以返回12；
 * @author chen
 *
 */
public class 子数组的最大累加和 {
//	暴力解法O（n2） 
	public static int start = 0;
	public static int end = 0;
	public static int function1(int[] a) {
		int max = 0;
		for(int  i = 0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
				start = i;
				end = i;
			}
			int maxofj = a[i];
			for(int j = i+1;i<a.length-1&&j<a.length;j++) {
				maxofj  = maxofj+a[j];
				if(maxofj>max) {
					max = maxofj;
					start = i;
					end = j;
				}
			}
		}
		return max;
	}
	/**
	 * O（n） 规律法，丢弃相加为负数的数
	 * @param a
	 * @return
	 */
	public static int function2(int[] a) {
		int max  = a[0];
		int maxofj  = a[0];
		for(int j = 1;j<a.length;j++) {
			if(maxofj>0) {
				maxofj += a[j];
			}else {
				maxofj = a[j];
				start = j;
			}
			
			if(max<maxofj) {
				max = maxofj;
				end = j;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {1,-2,3,5,-2,6,-1};
		System.out.println(function2(a));
	}

}
