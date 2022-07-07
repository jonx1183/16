package Ø17;
import java.util.ArrayList;
public class Election {
  private ArrayList<Candidate> candidateList = new ArrayList<>();
  private int totalVotes;

  public void createCandidate(){
    Candidate c1 = new Candidate();
    c1.setName("Sara");
    c1.setParty("Party1");
    c1.setNumberOfVotes(3);
    Candidate c2 = new Candidate();
    c2.setName("Josh");
    c2.setParty("Party1");
    c2.setNumberOfVotes(4);
    Candidate c3 = new Candidate();
    c3.setName("Paul");
    c3.setParty("Party2");
    c3.setNumberOfVotes(2);
    Candidate c4 = new Candidate();
    c4.setName("Jef");
    c4.setParty("Party2");
    c4.setNumberOfVotes(5);

    candidateList.add(c1);
    candidateList.add(c2);
    candidateList.add(c3);
    candidateList.add(c4);
  }

  public int getTotalVotes(){
    for(int i =0;i < candidateList.size(); i++){
      totalVotes = totalVotes + candidateList.get(i).getNumberOfVotes();
    }

    return totalVotes;

  }

  public String getCandidatesFromParty(){
    for(int i =0; i < candidateList.size(); i++){
     if(candidateList.get(i).getParty().equalsIgnoreCase("Party1")){
       System.out.println(candidateList.get(i).getName());
     }
     else if(candidateList.get(i).getParty().equalsIgnoreCase("Party2")){
       System.out.println(candidateList.get(i).getName());
     }
    }
    return "";
  }
}
