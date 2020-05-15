package �ݹ�ϰ��;

import java.util.Scanner;

/**
 * ��������������������ԭ��ܼ򵥣�
 * ����һ���������������½ڵ�ʱ��������ڵ�Ƚϣ�
 * ��С�򽻸������������������򽻸���������
������������ʱ����Ѹýڵ�����Ǹ�λ�á� 
���磬10  8  5  7  12  4  ������˳��Ӧ�ý��ɶ���������ͼ��ʾ��
����.��ʾ�հס�
...|-12
10-|
...|-8-|
.......|...|-7
.......|-5-|
...........|-4 
����ĿҪ�󣺸�����֪�����֣�������������������ڱ�׼�����
�����ӡ�ö������� 
����
��������Ϊһ�пո�ֿ���N��������  N< 100��ÿ�����ֲ�����10000�� 
����������û���ظ������֡�  
���
���������������ĺ����ʾ��Ϊ�˱����������ȶԿո����Ŀ��
��ѿո��þ����档
��������
10 5 20
�������
...|-20
10-|
...|-5

�û����룺
5 10 20 8 4 7
����������
.......|-20
..|-10-|
..|....|-8-|
..|........|-7
5-|
..|-4

����˼·��
����Ҷ�ӽڵ� ���඼�� -|
��������ϲ�����ͬһ�������� ��root��node֮������ӡʱ��|����.
 * @author chen
 *
 */
public class ��ӡ��������� {
	static class Node{
		//ֵ
		int data;
		Node left;
		Node right;
		//�����ֵ
		String s;
		public Node(int e){
			this.data=e;
		}
	}
	
	public static void main(String[] args) {
//		int[] n = { 34, 31, 36, 47, 23, 35, 41, 14, 12, 15, 7, 10, 8, 5, 12, 7, 3, 6 };
		int[] n=getInput();
		Node root=new Node(n[0]);
		root.s=root.data+"-|";
		
		for(int i=1;i<n.length;i++){
			Node node=new Node(n[i]);
			if(node.data>root.data){
				addRight(node, root,0);
			}else{
				addLeft(node,root,0);
			}
		}
		
		print(root);
	}
	/**
	 * ��������
	 * @return
	 */
	public static int[] getInput(){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String[] ss=s.split(" ");
		int[] nn=new int[ss.length];
		for(int i=0;i<ss.length;i++){
			nn[i]=Integer.parseInt(ss[i]);
		}
		return nn;
	}
	/**
	 * ��ӡ
	 * @param node ���ڵ�
	 */
	public static void print(Node node){
		//ʼ���ȴ�ӡ�ҽڵ㣬Ȼ���ӡ��������ӡ��ڵ�
		if(node.right!=null){
			print(node.right);
		}
		//���û���ӽڵ㣬�Ͳ���ӡ�����"-|��
		if(node.left==null&&node.right==null){
			System.out.println(node.s.substring(0, node.s.length()-2));
		}else{
			System.out.println(node.s);
		}
		if(node.left!=null){
			print(node.left);
		}
	}
	/**
	 * ����ҽڵ�
	 * @param node �ӽڵ�
	 * @param root ���ڵ�
	 * @param flag ���Ų���  ������ϲ���Ƿ�����һ������  1�������� 0��������
	 */
	public static void addRight(Node node,Node root,int flag){
		if(root.right==null){
			//[0-9]|- ��������ʽ�������ǣ�0-9�������ֺ�-
			node.s=root.s.replaceAll("[0-9]|-", ".").substring(0, root.s.length()-1);
			if(flag==0){
				int index=node.s.lastIndexOf("|");
				if(index!=-1){
					node.s=node.s.substring(0,index)+"."+node.s.substring(index+1);
				}
			}
			node.s+="|-"+node.data+"-|";
			
			root.right=node;
		}else if(node.data>root.right.data){
			addRight(node, root.right,0);
		}else{
			addLeft(node,root.right,1);
		}
	}
	/**
	 * �����ڵ�
	 * @param node �ӽڵ�
	 * @param root ���ڵ�
	 * @param flag ���Ų�����0 ֻ��һ�����ţ�1 �ж�����ţ�
	 */
	public static void addLeft(Node node,Node root,int flag){
		if(root.left==null){
			node.s=root.s.replaceAll("[0-9]|-", ".").substring(0, root.s.length()-1);
			if(flag==0){
				int index=node.s.lastIndexOf("|");
				if(index!=-1){
					node.s=node.s.substring(0,index)+"."+node.s.substring(index+1);
				}
			}
			node.s+="|-"+node.data+"-|";
			root.left=node;
		}else if(node.data>root.left.data){
			addRight(node, root.left,1);
		}else{
			addLeft(node,root.left,0);
		}
	}

}
