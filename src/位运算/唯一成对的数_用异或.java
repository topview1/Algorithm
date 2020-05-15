package 位运算;
/**
 * 1-1000这1000个值放在10001个数组空间中,最后一个值存随机数(1-1000) 在
 * 不用辅助存储空间,把重复两次的数字找出来
 * @author chen
 *
 */
public class 唯一成对的数_用异或 {
	
	public static void main(String []args) {
		int N = 11;
		int[]  arr = new int[N];
//		1.准备数据
		for(int i = 0;i<N-1;i++) {
			arr[i] = i+1;
		}
//		2.准备最后一个位置存随机数
		arr[arr.length-1] =(int) ((N-1)*Math.random()+1);
		
//  3.用异或解决问题:异或运算满足交换律、结合律。
//		所以，1^2^...^n^...^n^...^1000，无论这两个n出现在什么位置，都可以转换成为1^2^...^1000^(n^n)的形式。
//		所以讲 (1^2^...^n^...^n^...^1000)^(1^2^...^n^...^...^1000)  成双的都异或为0,只剩下最后的n
		
		int  result = 0;
		for(int i = 0;i<arr.length;i++) {
			result = result^arr[i];
		}
		
		for(int i =1;i<N;i++) {
			result = result^i;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(result);
	}

}
