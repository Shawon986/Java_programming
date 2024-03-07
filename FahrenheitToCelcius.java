import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        System.out.println("Please input fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fahrenheit= input.nextDouble();
        double celcius = (9.0/5)*(fahrenheit-32);

        System.out.println("celcius:" + celcius);
    }
}
