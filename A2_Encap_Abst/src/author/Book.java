package author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", Author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }
    
    public class Main {
        public static void main(String[] args) {
            // Create an Author object
            Author author = new Author("J.K. Rowling", "jk.rowling@example.com", 'F');

            // Create a Book object
            Book book = new Book("Harry Potter", author, 29.99, 100);

            // Print the details of the book, including the author
            System.out.println(book.toString());
        }
    }
}



