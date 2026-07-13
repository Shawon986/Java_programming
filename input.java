import java.util.Scanner;

public class input {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your name : ");
       String name = scan.nextLine();
       System.out.println("Hello " + name + "!!!");

       System.out.println("Enter your age :");;
       int age = scan.nextInt();
       System.out.println("Your age is : " + age);

       System.out.println("Enter your height :");
       float height = scan.nextFloat();
       System.out.println("Your height is :" + height);

       System.out.println("Enter your city :");
       String city = scan.nextLine();
       System.out.println("I live in :" + city);

       scan.close();


    }
}
