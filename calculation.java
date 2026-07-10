public class calculation {
    public static void main(String[]args){
        int a = 10, b = 13, c = 15;
        int sum = a+b+c;
        System.out.println("Sum = " + sum);

        float division = (float) a / b;
        System.out.println("Division = " + division);   

        int minus = c - a ;
        System.out.println("Minus = " + minus);

        int multiply = a * b;
        System.out.println("Multiply = " + multiply);

        int modulo = c % a;
        System.out.println("Modulo = " + modulo);

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);

        
    }
}
