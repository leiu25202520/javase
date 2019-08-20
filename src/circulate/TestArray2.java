package circulate;

import java.util.Scanner;

public class TestArray2 {
    public static void main(String[] args) {
        int[] a = {8,4,2,1,23,344,1};

        int sum  = 0;
        for(int i = 0; i< a.length;i++){
            System.out.print(a[i]+",");
            sum += a[i];
        }
        System.out.println("数组值和:"+sum);

        Scanner s = new Scanner(System.in);

        System.out.println("请输入任意数字，判断数组中是否包含此数");
        int num = s.nextInt();
        boolean isExist = false;
        for (int i=0;i<a.length;i++){
            if(num ==  a[i]){
                isExist = true;
                break;
            }
        }

        System.out.println(isExist ? "包含":"不包含");

    }
}
