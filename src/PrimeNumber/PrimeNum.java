package PrimeNumber;

public class PrimeNum {
  private int number = 3;
  private boolean isPrimeNumber = true;

  public static void main(String[] args) {
    PrimeNum main = new PrimeNum();
    main.go();
  }

  public void go(){
    System.out.println(isPrime());

  }
  public boolean isPrime(){
    if(number > 1){
      for(int i = 2; i<number; i++){
        if(number%i ==0){
          isPrimeNumber = false;
        }
      }
    }

    return isPrimeNumber;
  }
}
