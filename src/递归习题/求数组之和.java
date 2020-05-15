package 递归习题;

public class 求数组之和 {
	/**
	 * 找重复:这里的重复是 a[0]+(a[1]+....+a[n]) 
	 * 找变化:变化的量作为参数
	 * 找边界:也就是找出口
	 * @param a
	 * 划分法
	 */
	public static int  arrAdd(int[] a,int begin) {
		if(begin == a.length-1) {
			return  a[begin];
		}
		return a[begin]+arrAdd(a, begin+1);
	}
	public static void main(String[] args) {
		int[]  a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrAdd(a, 0));
	}
}
