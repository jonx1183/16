package JavaCompoundOperators;
import java.util.Scanner;
public class JCO {
  private float input1;
  private float input2;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    JCO main = new JCO();

    main.go();
  }

  public void go(){
    add();
  }

  public void add(){
    System.out.print("First input: ");
    input1 = sc.nextFloat();
    System.out.print("Second input: ");
    input2 = sc.nextFloat();

     input1 = input1 + input2;

    System.out.println("input1 is now: " + input1);
  }
}
