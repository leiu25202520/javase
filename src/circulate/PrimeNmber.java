package circulate;

public class PrimeNmber {
    public static void main(String[] args) {

        for(int i = 1; i<= 100 ;i++){
            if(isPrime(i)){
                System.out.print(i+",");
            }
        }
    }

    static boolean isPrime(int num){
        for(int i = 2;i<num-1;i++){
            if(num % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
