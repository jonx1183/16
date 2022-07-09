package AuthorAndBooks;

public class Book {
  private String name;
  private Author author;
  private double price;
  private int stock;

  Book(String name, Author author, double price){
    this.name = name;

    this.author = author;

    this.price = price;

  }

  Book(String name, Author author, double price, int stock){
    this.name = name;

    this.author = author;

    this.price = price;

    this.stock = stock;


  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author=" + author +
        ", price=" + price +
        ", stock=" + stock +
        '}';
  }
}
