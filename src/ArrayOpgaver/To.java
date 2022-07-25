package ArrayOpgaver;
import java.util.Scanner;
public class To {
  Scanner sc2 = new Scanner(System.in);
  private int[] intArray2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  private int x;

  public void intArray() {
    intArray2[0] = x = sc2.nextInt();
    intArray2[1] = x = sc2.nextInt();
    intArray2[2] = x = sc2.nextInt();
    intArray2[3] = x = sc2.nextInt();
    intArray2[4] = x = sc2.nextInt();
    intArray2[5] = x = sc2.nextInt();
    intArray2[6] = x = sc2.nextInt();
    intArray2[7] = x = sc2.nextInt();
    intArray2[8] = x = sc2.nextInt();
    intArray2[9] = x = sc2.nextInt();
  }

  public boolean checkArray() {
    System.out.print("Please enter a number to check:");
    x = sc2.nextInt();
    for (int i = 0; i < intArray2.length; i++) {
      if (x == intArray2[i]) {
        return true;
      } else return false;
    }
  return checkArray();
  }

}
