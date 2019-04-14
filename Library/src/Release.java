public class Release {
    private String title;
    private String author;
    private int numberOfPages;
    private float price; //in EUR

    public Release(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numberOfPages = (int) (price / 0.10);
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "==> Titolo: " + title + ", Autore: " + author + ", Numero di pagine: " + numberOfPages + ", Prezzo: " + price;
    }
}


