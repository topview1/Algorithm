package ����;

import java.util.Scanner;

import MyUtil.Utils;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ����������������һ����ת��
 * �����ת�������СԪ�أ�{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�������������СֵΪ1
 * @author chen
 *
 */
public class ��ת�������С���� {
	
	public static int GetMin(int[] numbers)
    {
        if (numbers == null || numbers.length <= 0)
        {
            return Integer.MIN_VALUE;
        }

        int index1 = 0;
        int index2 = numbers.length - 1;
        // ��indexMid��ʼ��Ϊindex1��ԭ��
        // һ�����������е�һ������С�����һ�����֣������������������
        // �Ϳ���ֱ�ӷ��ص�һ��������
        int indexMid = index1;

        while (numbers[index1] >= numbers[index2])
        {
            // ���index1��index2ָ�����ڵ���������
            // ��index1ָ���һ����������������һ�����֣�
            // index2ָ��ڶ���������ĵ�һ�����֣�Ҳ���������е���С����
            if (index2 - index1 == 1)
            {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            // �������������±�Ϊindex1��index2��indexMidָ�������������ȣ���ֻ��˳�����
            if (numbers[index1] == numbers[indexMid] && numbers[indexMid] == numbers[index2])
            {
                return GetMinInOrder(numbers, index1, index2);
            }
            // ��С���ҷ�Χ
            if (numbers[indexMid] >= numbers[index1])
            {
                index1 = indexMid;
            }
            else if (numbers[indexMid] <= numbers[index2])
            {
                index2 = indexMid;
            }
        }

        return numbers[indexMid];
    }

//	��������ķ���������±�Ϊindex1��index2��indexMidָ��������������
	//����ֻ��˳����ң�������ﶨ����һ��GetMinInOrder()������
    public static int GetMinInOrder(int[] numbers, int index1, int index2)
    {
        int result = numbers[index1];
        for (int i = index1 + 1; i <= index2; ++i)
        {
            if (result > numbers[i])
            {
                result = numbers[i];
            }
        }

        return result;
    }
    
   public static void main(String[] args) {
	   int[] a = {4,5,1,2,3};
	System.out.println(GetMin(a));
}
}
