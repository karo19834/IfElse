package fh.campus02.Livingroom;

public class bookcase {
    private int shelves;
    private String genre;
    private book[] books;

    public void  store () {
        System.out.println("I store books! ");
    }

    public bookcase(int shelves, String genre, book[] books) {
        this.shelves = shelves;
        this.genre = genre;
        this.books = books;
    }

    public int getShelves() {
        return shelves;
    }

    public String getGenre() {
        return genre;
    }

    public book[] getBooks() {
        return books;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBooks(book[] books) {
        this.books = books;
    } }


