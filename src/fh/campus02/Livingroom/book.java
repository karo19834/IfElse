package fh.campus02.Livingroom;

public class book {
    private String author;
    private String title;
    private int pages;

    public book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
