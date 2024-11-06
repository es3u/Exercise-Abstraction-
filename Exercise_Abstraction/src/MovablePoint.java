public class MovablePoint implements Movable{

   private int x=0 ;
   private int y=0 ;

   private int xSpeed=0 ;
   private int ySpeed=0 ;


    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0){
            this.x =Math.abs(x);
        }else
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y<0){
            this.y =  Math.abs(y);

        }
        else this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        if(xSpeed<0){
            this.xSpeed =Math.abs(xSpeed);

        }
        else
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        if(ySpeed<0){
            this.ySpeed = Math.abs(ySpeed);


        }
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUP() {
       y = y + ySpeed;
        System.out.println("moveUp :" + y);
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
        System.out.println("moveUp :" + y);
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    System.out.println("moveRight:"+ x);
    }

    @Override
    public void moveLeft() {
        moveLeft :

        x = x - xSpeed;
        System.out.println( "moveLeft :"+ x);
    }

    @Override
    public void psition() {
        System.out.println("*MovablePoint*");
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
