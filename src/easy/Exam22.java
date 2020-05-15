package easy;

import java.util.Scanner;

/**
 * 编写并测试如下函数：
void  Add  (int  a[],  int  m,  int  b[],  int  n);
该函数将数组b的前n个元素追加到数组a的前m个元素后，假定数组a具有
至少存放m+n个元素的空间。
例如，如果数组a为  {22,33,44,55,66,77,88,99}，数组b为{20,30,40,50,60,70,80,90}，
则调用Add(a,5,b,3)  后，将把数组a变为{22,33,44,55,66,20,30,40}。
注意数组b并没有改变，而且数组a中只需改变n个元素。
输入
4行。第一行为两个整数：m，n，并以空格隔开，
分别表示将要输入的数组a和数组b的元素的个数。第二行为m个整数，为数组a的元素；
第三行为n个整数，为数组b的元素。第四行为两个整数m1，n1，
表示把数组b的前n1个元素追加到数组a的前m1个元素后。 
输出
1行。为最后数组a中的元素，两个元素之间以逗号隔开。最后一个元素没有
样例输入
8 8
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
4 5
样例输出
1,2,3,4,9,10,11,12,13
 * @author chen
 *
 */
public class Exam22 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		int m = in.nextInt();  //a的个数
		int n = in.nextInt();  //b的个数
		int[] a = new int[m+n];
		int[] b = new int[n];
		
		for(int i = 0;i<m;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			b[i] = in.nextInt();
		}
		
		int m1 = in.nextInt();  //追加到a的前m1个元素后
		int n1= in.nextInt();  //b的前n个元素
		for(int j = 0;j<n1;j++) {
			a[m1] = b[j];
			m1++;
		}
		
	
		for(int i = 0;i<(m>m1?m:m1);i++) {
			if(i == 0) {
				System.out.print(a[i]);
			}else {
				System.out.print(","+a[i]);	
			}
			
			
		}
		
	}

}
