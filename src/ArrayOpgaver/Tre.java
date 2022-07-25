package ArrayOpgaver;

import java.util.Scanner;

public class Tre {
  Scanner sc = new Scanner(System.in);
  private int[] intArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  private int x;
  private int pos;
  private int neg;
  private int odd;
  private int even;
  private int zero;

  public void array(){

  }

  public void count(){
for(int i = 0; i < intArray.length; i++){
  intArray[i] = x = sc.nextInt();

  if (intArray[i] > 0 && intArray[i] % 2 == 0) {
      pos++;
      even++;

    } else if (intArray[i] > 0 && intArray[i] % 2 == 1) {
      pos++;
      odd++;
    } else if (intArray[i] < 0 && intArray[i] % 2 == 0) {
      neg++;
      even++;
    } else if (intArray[i] < 0 && intArray[i] % 2 == -1) {
      neg++;
      odd++;
    } else if(intArray[i] == 0) {
    zero++;
  }
}
    System.out.println("Pos " + pos);
    System.out.println("neg " +neg);
    System.out.println("even " + even);
    System.out.println("odd " +odd);
    System.out.println("zero " +zero);
  }

}
