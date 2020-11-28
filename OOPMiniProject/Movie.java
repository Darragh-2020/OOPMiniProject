package OOPMiniProject;

//Movie.java
/*This is a generic instantiable class which represents a Movie object*/

public class Movie {
    private String title;
    private String director;
    private String genre;
    private String runtime;
    private double price;


    public Movie() {
        this("No title specified", "No director specified", "No genre specified", "No runtime specified", 0);
    }

    public Movie(String ttl, String dir, String gen, String run, double pri) {
        setTitle(ttl);
        setDirector(dir);
        setGenre(gen);
        setRuntime(run);
        setPrice(pri);
    }

    public void setTitle(String ttl) {
        title = ttl;
    }

    public void setDirector(String dir) {
        director = dir;
    }

    public void setGenre(String gen) {
        genre = gen;
    }

    public void setRuntime(String run) {
        runtime = run;
    }

    public void setPrice(double pri) {
        price = pri;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getRuntime() {
        return runtime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nTitle: " + getTitle() + "\nDirector: " + getDirector() +
        "\nGenre: " + getGenre() + "\nRuntime: " + getRuntime() + "\nPrice: " + getPrice();
    }
}