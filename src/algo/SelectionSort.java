package algo;

/**
 * 选择排序
 * 原理：
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中找到最小（大）元素，然后存放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 *
 * 1、在**【L ... N-1】** 范围内找出最小项目 ** X ** 的位置
 * 2、用第 **L** 交换x，
 * 3、将下线 **L**增加1并重复步骤1直到 **L = N-2**
 *
 */
public class SelectionSort {

    public static void main(String[] args) {

    }

    public static void selectionSort(int[] array){
        for(int i = 0; i <array.length;i++){
            int index = i;
            for(int j = i ; j <array.length;j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }

            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

}
