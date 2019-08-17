package circulate;

public class NineTable {

    public static void main(String[] args){


        leftUp();

        splitLine();

        leftDown();

        splitLine();

        rightUp();

        splitLine();

        rightDown();

    }

    //左上
    public static void leftUp(){
        for(int i = 1 ; i<10; i++){
            for(int j = 1; j <=i; j++){

                System.out.print(j+" * " +i + " = " + i*j + "\t");

                if(i == j){
                    System.out.println();
                }
            }
        }
    }

    //左下
    public static void leftDown(){
        for(int i = 1 ; i<10; i++){
            for(int j = i; j >=i && j < 10; j++){

                System.out.print(i+" * " +j + " = " + i*j + "\t");

                if(j == 9){
                    System.out.println();
                }
            }
        }
    }

    public static void splitLine(){
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public static void rightUp(){
        for(int i = 1 ; i<10; i++){
            for(int j = 1; j <10; j++){
                if(j < i){
                    System.out.print("         \t");
                }else{
                    System.out.print(i+" * " +j + " = " + i*j + "\t");
                }
                if (j == 9){
                    System.out.println();
                }
            }
        }

    }

    /**
     * 右下显示
     */
    public static void rightDown(){
        for(int i = 9 ; i>0; i--){
            for(int j = 1; j <10; j++){
                if(i > j){
                    System.out.print("         \t");
                }else{
                    System.out.print(i+" * " +j + " = " + i*j + "\t");
                }
                if (j == 9){
                    System.out.println();
                }
            }
        }
    }

}


