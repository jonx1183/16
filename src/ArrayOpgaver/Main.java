package ArrayOpgaver;

public class Main {
  Et et = new Et();
  To to = new To();
  Tre tre = new Tre();
  Fire fire = new Fire();
  Fem fem = new Fem();
  Seks seks = new Seks();
  Ni ni = new Ni();
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
    //tre.count();
    //fire.createNormal();
    //fire.createReverse();
    //fem.addToArray();
    //fem.findSum();
    //seks.printMArray();
    ni.split();
    ni.printResults();
  }

  @Override
  public String toString() {
    return "Main{" +
        "et=" + et +
        ", to=" + to +
        ", tre=" + tre +
        ", fire=" + fire +
        ", fem=" + fem +
        ", seks=" + seks +
        ", ni=" + ni +
        '}';
  }
}
