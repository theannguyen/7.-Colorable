package BaiTap7.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 3.5);
        shapes[1] = new Square("black", false, 4.5);
        shapes[2] = new Square("blue", false, 5.0);

        System.out.println("Mảng có: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape x : shapes) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }
}
