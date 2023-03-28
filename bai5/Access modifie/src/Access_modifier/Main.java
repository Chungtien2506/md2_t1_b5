package Access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        double radius = circle.getRadius();
        double area = circle.getArea();
        String color = circle.getColor();
        System.out.println("ban kinh:"+radius);
        System.out.println("dien tich:" +area);
        System.out.println("mau:"+color);
    }


}
