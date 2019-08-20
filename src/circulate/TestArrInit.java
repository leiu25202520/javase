package circulate;

public class TestArrInit {
    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i]+" ");
            a[i] = i;
            System.out.print(a[i]+" ");
        }

        System.out.println("");
        System.out.println("-----");
        int  b[] = new int[10];
        for(int i = 0 ; i < a.length; i++){
            b[i] = i+10;
            System.out.print(b[i]+" ");
        }

    }
}
