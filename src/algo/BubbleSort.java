package algo;

/**
 * 冒泡排序
 * 原理：
 * 1、如果元素大小关系不争取，交换这两个数
 * 2、比较一堆相邻元素(a,b)
 * 3、重复步骤1和2，直到我们到达数组的末尾
 * 4、到目前为止，最大的元素讲在最后的为止，然后我们将N减少1，并重复步骤1，直到n=1
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,2,1,6,9,7};
        bubbleSort(array);
        for(int i = 0 ; i < array.length;i++){
            System.out.print(array[i]+",");
        }
    }

    public static void bubbleSort(int array[]){
        int  t = 0;
        for(int i = 0 ; i< array.length -1 ;i++){
            for(int j = 0 ; j < array.length - 1 - i;j++){
                if(array[j] > array[j + 1]){
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

    }
}
