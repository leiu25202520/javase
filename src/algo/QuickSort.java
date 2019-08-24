package algo;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3,5,2,1,9,7,14,11,10};
        print(array);
        quickSort(array,0,array.length-1);
        print(array);
    }

    public static int[] quickSort(int[] array,int start, int end){
        if(array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array,start,end);

        if(smallIndex > start){
            quickSort(array,start,smallIndex - 1);
        }
        if(smallIndex < end){
            quickSort(array,smallIndex+1,end);
        }

        return array;

    }


    public static int partition(int a[], int i, int j) {
        int pivot = a[i]; // pivot 是轴心点
        int smallIndex = i; // S1 和 S2 一开始是空的，smallIndex ,存储位置
        for (int k = i+1; k <= j; k++) { // 探索未知的区域
            if (a[k] < pivot) { // case 2
                smallIndex++;
                swap(a,k, smallIndex);
            } // 注意：在情况1的时候我们什么不做: a[k] >= pivot
        }
        swap(a,i, smallIndex); // 最后一步, 用a[smallIndex]交换枢纽
        return smallIndex; // 返回枢纽的指数, 用于快速排序（Quick Sort）
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    /*
        打印当前数组
     */
    public static void print(int[] array){
        for(int i = 0 ; i < array.length;i++ ){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
