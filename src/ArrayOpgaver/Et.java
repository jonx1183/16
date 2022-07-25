package ArrayOpgaver;
import java.util.Arrays;
import java.util.Scanner;
public class Et {
  Scanner sc = new Scanner(System.in);
  private int x;
  private int[] intArray = {0,0,0,0,0,0,0,0,0,0};

  public void addToArray(){
    intArray[0] = x = sc.nextInt();
    intArray[1] = x = sc.nextInt();
    intArray[2] = x = sc.nextInt();
    intArray[3] = x = sc.nextInt();
    intArray[4] = x = sc.nextInt();
    intArray[5] = x = sc.nextInt();
    intArray[6] = x = sc.nextInt();
    intArray[7] = x = sc.nextInt();
    intArray[8] = x = sc.nextInt();
    intArray[9] = x = sc.nextInt();
    for (int i = 0; i < intArray.length; i++ ){
      System.out.println(intArray[i]);
    }

  }

  @Override
  public String
  toString() {
    return "Et{" +
        "sc=" + sc +
        ", x=" + x +
        ", intArray=" + Arrays.toString(intArray) +
        '}';
  }
}
