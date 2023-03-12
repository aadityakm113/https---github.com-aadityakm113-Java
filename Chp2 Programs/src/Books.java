//Program to implement a Book class that stores the details of a book such as its code, title and price (Use constructors to initialize the objects). 

public class Books {
    String isbn,bname,bauth,publication;
    int quantity;
    double price;

    Books()
    {
        this.isbn="1234567";
        this.bname="Harry Potter";
        this.bauth="J.K Rowling";
        this.publication="Penguin";
        this.quantity=1;
        this.price=300.00;

    }

    Books(String details[], int q, double p)
    {
        this.isbn=details[0];
        this.bname=details[1];
        this.bauth=details[2];
        this.publication=details[3];
        this.quantity=q;
        this.price=p;
    }
    void print()
    {
        System.out.println("Book Name: "+this.bname+"\nAuthor: "+this.bauth+"\nPublication: "+this.publication+"\nPrice: "+this.price);
    }

    public static void main(String[] args)
    {
        Books book=new Books();
        book.print();   
    }
}
