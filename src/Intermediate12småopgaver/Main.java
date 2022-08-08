package Intermediate12småopgaver;

public class Main {

  Et et = new Et();
  TreDog d = new TreDog();
  TreDog b = new Beagle();
  FireDog f1 = new FireDog("Sam");
  FireDog f2 = new FireDog("Roger");
  FemCandy candy1 = new FemCandy();
  FemCandy candy2 = new FemChocolate();

  public static void main(String[] args) {
    Main main = new Main();
    main.go();
  }

  public void go(){
    //et.talk("Test");
    //d.speak();
    //b.speak();

    System.out.println(candy1.taste());
    System.out.println(candy2.taste());

  }
}
