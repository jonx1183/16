package ArrayOpgaver;

public class Main {
  Et et = new Et();
  To to = new To();
  Tre tre = new Tre();
  public static void main(String[] args) {
    Main main = new Main();
    main.go();
  }

  public void go(){
    //et.addToArray();
    //to.intArray();
    //o.checkArray();
    //System.out.println(to.checkArray());
    //tre.array();
    tre.count();
  }

  @Override
  public String toString() {
    return "Main{" +
        "et=" + et +
        '}';
  }
}
