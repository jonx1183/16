package ArrayOpgaver;
import java.util.Arrays;
import java.util.Scanner;
public class Fire {

  Scanner sc = new Scanner(System.in);
  private int[] normalOrder = {0,0,0,0,0};

  private int len = normalOrder.length;
  private int[] reverseOrder = new int[len];


  public void createNormal(){
    for(int i = 0; i < normalOrder.length; i++ ){
      normalOrder[i] = sc.nextInt();
    }
  }

  public void createReverse(){

    for(int y = 0; y < len; y++){
      reverseOrder[y] = normalOrder[len - y - 1];

    }
    for(int r = 0; r < reverseOrder.length; r++){
      System.out.println(reverseOrder[r]);
    }
  }

  @Override
  public String toString() {
    return "Fire{" +
        "sc=" + sc +
        ", normalOrder=" + Arrays.toString(normalOrder) +
        ", reverseOrder=" + Arrays.toString(reverseOrder) +
        '}';
  }
}
