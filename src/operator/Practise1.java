package operator;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input your name here:");

        String name = input.next();

        System.out.println("Please input your age here:");

        String age = input.next();

        System.out.println("Please input your gender here");

        String gender = input.next();

        System.out.println("The computer recorded that:");

        System.out.println("Your name is :" + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your gender is:" + gender);

    }
}
