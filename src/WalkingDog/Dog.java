package WalkingDog;

public class Dog {

  private int drinkTime;

  public void setDrinkTime(int dT){
    this.drinkTime = dT;
  }

  public int getDrinkTime(){
    return drinkTime;
  }


  public boolean needsToGo(){
    if(drinkTime > 4){
      return true;
    }

    else return false;

  }

}
