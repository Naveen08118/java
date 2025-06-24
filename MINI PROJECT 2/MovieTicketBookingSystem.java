import java.util.Scanner;

class Movie {
    private String name;
    private int availableSeats;

    public Movie(String name, int seats) {
        this.name = name;
        this.availableSeats = seats;
    }

    public String getName() {
        return name;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeats(int seatsToBook) {
        if (seatsToBook > 0 && seatsToBook <= availableSeats) {
            availableSeats -= seatsToBook;
            return true;
        }
        return false;
    }
}

class Booking {
    private String movieName;
    private int bookedSeats;
    private double totalPrice;

    public Booking(String movieName, int bookedSeats, double pricePerTicket) {
        this.movieName = movieName;
        this.bookedSeats = bookedSeats;
        this.totalPrice = bookedSeats * pricePerTicket;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some movie objects
        Movie movie1 = new Movie("The Matrix", 100);
        Movie movie2 = new Movie("Inception", 80);

        Movie[] movies = {movie1, movie2};

        while (true) {
            System.out.println("\nAvailable Movies:");
            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i].getName() + " - Available Seats: " + movies[i].getAvailableSeats());
            }

            System.out.print("Enter the number of the movie you want to book (or 0 to exit): ");
            int movieChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (movieChoice == 0) {
                break;
            }

            if (movieChoice < 1 || movieChoice > movies.length) {
                System.out.println("Invalid movie choice.");
                continue;
            }

            Movie selectedMovie = movies[movieChoice - 1];

            System.out.print("Enter the number of seats you want to book: ");
            int numSeats = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (selectedMovie.bookSeats(numSeats)) {
                System.out.print("Enter the price per ticket: ");
                double pricePerTicket = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                Booking booking = new Booking(selectedMovie.getName(), numSeats, pricePerTicket);

                System.out.println("\nBooking Confirmation:");
                System.out.println("Movie: " + booking.getMovieName());
                System.out.println("Seats Booked: " + booking.getBookedSeats());
                System.out.println("Total Price:in rupees =" + booking.getTotalPrice());
            } else {
                System.out.println("Not enough seats available.");
            }
        }

        System.out.println("Thank you for using the movie ticket booking system!");
        scanner.close();
    }
}