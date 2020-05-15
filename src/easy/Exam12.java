package easy;

import java.util.Scanner;

/**
Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。

比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。

所以，他迫切地需要一个系统，然后当他输入12  3456  7009时，会给出相应的念法：

十二亿三千四百五十六万七千零九

用汉语拼音表示为

shi  er  yi  san  qian  si  bai  wu  shi  liu  wan  qi  qian  ling  jiu

这样他只需要照着念就可以了。

你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。

注意必须严格按照规范，比如说“10010”读作“yi  wan  ling  yi  shi”而不是“yi  wan  ling  shi”，“100000”读作“shi  wan”而不是“yi  shi  wan”，“2000”读作“er  qian”而不是“liang  qian”。
 */
public class Exam12 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String digit[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        while(in.hasNext()) {
            String n = in.next();
            int cnt = n.length()%4;
            String tmp[] = {"0000","000","00","0"};
            n = tmp[cnt]+n;   //把输入的数字拼成4的整数倍长度
            String ans = "";
            int nzero = 0;   //记录连续0的个数
            for(int i =4-cnt;i<n.length();i++) {//4-cnt可定位到输入数字的第一位
                if(n.charAt(i) != '0') {
                        //遇到第一个非零数字，且有多个连续的0，且非零数字不在下一组的第一个位置，只需读出一个0
                    if(nzero>0 && i%4 != 0)
                        ans += "ling ";
                    nzero = 0;
                    if(i%4==0)  //千位
                        ans += digit[n.charAt(i)-'0'] + " qian ";
                    else if(i%4==1) //百位
                        ans += digit[n.charAt(i)-'0'] + " bai ";
                    else if(i%4==2) //十位
                        ans += digit[n.charAt(i)-'0'] + " shi ";
                    else    //个位
                        ans += digit[n.charAt(i)-'0'] + " ";
                }
                else
                        nzero++;
                if(n.length() - i == 5 && nzero < 4)//如果位于万位上且这一组的四个数字不全为0,需要加“wan”
                    ans += "wan ";
                else if(n.length() - i == 9)//如果位于亿位上，需要加“yi”
                    ans += "yi ";
            }
            if(ans.indexOf("yi shi") == 0)   //"yi shi"开头的话要去掉"yi "
                ans = ans.substring(3,ans.length());
            System.out.println(ans);
        }
        in.close();
    }

}
