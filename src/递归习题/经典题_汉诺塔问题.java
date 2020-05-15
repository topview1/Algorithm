package 递归习题;
/**
 * 把1-N大小的盘从A移动到B,C做辅助(要求大盘必须在小盘下面),
 * 一次只能挪动一个盘
 * 
 * 看做递归问题：
 * 1.把 1-N-1 的盘移动到C ，N大小的盘还是在A上
 * 2.把N从A移动到B
 * 3. 把1-N-1 的盘从C移动到B
 * @author chen
 *
 */
public class 经典题_汉诺塔问题 {
	//用划分法
	/**
	 * 打印所有路径
	 * @param n  初始n个从小到大的盘子
	 * @param from  	原始柱子
	 * @param to		目标柱子
	 * @param help	辅助柱子
	 */
	public static void printSrc(int n,String from,String to,String help) {
		if(n == 1) {
			System.out.println("move"+n+"from"+from+"to"+to);
			return;
		}
		printSrc(n-1,from,help,to);  // 把n-1个盘子移动到空着的辅助位盘子上
		System.out.println("move"+n+"from"+from+"to"+to); //第n个盘子直接从from移动到目标盘
//		再把n-1个盘从空着的辅助位盘移动到目标盘
		printSrc(n-1,help,to,from); 
	}
	public static void main(String[] args) {
		printSrc(3,"A","B","C");
	}

}
