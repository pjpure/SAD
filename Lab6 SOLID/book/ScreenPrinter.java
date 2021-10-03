package book;

public class ScreenPrinter {

    private Book book;

    public ScreenPrinter(Book book) {
        this.book = book;
    }

    public void printToScreen() {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
