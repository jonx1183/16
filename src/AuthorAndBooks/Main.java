package AuthorAndBooks;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();

    main.go();
  }

  public void go(){

    test();
  }

  public void test(){

    Author a1 = new Author("Ted", "Mail.test", 'M');

    a1.setEMail("TheGreatTed@test.com");

    Book bTest = new Book("Testo", a1, 24.99);

    System.out.println(bTest.getAuthor().getName());
  }

}


