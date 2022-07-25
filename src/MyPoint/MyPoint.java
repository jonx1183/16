package MyPoint;

public class MyPoint {
  private int x;
  private int y;
  private int disX;
  private int disY;
  //private int points;
  private int set;
  private MyPoint[] points;



  public static void main(String[] args) {
    MyPoint main = new MyPoint();

    main.go();
  }
  public void go(){
    test();

  }

  public void test(){


    MyPoint[] p1 = new MyPoint[1];

    MyPoint[] points= new MyPoint[1];
    for(int i = 0; i < points.length; i++) {
      System.out.println(points[i] = new MyPoint(1,1));
    }
   // System.out.println(p1.distance(5,6));
    //System.out.println(p1.distance(p2));
  }

  MyPoint(){

  }

  MyPoint(int x, int y){

  }

  public void setX(int posX){
    this.x = posX;
  }

  public void setY(int posY){
    this.y = posY;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void setXY(){
    setX(0);
    setY(0);
  }

  public double distance(int x, int y) {

    disX = this.x - x;
    disY = this.y - y;

    return Math.sqrt(disX*disX + disY*disY);
  }

  public double distance(MyPoint another){
    disX = this.x - another.x;
    disY = this.y - another.y;

    return Math.sqrt(disX*disX + disY*disY);

  }

  @Override
  public String toString() {
    return "MyPoint{" +
        "x=" + x +
        ", y=" + y +
        ", disX=" + disX +
        ", disY=" + disY +
        '}';
  }
}
