class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize the attributes
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
        this.seatNumber = -1;  // Default seat number indicating unassigned
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (isBooked) {
            System.out.println("Ticket already booked for seat number: " + this.seatNumber);
        } else {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket successfully booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket is not booked yet.");
        }
    }
}

// Main class
public class prg4 {
    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 12.99);

        // Trying to display ticket details before booking
        ticket.displayTicketDetails();

        // Booking a ticket
        ticket.bookTicket(45);

        // Trying to book the same ticket again
        ticket.bookTicket(46);

        // Displaying ticket details after booking
        ticket.displayTicketDetails();
    }
}
