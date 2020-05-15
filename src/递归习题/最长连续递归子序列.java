package 递归习题;

import java.util.Scanner;

import MyUtil.Utils;

/**
 * （1,9,2,5,7,3,4,6,8,0）中最长的递归子序列为（3,4,6,8）
 * @author chen
 *
 */
//运用快慢指针
public class 最长连续递归子序列 {
	public static int[] f(int[] a,int[] b) {
		int start = 0 ,end=0;
		int maxS=0,maxE = 0;
		int maxlength = 0;
		while(start<a.length && end+1<a.length) {
				while(end +1 != a.length&&a[end]<=a[end+1] ) {
					end++;
				
			}
			
			if(end-start +1>=maxlength) {
				maxlength = end-start+1;
				maxS = start;
				maxE = end;
			}
			
			//重新定位开始坐标
			start = end+1;
			end = end+1;
		}
		for(int j = 0,i=maxS;i<=maxE;i++,j++) {
			b[j] = a[i];
		}
		return b;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[5];
		Utils.CreateArray(a, in);
		Utils.printArray(f(a,b));
	}

}
