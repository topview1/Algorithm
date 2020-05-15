package ×Ö·û´®;

public class »ØÎÄ´® {
	public static boolean isHuiwen(String a) {
		if("".equals(a)) {
			return true;
		}else {
			StringBuilder sb =  new StringBuilder(a);
			return a.equals(sb.reverse().toString());
		}
	}
	public static void main(String[] args) {
		String a = "acbca";
		System.out.println(isHuiwen(a));
	}
}
