package lsp;

public class Square extends Rectangle {

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
