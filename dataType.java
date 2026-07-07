public class dataType {
    public static void main(String[]args){
        int age = 25;
        String name = "John";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println(name.length());

        System.out.println(name.charAt(0));

        String name2 = name.replace("h", "n");
        System.out.println(name2);

        String name3 = "Shawon and John";
        System.out.println(name3.substring(7,10));

    }
}
