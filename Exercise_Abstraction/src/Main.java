public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("******************Q1*************");

        Book b = new Book();

        b.position();
        b.setAuther("Essa");
        b.setName("the deasrt");
        b.setPricce(-100);

        System.out.println(b.toString());
        System.out.println("after discount :"+b.discount());


        Movie mo = new Movie();

        mo.position();
        mo.setName("Batman");
        mo.setPricce(-300);
        mo.setDirector("Essa almutiri(:");

        System.out.println(mo.toString());
        System.out.println("after discount :"+ mo.discount());



        System.out.println("******************Q2*************");
        MovablePoint m = new MovablePoint();

        m.setY(12);
        m.setySpeed(10);

        m.setY(10);
        m.setxSpeed(5);

        m.moveLeft();
        m.moveUP();
        m.moveLeft();
        m.moveRight();
        System.out.println(m.toString());
        System.out.println("***********************************************");


        MovablePoint m1 = new MovablePoint();

        m1.setY(-12);
        m1.setySpeed(-10);

        m1.setY(-10);
        m1.setxSpeed(-5);

        m1.moveLeft();
        m1.moveUP();
        m1.moveLeft();
        m1.moveRight();
        System.out.println(m1.toString());






    }
}