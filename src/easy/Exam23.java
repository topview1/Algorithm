package easy;

import java.util.Scanner;

/**
 * Torry��Сϲ����ѧ��һ�죬��ʦ��������  ��2��3��5��7����������������������
 * TorryͻȻ�뵽һ�����⣬ǰ10��100��1000��10000�����������ĳ˻��Ƕ����أ�
 * ��������������  ��ʦ����ʦ�ס�ˣ�һʱ�ش𲻳���������Torry�����ڻ��̵��㣬
 * �������ǰn�������ĳ˻������������ǵ���ŽӴ���̲��ã�
 * TorryֻҪ����������ģ��50000��ֵ��
����
������һ��������n������n< =100000�� 
���
���һ�У���ǰn�������ĳ˻�ģ50000��ֵ�� 
��������
1 
�������
2
 * @author chen
 * Ϊʲô��һ��˻��� ,��Ϊ��ǰ����ģ����������
 * �״�� ...   (a * b) % p = (a % p * b % p) % p
 *
 */
public class Exam23 {
	public static void main(String [] args) {
		 int count=0;
	        Scanner in=new Scanner(System.in);
	        long  n=in.nextLong();//ǰn������
	        long sum=1;
	        for(int i=2;;i++){
	            int ok=0;
	            for(int j=2;j*j<=i;j++){
	                if(i%j==0){ok=1;break;}//��������������ͱ��Ϊok=1
	            }
	            if(ok==0){sum=(sum%50000*i%50000)%50000;count++;}//����������������������㣬���Ǹ���ʽ����ס����
	            if(count==n)break;
	        }
	        System.out.println(sum);
	}

}
