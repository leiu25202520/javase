package oob.oob0818;

public class Vehicle {
    public int speed;
    public int size;

    public void move(){

    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void speedUp(){
        this.speed++;
    }

    public void speedDown(){
        this.speed--;
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    @Override
    public String toString() {
        return "speed=" + speed +
                ", size=" + size;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(10,20);
        System.out.println(v.toString());

        v.speedDown();
        System.out.println(v.toString());

        v.setSpeed(20);
        v.speedUp();
        System.out.println(v.toString());

    }
}
