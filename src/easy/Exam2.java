package easy;

import java.util.Scanner;

/**
 * 给定一个以秒为单位的时间t，要求用  “< H> :< M> :< S> ”
 * 的格式来表示这个时间。< H> 表示时间，< M> 表示分钟，
 *   而< S> 表示秒，它们都是整数且没有前导的“0”。
 * 例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
 * @author chen
 *输入
输入只有一行，是一个整数t（0< =t< =86399）。 
输出
输出只有一行，是以“< H> :< M> :< S> ”的格式所表示的时间，
不包括引号。 
样例输入
5436 
样例输出
1:30:36
 */
public class Exam2 {
	public static void main(String []args) {
		Scanner in  =  new Scanner (System.in);
		int time = in.nextInt();
		int h = time/(60*60);
//		剩余秒数,取余就是剩下的
		 time = time%3600;
		 int m = time/60;
		int s = time%60;
		System.out.println(h+":"+m+":"+s);
	}
}
