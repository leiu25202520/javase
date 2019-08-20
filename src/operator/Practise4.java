package operator;

import java.util.Scanner;

public class Practise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个4位正整数:");

        int num = input.nextInt();

        int bit4 = num/1000;//得到千位数字
        int bit3 = num%1000/100;//得到百位数字
        int bit2 = num%1000%100/10;//得到十位数字
        int bit1 = num%1000%100%10;//得到个位数字


        bit4 = (bit4 + 5 ) % 10;
        bit3 = (bit3 + 5 ) % 10;
        bit2 = (bit2 + 5) % 10;
        bit1 = (bit1 + 5) % 10;

        int temp;
        temp = bit4;
        bit4 = bit1;
        bit1 = temp;


        temp = bit3;
        bit3 = bit2;
        bit2 = temp;

        int ennum = bit4*1000 + bit3 *100 + bit2 *10 + bit1;
        System.out.println("加密后的数值为:" + ennum);






    }
}
