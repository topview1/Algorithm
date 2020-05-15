package 查找;
/**
 * 有个排序后的字符串数组，其中散布着一些空字符串，编写一个方法，找出给定字符串索引（肯定不是空字符串的索引）
 * 比如  a “” ac "" ad b "" ba  
 * 找出b的字符串的索引
 * @author chen
 *
 */
public class 在有空的字符串中查找 {
//	二分查找
	public static int f(String[] a,int start,int end,String p) {
		while(start <= end) {
			int midIndex = start +((end- start)>>1);
			while(a[midIndex].equals("")) {
				midIndex++;
				//千万要注意,此时数组中没有这个值
				if(midIndex>end) {
					return  -1;
				}
			}
			if(a[midIndex].compareTo(p) >0) {
				end = midIndex-1;
			}else if(a[midIndex].compareTo(p) <0) {
				start = midIndex+1;
			}else {
				return midIndex;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String[] a = {"a","","ac","","ad","b","","ba"};
		System.out.println(f(a,0,a.length-1,"ab"));
		
	}

}
