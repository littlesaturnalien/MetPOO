package models;

public class Series {
    private String title = "Sandman";
    private int numSeasons = 3;
    private boolean delivered = false;
    private String genre = "Thriller";
    private String creator = "Karen Fonseca";

    public Series() {
    }

    public Series(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public Series(String title, int numSeasons, String genre, String creator) {
        this.title = title;
        this.numSeasons = numSeasons;
        this.genre = genre;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", numSeasons=" + numSeasons +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }
}
