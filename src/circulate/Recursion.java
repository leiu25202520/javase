package circulate;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    public static int fib(int n){
        if(n==1 || n ==2){
            return  1;
        }else{
            return fib(n-2)+ fib(n-1);
        }
    }
}
