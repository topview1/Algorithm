package easy;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成。利润低于或等于10万元时，
 * 奖金可提10%；利润高于10万元，低于20万元  时，
 * 低于10万元的部分按10%提成，高于10万元的部分，
 * 可提成7.5%；20万到40万之间时，
 * 高于20万元的部分，可提成5%；
 * 40万元到60万元  之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%；
 * 高于100万元时，超过100万元的部分按1%提  成。
 * 从键盘输入当月利润，求应发放奖金总数？
 * （保留两位小数）利润的大小在double以内
输入
利润
输出
应发奖金总数，保留两位小数
样例输入
210000 
样例输出
18000.00
 * @author chen
 *
 */
public class Exam10 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		double jj = in.nextDouble();
		int wanyuan = 10000;
		double ly = 0.0;
//		低于等于10万元
		if(jj<=10*wanyuan) {
			ly = jj*0.1;
		}
//		利润高于10万元，低于20万元  时，
//		低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		if(jj>10*wanyuan && jj<=20*wanyuan) {
			ly = 10*wanyuan*0.1+(jj-10*wanyuan)*0.075;
		}
		if(jj>20*wanyuan && jj<=40*wanyuan) {
			ly = 10*wanyuan*0.1+10*wanyuan*0.075+(jj-20*wanyuan)*0.05;
		}
		if(jj>40*wanyuan && jj<=60*wanyuan) {
			ly = 10*wanyuan*0.1+10*wanyuan*0.075+20*wanyuan*0.05+(jj-40*wanyuan)*0.03;
		}
		if(jj>60*wanyuan && jj<=100*wanyuan) {
			ly = 10*wanyuan*0.1+10*wanyuan*0.075+20*wanyuan*0.05+20*wanyuan*0.03+(jj-60*wanyuan)*0.015;
		}
		if(jj>100*wanyuan) {
			ly = 10*wanyuan*0.1+10*wanyuan*0.075+20*wanyuan*0.05+20*wanyuan*0.03+40*wanyuan*0.015+(jj-100*wanyuan)*0.01;
		}
		System.out.printf("%.2f",ly);
	}
}
