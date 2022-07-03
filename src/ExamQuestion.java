import java.util.Random;
import java.util.ArrayList;
import java.io.PrintStream;
import java.io.FileNotFoundException;
public class ExamQuestion {

  private int number;
  private char grade;
  private int sumA;
  private int sumB;
  private int sumC;
  private int sumD;
  private int sumE;
  private int sumF;
  private String grading;
  private String destination;
  Random rnd = new Random();
  ArrayList<ExamQuestion> qList = new ArrayList<>();

  public static void main(String[] args) {
    ExamQuestion main = new ExamQuestion();
    main.go();
  }

  public void go(){
    randomGrade();
    makeQuestion();
    printQuestions();
    writeToFile();
    gradeSum();
  }
  public char randomGrade(){
    grading ="ABCDEF";
    for(int i = 0; i < 1; i++ ){
      grade = grading.charAt(rnd.nextInt(grading.length()));
    }
    if (grade == 'A'){
      sumA++;
    }
    else if(grade == 'B'){
      sumB++;
    }
    else if(grade == 'C'){
      sumC++;
    }
    else if(grade == 'D'){
      sumD++;
    }
    else if (grade == 'E'){
      sumE++;
    }
    else if(grade == 'F'){
      sumF++;
    }
    return grade;
  }

  ExamQuestion(){
  }

  public void makeQuestion(){
    ExamQuestion q1 = new ExamQuestion();
    q1.setNumber(1);
    q1.setGrade(randomGrade());
    qList.add(q1);

    ExamQuestion q2 = new ExamQuestion();
    q2.setNumber(2);
    q2.setGrade(randomGrade());
    qList.add(q2);

    ExamQuestion q3 = new ExamQuestion();
    q3.setNumber(3);
    q3.setGrade(randomGrade());
    qList.add(q3);

    ExamQuestion q4 = new ExamQuestion();
    q4.setNumber(4);
    q4.setGrade(randomGrade());
    qList.add(q4);

    ExamQuestion q5 = new ExamQuestion();
    q5.setNumber(5);
    q5.setGrade(randomGrade());
    qList.add(q5);

    ExamQuestion q6 = new ExamQuestion();
    q6.setNumber(6);
    q6.setGrade(randomGrade());
    qList.add(q6);

    ExamQuestion q7 = new ExamQuestion();
    q7.setNumber(7);
    q7.setGrade(randomGrade());
    qList.add(q7);

    ExamQuestion q8 = new ExamQuestion();
    q8.setNumber(8);
    q8.setGrade(randomGrade());
    qList.add(q8);

    ExamQuestion q9 = new ExamQuestion();
    q9.setNumber(9);
    q9.setGrade(randomGrade());
    qList.add(q9);

    ExamQuestion q10 = new ExamQuestion();
    q10.setNumber(10);
    q10.setGrade(randomGrade());
    qList.add(q10);

    ExamQuestion q11 = new ExamQuestion();
    q11.setNumber(11);
    q11.setGrade(randomGrade());
    qList.add(q11);

    ExamQuestion q12 = new ExamQuestion();
    q12.setNumber(12);
    q12.setGrade(randomGrade());
    qList.add(q12);

    ExamQuestion q13 = new ExamQuestion();
    q13.setNumber(13);
    q13.setGrade(randomGrade());
    qList.add(q13);

    ExamQuestion q14 = new ExamQuestion();
    q14.setNumber(14);
    q14.setGrade(randomGrade());
    qList.add(q14);
  }

  public void printQuestions(){
    for(int i = 0; i < qList.size(); i++){
      System.out.println(qList.get(i) + "\n");
    }
  }

  public void writeToFile(){
    destination ="question.txt";

    try(PrintStream ps = new PrintStream(destination)){
      for(int i = 0; i < qList.size(); i++){
        ps.println(qList.get(i) + "\n");
      }
    }catch(FileNotFoundException e){
      System.out.println("Error");
    }
  }

  public void gradeSum(){

    System.out.println("Sum af A = " + sumA);
    System.out.println("Sum af B = " +sumB);
    System.out.println("Sum af C = " +sumC);
    System.out.println("Sum af D = " +sumD);
    System.out.println("Sum af E = " +sumE);
    System.out.println("Sum af F = " +sumF);
  }

  public void setNumber(int n){
    this.number = n;
  }

  public void setGrade(char g){
    this.grade = g;
  }

  @Override
  public String toString() {
    return "questionNumber=" + number +
        ", grade=" + grade;
  }
}
