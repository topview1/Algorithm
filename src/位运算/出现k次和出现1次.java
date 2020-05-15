package 位运算;
/**
 * 数组中只有一个数出现了1次,其余的数都出现了k次,请输出只有1次的数
 * @author chen
 *
 */
public class 出现k次和出现1次 {
//	思路: 10进制10个数相加 不进位的话 结果为0
//             2进制2个数相加 不进位的话 结果为0
//	       推到:  k进制k个数相加  不进位  结果为0
//      所以把所有的数转换为k进制,进行相加,最后那个数就是出现1次的 
	public static void main(String[] args) {
		int[] arr = {5,6,5,6,5,6,5,6,199};
		int  k = 4;
		int len = arr.length;
		char[][] addForm = new char[len][];
		int  maxlen = 0;
		for(int i= 0;i<len;i++) {
//			1.转换为k进制,对齐加法线
		addForm[i] =  new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
		if(addForm[i].length>maxlen) {
		maxlen = addForm[i].length;
		}
		}
//  2.将各个位加起来
		int[] resArr = new int[maxlen];
		for(int i = 0;i<len;i++) {
			for(int j = 0;j<maxlen;j++) {
//				对齐加法线,因为是反转的,数位没有maxlen大的,之和加上0
				if(j >=addForm[i].length ) {
					resArr[j] += 0;
				}else {
					resArr[j] += addForm[i][j]-'0';
				}
			}
			
		}
		
//		3.将之和取余变成没有进位的和
		int add = 0;
		for(int i = 0;i<resArr.length;i++) {
//			4.因为是反转了整个2进制数,所以数组下标就是对应的幂次
			add += (resArr[i]%k)*(int)(Math.pow(k, i));
		}
		
		System.out.println(add);

	}

}
