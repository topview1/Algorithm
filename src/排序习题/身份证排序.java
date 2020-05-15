package 排序习题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 安全局搜索到了一批(n个)身份证号码，
 * 希望按出生日期对它们进行从大到小排序，如果有相同日期，
 * 则按身份证号码大小进行排序。
 * 身份证号码为18位的数字组成，出生日期为第7到第14位

数据规模和约定
n< =100000

输入
第一行一个整数n，表示有n个身份证号码 
余下的n行，每行一个身份证号码。 
输出
按出生日期从大到小排序后的身份证号，每行一条 
样例输入
5 
466272307503271156 
215856472207097978 
234804580401078365 
404475727700034980 
710351408803093165 
样例输出
404475727700034980
234804580401078365
215856472207097978
710351408803093165
466272307503271156
 * @author chen
 *
 */
public class 身份证排序 {
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
