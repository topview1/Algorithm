package λ����;

import java.util.Scanner;

/**
 * ��һ��if�������ж�һ�������ǲ���2�������η�
 * @author chen
 *
 */
public class �ǲ���2�������η� {
   public static void main(String[] args) {
//	 1. ���� 2�������η���ʲô�ص�== ���Ķ���������ֻ��1��1
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
//  2. n ��n-1 ��һ��������,�������0��˵������1��1
	   if((n&(n-1)) == 0) {
		   System.out.println("��2�������η�");
	   }
}
}
