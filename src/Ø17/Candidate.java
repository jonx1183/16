package Ø17;

public class Candidate {
  private String name;
  private String party;
  private int numberOfVotes;

  Candidate(){
  }

  public String getName(){
    return name;
  }

  public String getParty(){
    return party;
  }

  public int getNumberOfVotes(){
    return numberOfVotes;
  }

  public void setName(String N){
    this.name = N;
  }

  public void setParty(String P){
    this.party = P;
  }

  public void setNumberOfVotes(int votes){
    this.numberOfVotes = votes;
  }
}
