package ArrayOpgaver;

public class Seks {
  private int[][]mArray = {{2,3,2},{7,5,6}};

  public void printMArray(){
    for(int i = 0; i < mArray.length; i++){
      for(int x = 0; x < mArray[i].length; x++ ){
        System.out.println(mArray[i][x]);
      }
    }
  }
}
