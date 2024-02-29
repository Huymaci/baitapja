import hh.Circle;
import hh.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"Blue");
        System.out.println("Độ dài bán kính htron :"+ circle.getRadius());
        System.out.println("Màu htron :"+ circle.getColor());
        System.out.println("Diện tích htron :"+ circle.getA());
        System.out.println("Chu vi kính htron :"+ circle.getP());

        //Cylinder
        Cylinder cylinder = new Cylinder(4, "Red", 5);
        System.out.println("Độ dài bán kính htru :" + cylinder.getRadius());
        System.out.println("Màu của htru :" + cylinder.getColor());
        System.out.println("Độ dài chièu cao htru :" + cylinder.getHeight());
        System.out.println("Thể tích htru :" + cylinder.getV());
        System.out.println("Diện tích toàn phần htru :" + cylinder.getS());
    }
}
