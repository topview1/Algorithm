package 递归习题;

public class 最大公约数 {
	/**
	 * 切蛋糕思维,就是把规模大的问题转为规模小的问题
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gongyue(int m,int n) {
		if(m%n == 0) {
			return n;
		}
		return gongyue(n,m%n);
	}
	
	public static void main(String[] args) {
		System.out.println(gongyue(28,12));
	}

}
