package λ����;
/**
 * ������ֻ��һ����������1��,���������������k��,�����ֻ��1�ε���
 * @author chen
 *
 */
public class ����k�κͳ���1�� {
//	˼·: 10����10������� ����λ�Ļ� ���Ϊ0
//             2����2������� ����λ�Ļ� ���Ϊ0
//	       �Ƶ�:  k����k�������  ����λ  ���Ϊ0
//      ���԰����е���ת��Ϊk����,�������,����Ǹ������ǳ���1�ε� 
	public static void main(String[] args) {
		int[] arr = {5,6,5,6,5,6,5,6,199};
		int  k = 4;
		int len = arr.length;
		char[][] addForm = new char[len][];
		int  maxlen = 0;
		for(int i= 0;i<len;i++) {
//			1.ת��Ϊk����,����ӷ���
		addForm[i] =  new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
		if(addForm[i].length>maxlen) {
		maxlen = addForm[i].length;
		}
		}
//  2.������λ������
		int[] resArr = new int[maxlen];
		for(int i = 0;i<len;i++) {
			for(int j = 0;j<maxlen;j++) {
//				����ӷ���,��Ϊ�Ƿ�ת��,��λû��maxlen���,֮�ͼ���0
				if(j >=addForm[i].length ) {
					resArr[j] += 0;
				}else {
					resArr[j] += addForm[i][j]-'0';
				}
			}
			
		}
		
//		3.��֮��ȡ����û�н�λ�ĺ�
		int add = 0;
		for(int i = 0;i<resArr.length;i++) {
//			4.��Ϊ�Ƿ�ת������2������,���������±���Ƕ�Ӧ���ݴ�
			add += (resArr[i]%k)*(int)(Math.pow(k, i));
		}
		
		System.out.println(add);

	}

}
