package operator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径:");
        Scanner input = new Scanner(System.in);
        String r = input.next();
        double pi = 3.14;
        double R = Double.valueOf(r);
        double zc = 2 * 3.14 * R;
        double area = pi*R*R;

        System.out.println("该圆的半径为: R=" + R);

        System.out.println("该圆的周长为: C=2*3.14*"+R +"=" + zc);

        System.out.println("该圆的面积为: S=3.14*12.5*12.5="+area);

    }
}
