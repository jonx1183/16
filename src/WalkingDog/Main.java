package WalkingDog;

public class Main {

  Dog d = new Dog();
  DogOwner dO = new DogOwner();
  public static void main(String[] args) {
    Main main = new Main();

    main.go();
  }
  public void go(){

    d.setDrinkTime(5);
    System.out.println(dO.takeForAWalk(d));
  }
}
