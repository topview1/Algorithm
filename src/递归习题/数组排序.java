package 递归习题;

public class 数组排序 {
	/**
	 * 划分成子问题 从后往前思考
	 * 对数组进行排序等价于  将[0,倒数第二个元素]进行排序,再把最后一个元素插入进去
	 * @param a 数组  k代表的是a的最后一个数组下标
	 * @return
	 */
	public static void sort(int a[],int k) {
		if(k == 0) {
			return;
		}
//		将[0,k-1]进行排序
		 sort(a,k-1);
//  将a[k]  插入到已经拍好序的数组中 (假设是从小到大排)
		 int value = a[k];
		 int index = k-1;
//		 使大于value都向后移动
		while(index >-1 && value < a[index]) {
			a[index+1] = a[index];
			index--;
		}
		a[index+1] = value;
	}
	public static void main(String []args) {
		int[] a = {1,2,3,4,5};
		sort(a,a.length-1);
		for(int b:a) {
			System.out.println(b);
		}
		
	}

}
