package easy;

import java.util.Scanner;

/**
 * 题目描述
平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。
对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出
两个矩形的交的面积。
输入
输入仅包含两行，每行描述一个矩形。 

在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用
两个绝对值不超过10^7的实数表示。
输出
输出仅包含一个实数，为交的面积，保留到小数后两位。 
样例输入
1  1  3  3 

2  2  4  4 
样例输出
1.00
 * @author chen
 *
 */
public class Exam8 {
	
	public static void main(String []args) {
		double temp;
		double[] x = new double[4];
		double[] y = new double[4];
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<=3;i++) {
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
		}
		if(x[2]>x[3])
	    {
	        temp=x[3];
	        x[3]=x[2];
	        x[2]=temp;
	    }
	    if(y[2]>y[3])
	    {
	        temp=y[3];
	        y[3]=y[2];
	        y[2]=temp;
	    }
	    if(x[0]>x[1])
	    {
	        temp=x[1];
	        x[1]=x[0];
	        x[0]=temp;
	     } 
	    if(y[0]>y[1])
	    {
	        temp=y[1];
	        y[1]=y[0];
	        y[0]=temp;
	    }
//	    在java中,数组是个对象,但是数组中的值是基本类型,调用外部的交换方法,不能交换
//		if(x[0] >x[1])  jiaohuan(x[0],x[1]);
//		if(y[0] >y[1])  jiaohuan(y[0],y[1]);
//		
//		if(x[2] >x[3])  jiaohuan(x[2],x[3]);
//		if(y[2] >y[3])  jiaohuan(y[2],y[3]);
		
		//不相交的地方
		if((y[2]>=y[1]) ||( x[2]>=x[1]) ||( y[0]>=y[3]) || (x[0]>=x[3])) {
			System.out.println("0.00");
		}
		// 分别对x和y进行正向排序  ,  相交的图像就等于排序后的中间两点组成的
//		冒泡排序
		else {
			for(int i = 0;i<3;i++) {
				for(int j = 0;j< 3-i;j++) {
					if(x[j]>x[j+1])
		            {
		                temp=x[j+1];
		                x[j+1]=x[j];
		                x[j]=temp;
		            }
		            if(y[j]>y[j+1])
		            {
		                temp=y[j+1];
		                y[j+1]=y[j];
		                y[j]=temp;
		            }
				}
			}
			System.out.printf("%.2f",(x[2]-x[1])*(y[2]-y[1]));
		}
	}

}
