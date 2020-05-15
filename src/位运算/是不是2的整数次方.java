package 位运算;

import java.util.Scanner;

/**
 * 用一个if条件来判断一个整数是不是2的整数次方
 * @author chen
 *
 */
public class 是不是2的整数次方 {
   public static void main(String[] args) {
//	 1. 分析 2的整数次方有什么特点== 它的二进制里面只有1个1
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
//  2. n 与n-1 做一次与运算,如果等于0则说明含有1个1
	   if((n&(n-1)) == 0) {
		   System.out.println("是2的整数次方");
	   }
}
}
