package easy;

import java.util.Scanner;

/**
Tom�������ڸ��о�������һ�Ź��ڻ���Ŀγ̣���һ������������Ϊͷ�ۣ�һ��Ⱦɫ�����г�ǧ���������ԣ����Ǵ�0��ʼ��ţ��������򣬼�ǧ���������ڡ�

����˵���ڶ�ѧ�������1234567009��λ���ϵļ��ʱ���⿴�������Ǻ���׼ȷ��������ġ�

���ԣ������е���Ҫһ��ϵͳ��Ȼ��������12  3456  7009ʱ���������Ӧ�����

ʮ������ǧ�İ���ʮ������ǧ���

�ú���ƴ����ʾΪ

shi  er  yi  san  qian  si  bai  wu  shi  liu  wan  qi  qian  ling  jiu

������ֻ��Ҫ������Ϳ����ˡ�

��������ǰ����������һ��ϵͳ������һ�����������ִ���������������Ķ�д�Ĺ淶תΪ����ƴ���ִ������ڵ�����������һ���ո���񿪡�

ע������ϸ��չ淶������˵��10010��������yi  wan  ling  yi  shi�������ǡ�yi  wan  ling  shi������100000��������shi  wan�������ǡ�yi  shi  wan������2000��������er  qian�������ǡ�liang  qian����
 */
public class Exam12 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String digit[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        while(in.hasNext()) {
            String n = in.next();
            int cnt = n.length()%4;
            String tmp[] = {"0000","000","00","0"};
            n = tmp[cnt]+n;   //�����������ƴ��4������������
            String ans = "";
            int nzero = 0;   //��¼����0�ĸ���
            for(int i =4-cnt;i<n.length();i++) {//4-cnt�ɶ�λ���������ֵĵ�һλ
                if(n.charAt(i) != '0') {
                        //������һ���������֣����ж��������0���ҷ������ֲ�����һ��ĵ�һ��λ�ã�ֻ�����һ��0
                    if(nzero>0 && i%4 != 0)
                        ans += "ling ";
                    nzero = 0;
                    if(i%4==0)  //ǧλ
                        ans += digit[n.charAt(i)-'0'] + " qian ";
                    else if(i%4==1) //��λ
                        ans += digit[n.charAt(i)-'0'] + " bai ";
                    else if(i%4==2) //ʮλ
                        ans += digit[n.charAt(i)-'0'] + " shi ";
                    else    //��λ
                        ans += digit[n.charAt(i)-'0'] + " ";
                }
                else
                        nzero++;
                if(n.length() - i == 5 && nzero < 4)//���λ����λ������һ����ĸ����ֲ�ȫΪ0,��Ҫ�ӡ�wan��
                    ans += "wan ";
                else if(n.length() - i == 9)//���λ����λ�ϣ���Ҫ�ӡ�yi��
                    ans += "yi ";
            }
            if(ans.indexOf("yi shi") == 0)   //"yi shi"��ͷ�Ļ�Ҫȥ��"yi "
                ans = ans.substring(3,ans.length());
            System.out.println(ans);
        }
        in.close();
    }

}
