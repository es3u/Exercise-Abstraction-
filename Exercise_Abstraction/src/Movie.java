public class Movie extends Product{

   private String director;

    public Movie() {
    }

    public Movie(String name, double pricce, String director) {
        super(name, pricce);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void position() {
        System.out.println("*Movie*");
    }

    @Override
    public double discount() {

      setPricce(getPricce() *0.65);

        return getPricce();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                "} " + super.toString();
    }
}
