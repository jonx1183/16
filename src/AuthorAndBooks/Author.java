package AuthorAndBooks;

public class Author {
  private String name;
  private String eMail;
  private char gender;



  Author(String name, String eMail, char gender){
    this.name = name;
    this.gender = gender;

  }





  public String getName(){
    return name;
  }

  public String getEMail(){
    return eMail;
  }

  public char getGender(){
    return gender;
  }

  public void setEMail(String mail){
    this.eMail = mail;
  }

  @Override
  public String toString() {
    return "Author{" +
        "name='" + name + '\'' +
        ", eMail='" + eMail + '\'' +
        ", gender=" + gender +
        '}';
  }
}
