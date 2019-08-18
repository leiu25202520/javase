package oob.oob0818;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void display(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Person p = new Person("liulei435",35);
        p.display();
    }
}
