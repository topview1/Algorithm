package easy;

import java.util.Scanner;

/**
 * ��Ŀ����
ƽ�������������Σ����ǵı�ƽ����ֱ������ϵ��X���Y�ᡣ
����ÿ�����Σ����Ǹ�������һ����Զ�������꣬���������
�������εĽ��������
����
������������У�ÿ������һ�����Ρ� 

��ÿ���У��������ε�һ����Զ�������꣬ÿ��������궼��
��������ֵ������10^7��ʵ����ʾ��
���
���������һ��ʵ����Ϊ���������������С������λ�� 
��������
1  1  3  3 

2  2  4  4 
�������
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
//	    ��java��,�����Ǹ�����,���������е�ֵ�ǻ�������,�����ⲿ�Ľ�������,���ܽ���
//		if(x[0] >x[1])  jiaohuan(x[0],x[1]);
//		if(y[0] >y[1])  jiaohuan(y[0],y[1]);
//		
//		if(x[2] >x[3])  jiaohuan(x[2],x[3]);
//		if(y[2] >y[3])  jiaohuan(y[2],y[3]);
		
		//���ཻ�ĵط�
		if((y[2]>=y[1]) ||( x[2]>=x[1]) ||( y[0]>=y[3]) || (x[0]>=x[3])) {
			System.out.println("0.00");
		}
		// �ֱ��x��y������������  ,  �ཻ��ͼ��͵����������м�������ɵ�
//		ð������
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
