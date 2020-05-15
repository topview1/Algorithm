package easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 样例输入
7 
2 0 4 3 0 0 5
样例输出
2 4 3 5
4
 * @author chen
 *
 */
public class Exam21 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList list = new ArrayList();
		for(int i = 1;i<=n;i++) {
			list.add(in.nextInt());
		}
		
		for(int i = 0;i<list.size();i++) {
			if((int)list.get(i)==0) {
				list.remove(i);
				i--;
			}
		}
		
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println(list.size());
	}
}
