package easy;


import java.util.Scanner;


/**
 * 输入格式
　　一个数N表示测点编号。
输出格式
　　一个0~9的数。
样例输入
0
样例输出
X
{当且仅当输出仅有一个数X且X为0~9的数时你的得分不为零
，此时你的得分为系统根据你的输出而计算出的你本次的RP。}
 * @author chen
 *
 */
public class Exam15 {
	public static void main(String []args) {

		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0;i<a.length-1;i++) {
			for(int j =0;j<a.length - i-1;j++ ) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			}
		
		for(int b:a) {
			System.out.print(b+" ");
		}
		}
}
