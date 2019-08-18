package oob.oob0818;

public class Circle {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){

        double area = Math.PI * r * r;

        return area;
    }

    public double getPerimeter(){
        double perimeter = Math.PI* r * 2;
        return  perimeter;
    }

}

class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setR(4);

        System.out.println("半径为:" + c.getR());
        System.out.println("面积:"+Math.rint(c.getArea()));
        System.out.println("周长:"+Math.rint(c.getPerimeter()));
    }
}
