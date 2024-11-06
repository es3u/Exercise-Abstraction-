public class Book extends Product{

private String auther ;


    public Book() {

    }

    public Book(String name, double pricce, String auther) {
        super(name, pricce);
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public void position() {
        System.out.println("*Book*");
    }

    @Override
    public double discount() {
        setPricce(getPricce() * 0.50);
        return getPricce();
    }

    @Override
    public String toString() {
        return "Book{" +
                "auther='" + auther + '\'' +
                "} " + super.toString();
    }
}
