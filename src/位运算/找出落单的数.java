package 位运算;
/**
 * 一个数组都是出现过两次的数,找出那个唯一出现过一次的数
 * @author chen
 * 
 *
 */


public class 找出落单的数 {
 
	public static void main(String[] args) {
		int [] arr = {1,1,2,2,3,3,4,4,5};
		int result  = 0;
//	 直接对数组内部进行位运算,成对的会被消掉,成单的会保留
		for(int i = 0;i<arr.length;i++) {
			result = result^arr[i];
		}
		
		for(int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
		System.out.println();
		System.out.println(result);
	}
}
