package easy;

import java.util.Scanner;

/**
 * 在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以  上，它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，但是所有的乌龟却是一致——它们不到终点决不停止。

然而有些比赛相当漫长，全程观看会耗费大量时间，而小华发现只要在每场比赛开始后记录下兔子和乌龟的数据——
兔子的速度v1（表示每秒兔子能跑v1  米），乌龟的速度v2，以及兔子对应的t，s值，
以及赛道的长度l——就能预测出比赛的结果。但是小华很懒，不想通过手工计算推测出比赛的结果，于是他找  到了你——清华大学计算机系的高才生——请求帮助，请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
输入
输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，
其中(v1,v2< =100;t< =300;s< =10;l< =10000且为v1,v2的公倍数) 
输出
输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，
分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。 

第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。 
样例输入
10  5  5  2  20 
样例输出
D
4
 * @author chen
 *
 */
public class Exam20 {
//	这个问题不是距离的问题,本质就是速度乘以时间 = 距离 ;不需要在意什么时候的距离,而是直接看重点的距离
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		int l = in.nextInt();
		int s1= 0,s2 = 0;// s1兔子走过的路程  s2 乌龟走过的路程
		int t1= 0,t2 = 0;  //兔子跑的时间  乌龟的时间
//		用来确定是哪个先跑到
		while(s1<l&& s2<l) {
			if(s1-s2<t) {
				t1++;
				t2++;
				s1 = v1*t1;
				s2 = v2*t2;
			}else {
				t2 += s;
				s1 = v1*t1;
				s2 = v2*t2;
			}
			
		
		}
		
		if(s1<s2) {
			System.out.println("T");
//			为什么不用t2的原因是,可能兔子睡着的时间还没完,乌龟早已经到了终点
			System.out.println(l/v2);
		}
		else if(s1>s2) {
			System.out.println("R");
//			兔子先到了 但是这里不能使用t1 ,因为兔子还没算上等待的时间,所以用乌龟的时间
			System.out.println(t2);
		}
		else {
			System.out.println("D");
			System.out.println(t2);
		}
		
	}
}
