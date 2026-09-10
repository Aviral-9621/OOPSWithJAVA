
import java.util.Scanner;

class BusBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableSeats = 10;

        try {
            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new Exception("Invalid age! Age must be greater than 0.");
            }

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (seats <= 0) {
                throw new Exception("Invalid number of seats! Seats must be greater than 0.");
            }

            if (seats > availableSeats) {
                throw new Exception("Insufficient seats! Only "
                        + availableSeats + " seats are available.");
            }

            System.out.println("Booking successful!");
            System.out.println("Passenger age: " + age);
            System.out.println("Seats booked: " + seats);

            availableSeats = availableSeats - seats;

            System.out.println("Remaining seats: " + availableSeats);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

