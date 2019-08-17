package circulate;

//问题：公鸡5文钱1只，母鸡3文钱1只，小鸡3只1文钱，100文钱买100只鸡，怎么买？
public class BuyChicken {

    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < 20 ;i++){
            for(int j = 0 ; j < 34;j++){
                for(int k = 0 ;k < 300 ; k++){

                    sum = i * 5 + j * 3 + (k / 3);
                    if(((i + j + k) == 100 ) && sum == 100 && (k % 3 ==0 )){
                        count++ ;
                        System.out.println("公鸡:" + i + ",母鸡:" + j + ",小鸡:" + k);
                    }
                }
            }
        }

        System.out.println("循环多少次：" + count);
    }
}
