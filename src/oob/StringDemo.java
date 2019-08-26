package oob;

import java.util.Scanner;

/*
*字符串比较的时候：
* == 比较的是地址
* equals：比较的具体的值
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "abc"; //指向常量池中的地址
        String str1 = str;
        System.out.println(str == str1);
        System.out.println(str.equals(str1));

       /* Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str == str2);
        System.out.println(str.equals(str2));*/

        String str3 = new String("abc"); //str3指向堆中的地址
        System.out.println(str == str3);
        System.out.println(str.equals(str3));

    }

}
