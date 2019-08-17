package circulate;

import com.sun.jmx.snmp.SnmpUnknownModelException;

import java.util.Scanner;

/**
 * For 循环实现Fibonacci数列
 */
public class Fibonacci {

    public  static void main(String[] args){
        Fib();
    }

    public static void Fib(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打印的斐波那契数列的个数");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("输入的n值错误！");
            return;
        }

        int fPrev = 1;
        int fNext = fPrev;
        int temp = 0;

        System.out.print("斐波那契数列为:");
        for(int i = 1; i< n;i++ ){
            if(i > 2){
                System.out.print(fNext + " ");
                temp = fPrev + fNext;
                fPrev = fNext;
                fNext = temp;
            }else{
                System.out.print(fNext + " ");
            }
        }


        System.out.println(fNext);

        System.out.println(" ");

        System.out.println(n + "对应的是" + fNext);
    }
}
