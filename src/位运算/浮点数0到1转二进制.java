package λ����;
/**
 * ����32λ���ERROR
 * @author chen
 *
 */
public class ������0��1ת������ {
	public static void main(String[] args) {
		double num = 0.625;
		StringBuilder sb = new StringBuilder("0.");
//		��������Ϊ�����Ƶķ����ǡ�2;
		while(num>0) {
			double r  = num*2;
//			���ڵ���1,���ַ�������1�����˻�-1
			if(r>=1) {
				sb.append("1");
				num = r-1;
			}else {
				sb.append("0");
				num = r;
			}
		}
		
//		
		if(sb.length() >34) {
			System.out.println("ERROR");
		}else {
			System.out.println(sb.toString());
		}
		
		
	}
}
