package 位运算;
/**
 * 大于32位输出ERROR
 * @author chen
 *
 */
public class 浮点数0到1转二进制 {
	public static void main(String[] args) {
		double num = 0.625;
		StringBuilder sb = new StringBuilder("0.");
//		浮点数化为二进制的方法是×2;
		while(num>0) {
			double r  = num*2;
//			大于等于1,在字符串后补上1并将乘积-1
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
