package ����ϰ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * ��ȫ����������һ��(n��)���֤���룬
 * ϣ�����������ڶ����ǽ��дӴ�С�����������ͬ���ڣ�
 * �����֤�����С��������
 * ���֤����Ϊ18λ��������ɣ���������Ϊ��7����14λ

���ݹ�ģ��Լ��
n< =100000

����
��һ��һ������n����ʾ��n�����֤���� 
���µ�n�У�ÿ��һ�����֤���롣 
���
���������ڴӴ�С���������֤�ţ�ÿ��һ�� 
��������
5 
466272307503271156 
215856472207097978 
234804580401078365 
404475727700034980 
710351408803093165 
�������
404475727700034980
234804580401078365
215856472207097978
710351408803093165
466272307503271156
 * @author chen
 *
 */
public class ���֤���� {
	static Comparator<String> com=new Comparator<String>(){
		 public int compare(String o1,String o2){
		  String s1=o1.substring(6, 14);  
		   String s2=o2.substring(6, 14);  
		        if(!s1.equals(s2)){
		         return s2.compareTo(s1);
		        }
		        else return o2.compareTo(o1);
		 }
		};
		 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 ArrayList<String> str=new ArrayList<String>();
		 for(int i=0;i<n;i++){
		  String s=in.next();
		  str.add(s);
		 }
		 Collections.sort(str,com);
		 for (int i = 0; i <str.size(); i++) {  
		        System.out.println(str.get(i));  
		     }  
		  }
}
