package 递归习题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 路边有个死胡同，只能容一辆车通过，是临时的检查站，
 * 如图【p1.png】所示。

X星球太死板，要求每辆路过的车必须进入检查站，
也可能不检查就放行，也可能仔细检查。

如果车辆进入检查站和离开的次序可以任意交错。
那么，该车队再次上路后，可能的次序有多少种？

为了方便起见，假设检查站可容纳任意数量的汽车
这个问题就是出栈次序问题
比如 3辆车 就有5种可能性
 * @author chen
 *
 */
public class 出栈次序 {
	// a:等待进站的车辆数
		// b:站中的车辆数
		static int f(int a, int b) {
			if (a == 0)
				return 1; //如果全部进站了，则只有一种出站方式
			if (b == 0)
				return f(a - 1, 1);// 如果站中没有车，则让一辆车进栈
			return f(a - 1, b + 1) + f(a, b-1 );
			// 左边有一辆进栈的情况 + 栈中的开走了的情况
		}
	 
		public static void main(String[] args) {
			System.out.println(f(3, 0));
		}
}
