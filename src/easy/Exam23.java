package easy;

import java.util.Scanner;

/**
 * Torry从小喜爱数学。一天，老师告诉他，  像2、3、5、7……这样的数叫做质数。
 * Torry突然想到一个问题，前10、100、1000、10000……个质数的乘积是多少呢？
 * 他把这个问题告诉  老师。老师愣住了，一时回答不出来。于是Torry求助于会编程的你，
 * 请你算出前n个质数的乘积。不过，考虑到你才接触编程不久，
 * Torry只要你算出这个数模上50000的值。
输入
仅包含一个正整数n，其中n< =100000。 
输出
输出一行，即前n个质数的乘积模50000的值。 
样例输入
1 
样例输出
2
 * @author chen
 * 为什么不一起乘积算 ,因为提前进行模，否则会溢出
 * 易错点 ...   (a * b) % p = (a % p * b % p) % p
 *
 */
public class Exam23 {
	public static void main(String [] args) {
		 int count=0;
	        Scanner in=new Scanner(System.in);
	        long  n=in.nextLong();//前n个质数
	        long sum=1;
	        for(int i=2;;i++){
	            int ok=0;
	            for(int j=2;j*j<=i;j++){
	                if(i%j==0){ok=1;break;}//如果不是质数，就标记为ok=1
	            }
	            if(ok==0){sum=(sum%50000*i%50000)%50000;count++;}//如果是质数，让他参与运算，这是个公式，记住即可
	            if(count==n)break;
	        }
	        System.out.println(sum);
	}

}
