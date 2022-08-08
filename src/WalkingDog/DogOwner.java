package WalkingDog;

public class DogOwner {

  Dog d = new Dog();

  public boolean takeForAWalk(Dog d){
    if(d.needsToGo() == true){
      return true;
    }
    else return false;
  }
}
