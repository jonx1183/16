package Ø17;

public class Main {
  Election e = new Election();
  public static void main(String[] args) {
    Main main = new Main();

    main.go();
  }

  public void go(){
    e.createCandidate();
    System.out.println(e.getTotalVotes());
    e.getCandidatesFromParty();
  }
}
