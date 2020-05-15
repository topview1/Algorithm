package 查找;

import java.util.Scanner;

import MyUtil.Utils;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转，输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素，{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。，该数组的最小值为1
 * @author chen
 *
 */
public class 旋转数组的最小数字 {
	
	public static int GetMin(int[] numbers)
    {
        if (numbers == null || numbers.length <= 0)
        {
            return Integer.MIN_VALUE;
        }

        int index1 = 0;
        int index2 = numbers.length - 1;
        // 把indexMid初始化为index1的原因：
        // 一旦发现数组中第一个数字小于最后一个数字，表明该数组是排序的
        // 就可以直接返回第一个数字了
        int indexMid = index1;

        while (numbers[index1] >= numbers[index2])
        {
            // 如果index1和index2指向相邻的两个数，
            // 则index1指向第一个递增子数组的最后一个数字，
            // index2指向第二个子数组的第一个数字，也就是数组中的最小数字
            if (index2 - index1 == 1)
            {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            // 特殊情况：如果下标为index1、index2和indexMid指向的三个数字相等，则只能顺序查找
            if (numbers[index1] == numbers[indexMid] && numbers[indexMid] == numbers[index2])
            {
                return GetMinInOrder(numbers, index1, index2);
            }
            // 缩小查找范围
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

//	特殊情况的分析：如果下标为index1、index2和indexMid指向的三个数字相等
	//，则只能顺序查找，因此这里定义了一个GetMinInOrder()方法。
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
