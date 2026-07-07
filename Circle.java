public class Circle {
    public static void main(String[] args) {
        double radius;
        Circle(){

        }
        Circle(double newRadius){
            radius = newRadius;
        }

        double  getArea(){
            return radius * radius * 3.1415926;
        }
    }
}
 