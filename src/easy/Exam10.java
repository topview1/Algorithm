package easy;

import java.util.Scanner;

/**
 * ��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ��
 * �������10%���������10��Ԫ������20��Ԫ  ʱ��
 * ����10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣�
 * �����7.5%��20��40��֮��ʱ��
 * ����20��Ԫ�Ĳ��֣������5%��
 * 40��Ԫ��60��Ԫ  ֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
 * ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��  �ɡ�
 * �Ӽ������뵱��������Ӧ���Ž���������
 * ��������λС��������Ĵ�С��double����
����
����
���
Ӧ������������������λС��
��������
210000 
�������
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
//		���ڵ���10��Ԫ
		if(jj<=10*wanyuan) {
			ly = jj*0.1;
		}
//		�������10��Ԫ������20��Ԫ  ʱ��
//		����10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
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
