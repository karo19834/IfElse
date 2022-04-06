package fh.campus02.Livingroom;

public class livingroom {
    public static void main(String[] args) {
        book orwell1984 = new book("George Orwell", "1984",320 );
        book annaKarenina = new book("Leo Tolstoy", "Anna Karenina", 1300);

        bookcase bookcase_ = new bookcase( 8,"Classic", new book []{orwell1984, annaKarenina});

        bookcase_.store();

    }
}
