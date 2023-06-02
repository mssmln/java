// Constructors are special methods invoked when an object is created and are used to initialize them.
// A constructor can be used to provide initial values for object attributes.
// A constructor name must be same as its class name.
// A constructor must have no explicit return type.
// You can think of constructors as methods that will set up your class by default, so you don’t need to repeat the same code every time.
// The constructor is called when you create an object using the new keyword.
// A single class can have multiple constructors with different numbers of parameters.
// The setter methods inside the constructors can be used to set the attribute values.
// Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.

// Your friend is a cashier at a movie theater. He knows that you are an awesome java developer so he asked you to help him out and create a program that gets movie title, row, and seat information and prints out a new ticket.
// Complete the existing code by adding a constructor to Ticket class so that it can be correctly initialized.

import java.util.Scanner;

class Constructors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;
    public Ticket(String movie, int row, int seat) {
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    }

    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}