package lsp;

public class Square extends Quadrilateral {

    private int side;

    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getArea() {
        return side * side;
    }
}
