package easy;

import java.util.Scanner;

/**
 * ������ǰ��ʱ�䣬����Ӣ�ĵĶ���������������

ʱ����ʱh�ͷ�m��ʾ����Ӣ�ĵĶ����У���һ��ʱ��ķ����ǣ�

���mΪ0����ʱ��������Ȼ����ϡ�o'clock������3:00������three  o'clock����

���m��Ϊ0����ʱ��������Ȼ�󽫷ֶ���������5:30������five  thirty����

ʱ�ͷֵĶ���ʹ�õ���Ӣ�����ֵĶ���������0~20������

0:zero,  1:  one,  2:two,  3:three,  4:four,  5:five,  6:six,  7:seven,  8:eight,  9:nine,  10:ten,  11:eleven,  12:twelve,  13:thirteen,  14:fourteen,  15:fifteen,  
16:sixteen,  17:seventeen,  18:eighteen,  19:nineteen,  20:twenty��

30����thirty��40����forty��50����fifty��

���ڴ���20С��60�����֣����ȶ���ʮ������Ȼ���ټ��ϸ�λ������31���ȶ�30�ټ�1�Ķ�����������thirty  one����

������Ĺ���21:54������twenty  one  fifty  four����9:07������nine  seven����0:15������zero  fifteen����
����
������������Ǹ�����h��m����ʾʱ���ʱ�ͷ֡����������ǰû��ǰ��0��hС��24��mС��60�� 
���
���ʱ��ʱ�̵�Ӣ�ġ� 
��������
0 15 
�������
zero fifteen
 * @author chen
 *
 */
public class Exam19 {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		 String[]s = {"zero","one","two",  "three" , "four",  "five" , "six", "seven",  "eight",  "nine",  "ten",  "eleven",  "twelve",  "thirteen",  "fourteen",  "fifteen",  
				"sixteen",  "eventeen",  "eighteen",  "nineteen",  "twenty"};
		 String[] t = {"twenty","thirty","forty","fifty"};
		 if(m == 0) {
			 System.out.println(s[h]+" "+"o'clock");
		 }else {
			 if(h <= 20 && m<=20) {
				 System.out.println(s[h]+" "+s[m]);
			 }
			 else if(h>20 && m<=20) {
				 int q = h%20;
				 System.out.println("twenty"+" "+s[q]+" "+s[m]);
			 }
			 else if(h<= 20 && m>20) {
				 int q = m/10-2;
				 int r = m%10;
				 System.out.println(s[h]+" "+t[q]+" "+s[r]);
			 }
			 else if(h> 20 && m>20){
				 int q = h%20;
				 int p = m/10-2;
				 int r = m%10;
				 System.out.println("twenty"+" "+s[q]+" "+t[p]+" "+s[r]);
			 }
		 }
		
	}

}
