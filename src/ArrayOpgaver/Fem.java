package ArrayOpgaver;
import java.util.Scanner;
public class Fem {
  private int sum;
  private int[] intArray = {0,0,0,0};
  Scanner sc = new Scanner(System.in);

  public void addToArray(){
    for(int i = 0; i<intArray.length;i++){
      intArray[i] = sc.nextInt();
    }


  }
  public void findSum(){
    for(int x = 0; x < intArray.length; x++){
      sum = sum + intArray[x];
    }
    System.out.println(sum);
  }
}
