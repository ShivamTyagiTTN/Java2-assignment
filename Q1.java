//1. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

        import java.util.Scanner;

interface Details
{
    public void bookdetails(int book_no, String book_name, String issue_date);
    public void userdetails(int user_id, String user_name);
}

abstract class Book implements Details
{
    int book_no;
    String book_name;
    String issue_date;

    public void display()
    {
        System.out.println("\nBooks Details : ");
        System.out.println("Book Number : " + book_no);
        System.out.println("Book Name : " + book_name);
        System.out.println("Date of Issue : " + issue_date);
    }
}

class Library extends Book
{
    int user_id;
    String user_name;

    public void bookdetails(int book_no, String book_name, String issue_date){
        this.book_no = book_no;
        this.book_name = book_name;
        this.issue_date = issue_date;
    }

    public void userdetails(int user_id, String user_name){
        this.user_id = user_id;
        this.user_name = user_name;
    }

    public void display()
    {
        System.out.println("\nUser Details: ");
        System.out.println("User ID : " + user_id);
        System.out.println("User Name : " + user_name);

        super.display();
    }
}

class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int user_id,book_id;
        String book_name,user_name, issue_date;

        Book obj1 = new Library();

        System.out.print("\nEnter user id : ");
        user_id = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter user name : ");
        user_name = sc.nextLine();
        System.out.print("\nEnter book id : ");
        book_id = sc.nextInt();
        System.out.print("\nEnter book name : ");
        book_name = sc.next();
        sc.nextLine();
        System.out.print("\nEnter Date of isuue : ");
        issue_date = sc.nextLine();

        obj1.userdetails(user_id,user_name);
        obj1.bookdetails(book_id, book_name, issue_date);
        obj1.display();

    }
}