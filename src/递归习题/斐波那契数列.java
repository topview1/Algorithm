package 递归习题;
/**
 * 斐波那契数列: 1   1  2 3  5  8 .....
 * 后一项等于前两项之和
 * 求得第n项的值
 * @author chen
 *
 */
public class 斐波那契数列 {
//	递归 =  直接值+小规模问题
//	递归 =  多个小规模的问题
	//找规律，列举法
	public static int fn(int n) {
		if(n==1 || n == 2) {
			return 1;
		}
		return fn(n-1)+fn(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fn(1));
		System.out.println(fn(2));
		System.out.println(fn(3));
		System.out.println(fn(4));
	}

}
