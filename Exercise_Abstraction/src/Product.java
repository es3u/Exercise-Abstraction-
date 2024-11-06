public abstract class Product {

private String name ;
private double pricce ;


    public Product() {
    }

    public Product(String name, double pricce) {
        this.name = name;
        this.pricce = pricce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricce() {
        return pricce;
    }

    public void setPricce(double pricce) {
        try{
            if(pricce<0)
                throw new Exception("\"enter correct number\"");
            else
                 this.pricce = pricce;

        }catch (Exception e){
            System.out.println(e);
        }

    }


    public abstract double discount();

    public abstract void position();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", pricce=" + pricce +
                '}';
    }
}
