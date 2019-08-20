package operator;

public class Practise3 {
    public static void main(String[] args) {
        double money = 10000;
        System.out.println("本金：");

        System.out.println("活期1年的本金总计:"+ Math.round(money*(1+0.35/100)));
        System.out.println("定期1年的本金总计:"+ Math.round(money*(1+1.50/100)));
        System.out.println("活期2年的本金总计:"+ Math.round(money*(1+0.35*2/100)));
        System.out.println("定期2年的本金总计:"+ Math.round(money*(1+2.10*2/100)));

    }
}
