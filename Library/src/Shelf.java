import java.util.ArrayList;

public class Shelf {

    private ArrayList<Release> releases;
    private int size;

    public Shelf(int size) {
        this.size = size;
        this.releases = new ArrayList<Release>(size);
    }

    public void setReleases(String title, String author, float price) {
        this.releases.add(new Release(title, author, price));
    }

    public ArrayList<Release> getReleases() {
        return releases;
    }

    @Override
    public String toString() {
        return "\n(dim: " + size + ") Pubblicazioni: " + "\n\t ==>" + releases ;
    }

}


