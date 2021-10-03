package lsp;

public class Main {

    private static final int width = 4;
    private static final int height = 5;
    private static final int side = 5;

    public static void main(String[] args) {
        Quadrilateral reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Quadrilateral reg2 = new Square(side);
        System.out.println("====   Square  ====");
        System.out.println("Side = " + side);
        System.out.println("Area = " + reg2.getArea());

    }
}
